/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.main;

import com.dao.IPersonneDao;
import com.dao.impl.PersonneDaoImpl;
import com.entite.Personne;

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
public class Main {

    public static void main(final String[] args) {
        IPersonneDao personneDao = new PersonneDaoImpl();
        Personne personne = new Personne();
        personne.setNom("BOUZGA");
        personneDao.creat(personne);
    }

}
