package com.lab8.util;

import java.sql.DriverManager;
import java.sql.Connection;

class ConnectionPanel {
    /**
     * Fereastra de control a conexiunii, prin care returnam o conexiune la baza noastra de date
     */
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
