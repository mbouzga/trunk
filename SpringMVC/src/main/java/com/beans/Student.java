package com.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

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
public class Student {

    @NotNull
    @Min(18)
    @Max(30)
    private Integer age;
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @Min(1)
    private Integer id;

    public void setAge(final Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
