/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.actions;

import com.bean.Personne;
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
public class PersonneAction extends ActionSupport {

    private Personne personne;

    @Override
    public String execute() {
        return SUCCESS;
    }

    /**
     * @return the personne
     */
    public final Personne getPersonne() {
        return personne;
    }

    /**
     * @param personne
     *            the personne to set
     */
    public final void setPersonne(final Personne personne) {
        this.personne = personne;
    }
}
