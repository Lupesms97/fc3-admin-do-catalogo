package com.ms.admin.catalogo.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void instanciaDeMainInfra(){
        Assertions.assertNotNull(new Main());
        Main.main(new String[]{"Pacote Infra Teste"});
    }
}
