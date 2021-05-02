package com;

import com.database.DatabaseConfiguration;

import java.io.*;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientThread {
    private Socket socket;
    Connection conn = DatabaseConfiguration.getConn();
    public void setSocket(Socket newSocket) {
        this.socket = newSocket;
    }
    public void run() throws SQLException {
        try{
            boolean OK = true;
            while(OK == true) {
                String comanda = "";
                String response;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                comanda = bufferedReader.readLine();

                PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

                if(comanda.contains("exit")){

                    printWriter.println("Server stopped!");
                    System.exit(0);
                    socket.close();
                    break;
                }
                else if(comanda.contains("register")){

                    String[] arrSplit = comanda.split(" ");

                    printWriter.println("User-ul " + arrSplit[1] + " a fost adaugat");

                    String query = "INSERT INTO register VALUES(?)";
                    PreparedStatement preparedStatement = conn.prepareStatement(query);
                    preparedStatement.setString(1,arrSplit[1]);
                    preparedStatement.executeUpdate();
                }
                else if(comanda.contains("login")){
                    String[] arrSplit = comanda.split(" ");
                    String word = arrSplit[1];

                    String query ="SELECT * FROM register WHERE name = ?";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setString(1, word);

                    ResultSet resultSet = stmt.executeQuery();
                    if(resultSet.next()){
                        printWriter.println("Ai fost logat cu succes");

                    }
                    else printWriter.println("Nu ai fost gasit in baza de date");
                }

                else
                    printWriter.println("Server recieved a request...!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
