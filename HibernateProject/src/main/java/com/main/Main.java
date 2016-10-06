package com.main;

import com.dao.IPersonneDao;
import com.dao.impl.PersonneDaoImpl;
import com.entite.Personne;

public class Main {

    public static void main(final String[] args) {

    	/** test git*/
        IPersonneDao personneDao = new PersonneDaoImpl();

        Personne personneCreation = new Personne();
        personneCreation.setNom("BOUZGA");
        personneCreation.setPrenom("Mountassir");
        personneCreation.setAge(27);

        // Exemple de création
        personneDao.creat(personneCreation);

        // Exemple de lecture
        // Il faut changer l'id apres l'excution et donner un id existant dans la base sinn NPE

        Personne personneLecture = personneDao.read(Personne.class, 15L);

        System.out.println("********************************** Exemple de lecture **********************************");
        System.out.println("Nom : " + personneLecture.getNom());
        System.out.println("Prenom : " + personneLecture.getPrenom());
        System.out.println("Age : " + personneLecture.getAge());
        System.out.println("****************************************************************************************");

        // Exemple de mise a jour
        personneLecture.setNom("BOUZGA Apres modification");
        Personne personneModification = personneDao.update(personneLecture);

        System.out.println("******************************** Exemple de Modification *******************************");
        System.out.println("Nom : " + personneModification.getNom());
        System.out.println("Prenom : " + personneModification.getPrenom());
        System.out.println("Age : " + personneModification.getAge());
        System.out.println("****************************************************************************************");

        // Exemple de delete
        personneDao.delete(personneLecture);
        if (personneDao.read(Personne.class, personneLecture.getId()) == null) {
            System.out.println("****************************** Exemple de suppression *****************************");
            System.out.println("[SUCCESS] La suppresion est OK !");
            System.out.println("************************************************************************************");
        } else {
            System.out.println("****************************** Exemple de suppression *****************************");
            System.out.println("[ERROR] La suppresion est KO !");
            System.out.println("************************************************************************************");
        }

    }

}
