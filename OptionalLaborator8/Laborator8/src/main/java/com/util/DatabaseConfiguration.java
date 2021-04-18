package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfiguration {

    private static Connection con = null;

    private DatabaseConfiguration(){}
    static
    {
        String url = "jdbc:mysql://localhost:3306/javadatabase";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        if( con == null)
            con = (Connection) new DatabaseConfiguration();
        return con;
    }
}