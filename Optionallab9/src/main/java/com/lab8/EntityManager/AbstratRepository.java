package com.lab8.EntityManager;

import org.hibernate.dialect.Database;

import javax.persistence.EntityManager;

abstract class AbstratFactory {

    private Database database;
    private EntityManager entityManager;


}
