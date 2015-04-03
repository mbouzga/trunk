
package com.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindUserByLogin_QNAME = new QName("http://service.com/", "findUserByLogin");
    private final static QName _GetAllUsers_QNAME = new QName("http://service.com/", "getAllUsers");
    private final static QName _UserEntity_QNAME = new QName("http://service.com/", "UserEntity");
    private final static QName _FindUserByLoginResponse_QNAME = new QName("http://service.com/", "findUserByLoginResponse");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://service.com/", "getAllUsersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindUserByLoginResponse }
     * 
     */
    public FindUserByLoginResponse createFindUserByLoginResponse() {
        return new FindUserByLoginResponse();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link UserEntity }
     * 
     */
    public UserEntity createUserEntity() {
        return new UserEntity();
    }

    /**
     * Create an instance of {@link FindUserByLogin }
     * 
     */
    public FindUserByLogin createFindUserByLogin() {
        return new FindUserByLogin();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "findUserByLogin")
    public JAXBElement<FindUserByLogin> createFindUserByLogin(FindUserByLogin value) {
        return new JAXBElement<FindUserByLogin>(_FindUserByLogin_QNAME, FindUserByLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "UserEntity")
    public JAXBElement<UserEntity> createUserEntity(UserEntity value) {
        return new JAXBElement<UserEntity>(_UserEntity_QNAME, UserEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "findUserByLoginResponse")
    public JAXBElement<FindUserByLoginResponse> createFindUserByLoginResponse(FindUserByLoginResponse value) {
        return new JAXBElement<FindUserByLoginResponse>(_FindUserByLoginResponse_QNAME, FindUserByLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

}
