package com.dao;

import com.model.Actor;
import com.model.Director;
import com.util.DatabaseConfiguration;

import java.sql.*;

public class DirectorsDaoImplement implements DirectorsDao {

    Connection conn = DatabaseConfiguration.getConnection();

    @Override
    public void createDirectorTable() throws SQLException {
        conn = null;
        Statement statement = null;

        try {
            statement = conn.createStatement();
            statement.execute("CREATE TABLE directors( id_movies INT, nume VARCHAR(30), FOREIGN KEY (id_movies) REFERENCES movies (id))");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public int addDirector(Director director) throws SQLException {
        String query = "INSERT INTO directors VALUES(?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, director.getId());
        stmt.setString(2, director.getName());

        int n = stmt.executeUpdate();
        return n;
    }

    @Override
    public Director getDirector(int id) throws SQLException {
        String query = "SELECT * FROM directors WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setInt(1, id);

        Director director = new Director();
        ResultSet resultSet = stmt.executeQuery();
        boolean check = false;

        while (resultSet.next()) {
            check = true;
            director.setId(resultSet.getInt("id_movies"));
            director.setName(resultSet.getString("nume"));
        }

        if (check == true) {
            return director;
        } else return null;
    }
}

