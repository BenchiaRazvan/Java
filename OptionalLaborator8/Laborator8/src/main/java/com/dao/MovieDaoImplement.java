package com.dao;

import com.model.Movie;

import java.sql.*;

import com.util.DatabaseConfiguration;

import java.sql.SQLException;

public class MovieDaoImplement implements MovieDao {

    Connection conn = DatabaseConfiguration.getConnection();
    @Override
    public int add(Movie movie) throws SQLException {
        String query = "INSERT INTO movies VALUES(?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, movie.getId());
        stmt.setString(2, movie.getTitle());
        stmt.setTimestamp(3,  movie.getReleaseDate());
        stmt.setInt(4, movie.getDuration());
        stmt.setInt(5, movie.getScore());
        int n = stmt.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "DELETE from movies where ID =?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.executeUpdate();

    }

    @Override
    public Movie getMovie(int id) throws SQLException {

        String query = "SELECT * FROM movies where ID=?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);

        Movie movie = new Movie();
        ResultSet result = stmt.executeQuery();
        boolean check = false;

        while(result.next()){
            check = true;
            movie.setId(result.getInt("ID"));
            movie.setTitle(result.getString("TITLE"));
            movie.setReleaseDate(result.getTimestamp("RELEASE_DATE"));
            movie.setDuration(result.getInt("DURATION"));
            movie.setScore(result.getInt("SCORE"));
        }
        if(check == true){

            return movie;
        }
        else{
            return null;
        }
    }

}
