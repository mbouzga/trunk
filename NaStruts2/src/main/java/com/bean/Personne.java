/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.bean;

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
public class Personne {

    private String nom;
    private String prenom;
    private Integer age;

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
     * @return the prenom
     */
    public final String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom
     *            the prenom to set
     */
    public final void setPrenom(final String prenom) {
        this.prenom = prenom;
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
