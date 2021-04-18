package com.dao;

import com.model.Movie;

import java.sql.SQLException;


public interface MovieDao {

     int add(Movie movie)
            throws SQLException;
     void delete(int id)
            throws SQLException;
     Movie  getMovie(int id)
            throws SQLException;

}
