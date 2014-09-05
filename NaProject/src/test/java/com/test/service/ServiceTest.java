/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.test.service;

import org.junit.Assert;
import org.junit.Test;

import com.service.IService;
import com.service.impl.ServiceImpl;

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
public class ServiceTest {

    @Test
    public void testCalculer() {
    	System.out.println("Je t'aime ... ");
        IService service = new ServiceImpl();
        Assert.assertTrue(3 == service.calculer(1, 2));

        Assert.assertFalse(4 == service.calculer(1, 2));
    }
}
