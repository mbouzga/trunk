package com.persistence.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 * 
 * Class AbstractJPARepository.
 */
public abstract class AbstractJPARepository implements JPARepository {

    /** Entity manager. */
    @PersistenceContext(type=PersistenceContextType.EXTENDED)
    protected EntityManager entityManager;

    protected EntityTransaction entityTransaction;
    
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

	public EntityTransaction getEntityTransaction() {
		return this.entityManager.getTransaction();
	}

	public void setEntityTransaction(EntityTransaction entityTransaction) {
		this.entityTransaction = entityTransaction;
	}

}
