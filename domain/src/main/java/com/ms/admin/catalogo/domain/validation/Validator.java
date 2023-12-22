package com.ms.admin.catalogo.domain.validation;

public abstract  class Validator {

    private final ValidationHandler handler;

    public Validator(final ValidationHandler aValidationHandler) {
        this.handler = aValidationHandler;
    }

    public abstract void validate();

    protected ValidationHandler validationHandler() {
        return this.handler;
    }

}
