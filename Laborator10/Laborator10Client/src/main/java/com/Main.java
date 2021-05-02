package com;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        ClientSocketTCP clientSocketTCP = new ClientSocketTCP();
        clientSocketTCP.sendCommandToServer();

    }
}
