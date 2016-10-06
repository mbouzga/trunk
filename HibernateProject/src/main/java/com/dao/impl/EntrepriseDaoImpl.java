package com.dao.impl;

import com.dao.IEntrepriseDao;
import com.entite.Entreprise;

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
public class EntrepriseDaoImpl extends DaoImpl<Entreprise> implements IEntrepriseDao {

    @Override
    public void creat(final Entreprise entreprise) {
        entityManager.persist(entreprise);
    }

    @Override
    public Entreprise read(final Class<Entreprise> c, final Long id) {

        return null;
    }

    @Override
    public Entreprise update(final Entreprise o) {

        return null;
    }

    @Override
    public void delete(final Entreprise o) {

    }

    @Override
    public boolean isDetached(final Entreprise o) {

        return false;
    }

    @Override
    public void detach(final Entreprise o) {

    }

}
