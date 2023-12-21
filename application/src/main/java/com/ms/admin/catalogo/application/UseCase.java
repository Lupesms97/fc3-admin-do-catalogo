package com.ms.admin.catalogo.application;

import com.ms.admin.catalogo.domain.category.Category;

public class UseCase {

    public Category excute(){
        System.out.println("Application");
        return new Category();
    }
}