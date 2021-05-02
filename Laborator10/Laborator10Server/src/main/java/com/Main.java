package com;

import java.net.ServerSocket;
import java.net.UnknownHostException;

public class Main{
    public static void main(String[] args) throws UnknownHostException {
        ServerSocketTCP serverSocketTCP = new ServerSocketTCP();
        serverSocketTCP.init();
    }
}
