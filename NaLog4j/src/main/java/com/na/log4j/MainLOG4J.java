package com.na.log4j;

import org.apache.log4j.Logger;

/**
 * TODO Short description of the class
 * 
 * <P>
 * TODO Detailed description of the use of the class.
 * </p>
 * 
 * @author $Author$
 * @version $Revision$
 */
public class MainLOG4J {

    private static Logger logger = Logger.getLogger(MainLOG4J.class);

    public static void main(final String[] args) {
        logger.debug("msg de debogage");
        logger.info("msg d'information");
        logger.warn("msg d'avertissement");
        logger.error("msg d'erreur");
        logger.fatal("msg d'erreur fatale");
    }

}
