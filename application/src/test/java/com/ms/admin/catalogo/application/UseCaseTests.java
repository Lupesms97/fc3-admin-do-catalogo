package com.ms.admin.catalogo.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTests {

    @Test
    public void instanciaUseCaseTeste(){
        Assertions.assertNotNull(new UseCase());
        Assertions.assertNotNull(new UseCase().excute());
    }
}
