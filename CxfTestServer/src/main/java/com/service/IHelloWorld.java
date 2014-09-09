/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.beans.User;

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
@SuppressWarnings("restriction")
@WebService
public interface IHelloWorld {

    @WebMethod
    String sayHi(@WebParam(name = "text") String text);

    /*
     * Advanced usecase of passing an Interface in. JAX-WS/JAXB does not support interfaces directly. Special XmlAdapter
     * classes need to be written to handle them
     */
    @WebMethod
    String sayHiToUser(User user);

    /*
     * Map passing JAXB also does not support Maps. It handles Lists great, but Maps are not supported directly. They
     * also require use of a XmlAdapter to map the maps into beans that JAXB can use.
     */
    // @XmlJavaTypeAdapter(IntegerUserMapAdapter.class)
    // Map<Integer, User> getUsers();
    @WebMethod
    User getUser();
}
