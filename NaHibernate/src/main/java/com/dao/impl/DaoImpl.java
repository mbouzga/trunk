package com.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

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

    @PersistenceUnit(unitName = "naHibernate")
    private EntityManagerFactory entityManagerFactory;

    protected EntityManager entityManager;

    private Class<T> maClass;

    public DaoImpl() {
        super();
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void creat(final T o) {
        entityManager.persist(o);
    }

    public T read(final Class<T> c, final Integer id) {
        return entityManager.find(c, id);
    }

    public T update(final T o) {
        return entityManager.merge(o);
    }

    public void delete(final T o) {
        entityManager.refresh(o);
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
