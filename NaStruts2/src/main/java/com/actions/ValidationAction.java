/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;

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
public class ValidationAction extends ActionSupport {

    private String email;
    private String nom;
    private Integer age;

    @Override
    public String execute() {
        return SUCCESS;
    }

    /**
     * @return the email
     */

    @EmailValidator(message = "Email invalide")
    @RequiredFieldValidator(message = "Le champ est obligatoire")
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
    @RequiredFieldValidator(message = "Le champ est obligatoire")
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
    @RequiredFieldValidator(message = "Le champ est obligatoire")
    @IntRangeFieldValidator(min = "18", max = "30", message = "Votre age doit etre entre 18 et 30 ans ...")
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
