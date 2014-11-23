package com.test.initialisation;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.springframework.core.io.Resource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * To initialize the test Database Schema
 * 
 * @author ASERROUK
 * @date 27/06/2013
 * 
 */
public class PhenixInitializerTest {

    private static final Logger LOG = Logger.getLogger(PhenixInitializerTest.class);

    /** Phenix data source. */
    private transient DataSource dataSource;

    /** Phenix data source Reference. */
    // private transient DataSource dataSourceRef;

    /** The list of script files. */
    private transient Resource[] initScripts;

    /** Transaction manager */
    private transient PlatformTransactionManager transactionManager;

    /**
     * Initialization data.
     * 
     */
    @PostConstruct
    public final void init() {
        Assert.notNull(dataSource, "Can't initialize the database: the data source is null");
        initialize();
    }

    /**
     * Execute the script referenced by <code>scriptResource</code>.
     * 
     * @param scriptResource
     *            the resource that contains the sql commands.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void doExecuteScript(final Resource scriptResource) {
        if (scriptResource == null) {
            return;
        }
       // LOG.info("**********************\nExecuting script : "+scriptResource+"\n**********************\n");
        System.out.println("**********************\nExecuting script : "+scriptResource+"\n**********************\n");
        final TransactionTemplate transactionTemplate = new TransactionTemplate(transactionManager);
        transactionTemplate.execute(new TransactionCallback() {
            public Object doInTransaction(final TransactionStatus status) {
                String[] scripts = null;
                try {
                    scripts = StringUtils.delimitedListToStringArray(
                            stripComments(IOUtils.readLines(scriptResource.getInputStream())),
                            ";" + System.getProperty("line.separator"));
                } catch (IOException e) {
                    //LOG.error("Can't read the file: " + scriptResource.getFilename());
                    System.out.println("Can't read the file: " + scriptResource.getFilename());
                }
                if (ArrayUtils.isNotEmpty(scripts)) {
                    Statement statement = null;
                    try {
                        statement = dataSource.getConnection().createStatement();
                        for (String script2 : scripts) {
                            String script = script2.trim();

                            if (StringUtils.hasText(script)) {
                                try {
                                    //LOG.info(script);
                                	System.out.println(script);
                                    statement.execute(script);
                                } catch (SQLException e) {
                                    //LOG.error("Failed to execute script: " + script, e);
                                	System.err.println("Failed to execute script: " + script +" ERROR : " + e.getMessage());
                                }
                            }
                        }
                    } catch (SQLException e) {
                        //LOG.error("Failed to create a statement: " + e.getMessage(), e);
                    	System.err.println("Failed to create a statement: " + e.getMessage());
                    } finally {
                        try {
                            if (statement != null) {
                                statement.close();
                            }
                        } catch (SQLException e1) {
                            //LOG.error("Failed to close statement: " + e1.getMessage());
                        	System.err.println("Failed to close statement: " + e1.getMessage());
                        }
                    }

                }
                return null;
            }
        });
       // LOG.info("\n**********************\n");
        System.out.println("\n**********************\n");
    }

    /**
     * Execute the script list files.
     * 
     */
    public final void initialize() {
        if (initScripts != null) {
            for (Resource initScript : initScripts) {
                try {
                    doExecuteScript(initScript);
                } catch (Exception e) {
                    //LOG.error("Can't execute the scripts file : " + initScript.getFilename(), e);
                    System.err.println("Can't execute the scripts file : " + initScript.getFilename() +" ERROR : " + e.getMessage());
                }
            }
        }
    }

    /**
     * Returns a list <code> list </ code> having removed the commented lines.
     * 
     * @param list
     *            list of sql commands
     * @return sql commands without comments
     */
    private String stripComments(final List<String> list) {
        final StringBuffer buffer = new StringBuffer();
        for (String line : list) {
            if (!line.startsWith("//") && !line.startsWith("--")) {
                buffer.append(line);
                buffer.append(System.getProperty("line.separator"));
            }
        }
        return buffer.toString();
    }

    @PreDestroy
    public void destroy() {
        try {
            dataSource.getConnection().close();
        } catch (SQLException e) {
           // LOG.error("Failed to close a connection");
            System.out.println("Failed to close a connection");
        }
    }

    public final void setDataSource(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // /**
    // * @param dataSourceRef
    // * the dataSourceRef to set
    // */
    // public final void setDataSourceRef(DataSource dataSourceRef) {
    // this.dataSourceRef = dataSourceRef;
    // }

    public final void setInitScripts(final Resource[] initScripts) {
        if (ArrayUtils.isNotEmpty(initScripts)) {
            this.initScripts = initScripts.clone();
        }
    }

    public final void setTransactionManager(final PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }
}
