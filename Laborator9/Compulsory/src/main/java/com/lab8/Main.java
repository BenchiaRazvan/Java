package com.lab8;

import com.lab8.EntityManager.GenresEntityMethods;
import com.lab8.EntityManager.MoviesEntityMethods;
import com.lab8.entity.GenresEntity;
import com.lab8.entity.MoviesEntity;
import com.sun.management.GarbageCollectionNotificationInfo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) throws SQLException {

        /*GenresEntityMethods genresEntityMethods = new GenresEntityMethods();
        //genresEntityMethods.create(92, "TTeesstt");
        genresEntityMethods.findById(92);


        MoviesEntityMethods moviesEntityMethods = new MoviesEntityMethods();
        //moviesEntityMethods.create(93, "Test Movie", Timestamp.valueOf("1999-10-22 15:20:30"), 30, 50);
        moviesEntityMethods.findById(93);*/

        GenresEntity genresEntity = new GenresEntity();
        genresEntity.setNume("Macarena");
        genresEntity.setId(94);

        MoviesEntity moviesEntity = new MoviesEntity();
        moviesEntity.setId(94);
        moviesEntity.setDuration(120);
        moviesEntity.setScore(10);
        moviesEntity.setTitle("The Conjuring");
        moviesEntity.setReleaseDate(Timestamp.valueOf("2013-02-22 15:20:30"));


        GenresEntityMethods genresEntityMethods = new GenresEntityMethods();
        //genresEntityMethods.create(genresEntity);

        MoviesEntityMethods moviesEntityMethods = new MoviesEntityMethods();
        //moviesEntityMethods.create(moviesEntity);

        genresEntityMethods.findById(genresEntity);
        genresEntityMethods.findByName(genresEntity);
    }
}
