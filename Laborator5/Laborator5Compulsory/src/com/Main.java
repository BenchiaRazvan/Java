package com;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Document.YearException, IOException{

        Catalog catalog = new Catalog();

        Song song1 = new Song("brodway", "C:\\Users\\razva\\Downloads\\Brodway.mp3", 2019, 5);
        Image image = new Image("image", "C:\\Users\\razva\\Documents\\poza.jpeg", 2019, 5);

        catalog.add(song1);
        catalog.add(image);
        catalog.play(song1);
        catalog.play(image);
        catalog.list();
        catalog.save("C:\\Users\\razva\\IdeaProjects\\Laborator5\\Save.txt");
    }
}
