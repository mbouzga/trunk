package com.test.personne;

import org.junit.Test;

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
public class PersonneTest {

    private IPersonneDao personneDao = new PersonneDaoImpl();

    // Test avec les methode JPA

    // Cas 1 : Création d'une entité qui n'est pas géré par l'entity manager (nouvelle création).
    @Test
    public void testCreatPersonneNotExist() {
        Personne personne = new Personne("BOUZGA-SAVE-Not managed", "Mountassir", 27);
        personneDao.creat(personne);
    }

    // Cas 2 : Création d'une entité géré par l'entity manager.
    @Test
    public void testCreatPersonneExist() {
        Personne personne = new Personne("BOUZGA-SAVE-managed", "Mountassir", 27);
        Personne personneManaged = personneDao.update(personne);

        // Cette création doit etre ignoré parce que c'est entité attaché au entité manager
        personneDao.creat(personneManaged);
    }

    // Cas 3 : Création d'une entité détachée de l'entity manager.
    @Test
    public void testCreatPersonneDetached() {
        Personne personne = new Personne("BOUZGA-SAVE-managed", "Mountassir", 27);
        Personne personneManaged = personneDao.update(personne);
        personneDao.detach(personneManaged);
        // Exception normalement
        personneDao.creat(personneManaged);
    }

    // Tests avec HQL

    @Test
    public void testSavePersonne() {
        Personne personne = new Personne(1l, "BOUZGA_HQL-SAVE", "Mountassir_HQL-SAVE", 27);
        personneDao.savePersonne(personne);
    }
}
