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

    T read(Class<T> c, Integer id);

    T update(T o);

    void delete(T o);
}
