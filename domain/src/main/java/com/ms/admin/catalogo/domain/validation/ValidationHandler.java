package com.ms.admin.catalogo.domain.validation;

import java.util.List;

public interface ValidationHandler {

    ValidationHandler append(Error anError);

    ValidationHandler append(ValidationHandler aValidationHandler);

    List<Error> getErrors();

    default boolean hasErrors() {
        return getErrors()!= null && !(getErrors().isEmpty());
    }
    public interface Validation {
        void validate();
    }

}
