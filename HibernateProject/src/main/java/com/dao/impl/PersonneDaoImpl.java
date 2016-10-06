package com.dao.impl;

import com.dao.IPersonneDao;
import com.entite.Personne;

public class PersonneDaoImpl extends DaoImpl<Personne> implements IPersonneDao {

    public void savePersonne(final Personne personne) {
        sessionHibernate.save(personne);
    }
}
