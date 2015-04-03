package com.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2015-04-03T12:04:09.456+01:00
 * Generated source version: 2.7.3
 * 
 */
@WebServiceClient(name = "users", 
                  wsdlLocation = "http://localhost:8080/CXFServerSimple/services/users?wsdl",
                  targetNamespace = "http://service.com/") 
public class Users extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.com/", "users");
    public final static QName IUserServicePort = new QName("http://service.com/", "IUserServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/CXFServerSimple/services/users?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Users.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/CXFServerSimple/services/users?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Users(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Users(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Users() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IUserService
     */
    @WebEndpoint(name = "IUserServicePort")
    public IUserService getIUserServicePort() {
        return super.getPort(IUserServicePort, IUserService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IUserService
     */
    @WebEndpoint(name = "IUserServicePort")
    public IUserService getIUserServicePort(WebServiceFeature... features) {
        return super.getPort(IUserServicePort, IUserService.class, features);
    }

}
