package com.ms.admin.catalogo.infrastructure;

import com.ms.admin.catalogo.application.UseCase;

public class Main {
    public static void main(String[] args) {

        System.out.println("Infrastructure");
        System.out.println(new UseCase().excute());
    }
}