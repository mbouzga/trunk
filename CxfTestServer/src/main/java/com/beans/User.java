/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.beans;

import javax.xml.bind.annotation.XmlType;

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
@XmlType
public class User {

    private String name;
    private Integer age;

    /**
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public final void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public final Integer getAge() {
        return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public final void setAge(final Integer age) {
        this.age = age;
    }

}
