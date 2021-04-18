package com.dao;

import com.model.Actor;
import com.model.Director;
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import com.util.DatabaseConfiguration;

import java.sql.*;

public class ActorsDaoImplement implements ActorsDao {


    Connection conn = DatabaseConfiguration.getConnection();

    public void createActorTable() {
        Statement statement = null;

        try {
            statement = conn.createStatement();
            statement.execute("CREATE TABLE actors( id_movies INT, nume VARCHAR(30), FOREIGN KEY (id_movies) REFERENCES movies (ID))");
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
    public int addActor(Actor actor) throws SQLException {
        String query = "INSERT INTO actors VALUES(?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, actor.getId());
        stmt.setString(2, actor.getName());

        int n = stmt.executeUpdate();
        return n;
    }

    @Override
    public Actor getActors(int id) throws SQLException {
        String query = "SELECT * FROM actors WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setInt(1, id);

        Actor actor = new Actor();
        ResultSet resultSet = stmt.executeQuery();
        boolean check = false;

        while (resultSet.next()) {
            check = true;
            actor.setId(resultSet.getInt("id_movies"));
            actor.setName(resultSet.getString("nume"));
        }

        if (check == true) {
            return actor;
        } else return null;
    }
}
