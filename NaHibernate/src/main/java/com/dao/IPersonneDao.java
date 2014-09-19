package com.dao;

import com.entite.Personne;

public interface IPersonneDao extends IDao<Personne> {

    void savePersonne(final Personne personne);
}
