/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.service.impl;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.beans.User;
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
@SuppressWarnings("restriction")
@WebService(endpointInterface = "com.service.IHelloWorld", serviceName = "helloWorld")
public class HelloWorldImpl implements IHelloWorld {

    @Override
    public String sayHi(@WebParam(name = "text") final String text) {
        return "Hi : --> votre text : " + text;
    }

    @Override
    public String sayHiToUser(final User user) {
        return "Hello Monsieru / Madame : " + user.getName();
    }

    @Override
    public User getUser() {
        User user = new User();
        user.setAge(27);
        user.setName("Mountassir");
        return user;
    }

}
