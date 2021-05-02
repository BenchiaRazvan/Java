package com.lab8.EntityManager;

import com.lab8.entity.MoviesEntity;
import com.lab8.util.SingletonEntity;

import javax.persistence.*;
import java.util.List;

public class ChartsEntityMethods {

    public void insertDatabase(MoviesEntity moviesEntity){

        EntityManagerFactory entityManagerFactory = SingletonEntity.getEntityManagerFactory();

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("INSERT INTO ChartsEntity(id, title, releasedata, rating) SELECT movies.id, movies.title, movies.releaseDate, movies.score FROM MoviesEntity movies ORDER BY movies.score DESC");
        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}


