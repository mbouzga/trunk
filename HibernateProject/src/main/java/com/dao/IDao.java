/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.dao;

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
public interface IDao<T> {

    // Toutes les méthodes CRUD

    void creat(T o);

    T read(Class<T> c, Long id);

    T update(T o);

    void delete(T o);

    // Méthode de déttachement de l'entité manager

    boolean isDetached(T o);

    void detach(T o);
}
