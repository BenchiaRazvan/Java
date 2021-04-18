package com.dao;

import com.model.Genre;

import java.sql.SQLException;


public interface GenreDao {

    int addGenre(Genre genre)
            throws SQLException;
    void deleteGenre(int id)
            throws SQLException;
    Genre  getGenre(int id)
            throws SQLException;

}