package com.persistence.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * 
 * Interface JPARepository.
 */
public interface JPARepository {
    /**
     * 
     * @return EntityManager
     */
    EntityManager getEntityManager();
    
    EntityTransaction getEntityTransaction();
}
