package com.repository.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 
 * Class AbstractJPACustomRepository.
 */
public abstract class AbstractJPACustomRepository implements JPACustomRepository {

    /** Entity manager. */
    @PersistenceContext
    protected EntityManager entityManager;

    /**
     * @return EntityManager
     */
    public final EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * 
     * @param entityManager
     *            Entity Manager
     */
    public final void setEntityManager(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
