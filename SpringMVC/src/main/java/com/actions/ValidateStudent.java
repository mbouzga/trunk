/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.actions;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

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
public class ValidateStudent implements Validator {

    @Override
    public boolean supports(final Class<?> student) {
        return true;
    }

    @Override
    public void validate(final Object data, final Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "errors.required", new Object[] { "age" }, "");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "errors.required", new Object[] { "name" }, "");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "errors.required", new Object[] { "id" }, "");
        if (errors.hasErrors()) {
            errors.reject("register.info.1");
        }
    }
}
