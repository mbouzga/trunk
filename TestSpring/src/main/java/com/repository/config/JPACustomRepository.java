package com.repository.config;

import javax.persistence.EntityManager;

/**
 * 
 * Interface JPACustomRepository.
 */
public interface JPACustomRepository {
    /**
     * 
     * @return EntityManager
     */
    EntityManager getEntityManager();
}
