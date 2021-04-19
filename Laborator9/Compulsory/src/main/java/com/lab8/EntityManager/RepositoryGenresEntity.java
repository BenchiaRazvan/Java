package com.lab8.EntityManager;

import com.lab8.entity.GenresEntity;

import java.sql.Timestamp;

public interface RepositoryGenresEntity {

     void create(GenresEntity genresEntity);
     void findById(GenresEntity genresEntity);
     void findByName(GenresEntity genresEntity);
}
