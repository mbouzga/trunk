package com.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dao.IDao;

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

public class DaoImpl<T> implements IDao<T> {

    // @PersistenceUnit(unitName = "naHibernate")
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("naHibernate");;

    protected EntityManager entityManager;
    private EntityTransaction transactionManager;

    private Class<T> maClass;

    public DaoImpl() {
        super();
        entityManager = entityManagerFactory.createEntityManager();
        transactionManager = entityManager.getTransaction();
    }

    public void creat(final T o) {
        transactionManager.begin();
        entityManager.persist(o);
        transactionManager.commit();
    }

    public T read(final Class<T> c, final Long id) {
        return entityManager.find(c, id);
    }

    public T update(final T o) {
        transactionManager.begin();
        T oUpdate = entityManager.merge(o);
        transactionManager.commit();
        return oUpdate;
    }

    public void delete(final T o) {
        transactionManager.begin();
        entityManager.remove(o);
        transactionManager.commit();
    }

    /**
     * @return the entityManager
     */
    public final EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * @param entityManager
     *            the entityManager to set
     */
    public final void setEntityManager(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * @return the maClass
     */
    public final Class<T> getMaClass() {
        return maClass;
    }

    /**
     * @param maClass
     *            the maClass to set
     */
    public final void setMaClass(final Class<T> maClass) {
        this.maClass = maClass;
    }

    /**
     * @return the entityManagerFactory
     */
    public final EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    /**
     * @param entityManagerFactory
     *            the entityManagerFactory to set
     */
    public final void setEntityManagerFactory(final EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

}
