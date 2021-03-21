package com;


import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.Serializable;


public class Catalog implements Serializable {

    private List<Document> entries = new ArrayList<Document>();

    public void add(Document entry){
        entries.add(entry);
    }
    public void list() {
        for(Document doc : entries ){
            System.out.println("Name: " + doc.getName() + " Path: " + doc.getPath() + " " + "Year: " + doc.getYear() + " Rating " + doc.getRating());
        }
    }
    public void play(Document doc1) throws IOException,ArrayIndexOutOfBoundsException {
        Desktop.getDesktop().open(new File(doc1.getPath()));
    }
    public static void save(String path) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(new Catalog());
        objectOutputStream.flush();
        fileOutputStream.close();
    }


    public void load(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        this.entries = ((Catalog)objectInputStream.readObject()).entries;
        fileInputStream.close();
    }

}
