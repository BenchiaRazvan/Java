package com;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocketTCP {

    private final static String serverAddress = "127.0.0.1";
    private final static int PORT = 7200;
    private Socket socket;

    ClientSocketTCP() throws IOException {
        socket = new Socket(serverAddress, PORT);

    }

    public void sendCommandToServer() throws IOException {
        String response;
        boolean OK = true;
        Scanner scanner = new Scanner(System.in);
        while(OK == true)
        {
            String command = scanner.nextLine();

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            printWriter.println(command);
            printWriter.flush();
            response = bufferedInputStream.readLine();
            System.out.println(response);

            if(command.contains("exit")){
                socket.close();
                break;
            }

        }
    }
}
