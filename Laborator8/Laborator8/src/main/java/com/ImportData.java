package com;

import com.util.DatabaseConfiguration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImportData {
    /** Citim dintr-un fisier .csv linie cu linie, despartim coloanele prin "," si creem un vector de String-uri care contine cate un string pentru fiecare element din fisier csv
     * pe care il vom insera in baza de date*/

    public void impData(){
        Connection conn = null;
        String csvFile = "D:\\CSV\\IMDcsv.csv";

        int batchSize = 20;

        try{
            conn = DatabaseConfiguration.getConnection();
            //conn.setAutoCommit(false);
            String query = "INSERT INTO imdb VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);

            BufferedReader lineRead = new BufferedReader(new FileReader(csvFile));
            String lineText = null;

            int count = 0;

            lineRead.readLine();

            while ((lineText = lineRead.readLine()) != null){

                String[] data = lineText.split(",");

                String imdbTitle = data[0];
                String newOrdering = data[1];
                String imdbName = data[2];

                stmt.setString(1, imdbTitle);

                Integer integer = Integer.parseInt(newOrdering);

                stmt.setInt(2, integer);
                stmt.setString(3, imdbName);

                stmt.addBatch();


                if(count % batchSize == 0){
                    stmt.executeBatch();
                }

            }
            lineRead.close();
            stmt.executeBatch();
            conn.commit();
            conn.close();

        } catch (IOException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            ex.printStackTrace();

            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
