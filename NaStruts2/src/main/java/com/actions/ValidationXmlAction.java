/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.actions;

import com.opensymphony.xwork2.ActionSupport;

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
public class ValidationXmlAction extends ActionSupport {
    private String email;
    private String nom;
    private Integer age;

    @Override
    public String execute() {
        System.out.println("Methode execute ValidationXml ...");
        return SUCCESS;
    }

    /**
     * @return the email
     */
    public final String getEmail() {
        return email;
    }

    /**
     * @param email
     *            the email to set
     * @return
     */
    public final void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @return the nom
     */
    public final String getNom() {
        return nom;
    }

    /**
     * @param nom
     *            the nom to set
     */
    public final void setNom(final String nom) {
        this.nom = nom;
    }

    /**
     * @return the age
     */
    public final Integer getAge() {
        return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public final void setAge(final Integer age) {
        this.age = age;
    }
}
