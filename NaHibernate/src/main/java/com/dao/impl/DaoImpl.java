package com.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;

import com.dao.IDao;

public class DaoImpl<T> implements IDao<T> {

    // @PersistenceUnit(unitName = "naHibernate")
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("naHibernate");

    protected EntityManager entityManager;
    protected EntityTransaction transactionManager;
    protected Session sessionHibernate;
    private Class<T> maClass;

    public DaoImpl() {
        super();
        entityManager = entityManagerFactory.createEntityManager();
        transactionManager = entityManager.getTransaction();
        sessionHibernate = (Session) entityManager.getDelegate();
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

    public void detach(final T o) {
        transactionManager.begin();
        entityManager.detach(o);
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

    /**
     * @return the transactionManager
     */
    public final EntityTransaction getTransactionManager() {
        return transactionManager;
    }

    /**
     * @param transactionManager
     *            the transactionManager to set
     */
    public final void setTransactionManager(final EntityTransaction transactionManager) {
        this.transactionManager = transactionManager;
    }

    /**
     * @return the sessionHibernate
     */
    public final Session getSessionHibernate() {
        return sessionHibernate;
    }

    /**
     * @param sessionHibernate
     *            the sessionHibernate to set
     */
    public final void setSessionHibernate(final Session sessionHibernate) {
        this.sessionHibernate = sessionHibernate;
    }
}
