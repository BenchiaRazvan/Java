package com.dao;

import com.model.Actor;
import com.model.Director;
import com.model.Genre;
import com.model.Movie;

import java.sql.SQLException;

public interface ActorsDao {
    void createActorTable()
        throws SQLException;
    int addActor(Actor actor)
            throws SQLException;
    Actor  getActors(int id)
            throws SQLException;
}
