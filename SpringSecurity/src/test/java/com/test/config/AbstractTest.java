package com.test.config;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public abstract class AbstractTest extends ConfigTest{

	@Before
	public void setUp(){
		System.out.println("Methode setUp() ...");
	}
	@After
	public void teardown(){
		System.out.println("Methode teardown() ...");
	}
	
	@BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("@BeforeClass - oneTimeSetUp");
    }
 
    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
    	System.out.println("@AfterClass - oneTimeTearDown");
    }
}
