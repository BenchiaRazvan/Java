package com.lab8.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingletonEntity {

    private static EntityManagerFactory entityManagerFactory;

    private SingletonEntity(){}
    public static EntityManagerFactory getEntityManagerFactory(){
        if(entityManagerFactory == null)
            entityManagerFactory = Persistence.createEntityManagerFactory("Laborator9");
        return entityManagerFactory;
    }

}
