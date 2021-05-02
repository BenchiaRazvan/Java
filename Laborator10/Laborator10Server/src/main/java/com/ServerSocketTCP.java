package com;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.SQLException;

public class ServerSocketTCP {

    public static final int PORT = 7200;
    private ServerSocket serverSocket;
    private Socket socket;
    private boolean OK = false;
    private InetAddress address;

    public void init() throws UnknownHostException {
        try{
            address = InetAddress.getByName("127.0.0.1");
            serverSocket = new ServerSocket(PORT, 50, address);
            System.out.println("-----------------Server started-------------");
            OK = true;
            System.out.println("Waiting for clients...");
            while(OK == true){
                socket = serverSocket.accept();
                ClientThread thr = new ClientThread();
                thr.setSocket(socket);
                thr.run();
            }

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
