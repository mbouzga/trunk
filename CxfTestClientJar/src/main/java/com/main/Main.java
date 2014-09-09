/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.IHelloWorld;

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
public class Main {

    /**
     * TODO description of method
     * 
     * @param args
     */
    public static void main(final String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IHelloWorld client = (IHelloWorld) context.getBean("helloClient");
        System.out.println(client.getUser());
    }

}
