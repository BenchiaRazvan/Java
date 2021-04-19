package com.lab8.EntityManager;

import com.lab8.entity.MoviesEntity;

import java.sql.Timestamp;

public interface RepositoryMovieEntity {
     void create(MoviesEntity moviesEntity);
    void findById(MoviesEntity moviesEntity);
    void findByName(MoviesEntity moviesEntity);
}
