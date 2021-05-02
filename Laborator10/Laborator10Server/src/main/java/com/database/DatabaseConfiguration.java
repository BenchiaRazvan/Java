package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfiguration {

    private static Connection conn = null;

    private DatabaseConfiguration() { }

    static{

         String url = "jdbc:mysql://localhost:3306/tcp";
         String username = "root";
         String password = "";

         try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, username, password);

         } catch (ClassNotFoundException | SQLException e) {
             e.printStackTrace();
         }
    }
    public static Connection getConn(){
        if(conn == null)
            conn = (Connection) new DatabaseConfiguration();
        return conn;
    }
}
