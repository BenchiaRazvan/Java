package com;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, Document.YearException {

        Catalog test = new Catalog();

        Song song1 = new Song("brodway", "C:\\Users\\razva\\Downloads\\Brodway.mp3", 2019, 5);
        Image image = new Image("image", "C:\\Users\\razva\\Documents\\poza.jpeg", 2019, 5);

        test.add(song1);
        test.add(image);

        test.shell();






    }
}
