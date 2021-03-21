package com;

import java.io.*;
import java.util.List;

public class SaveCommand extends Command implements Serializable{

     SaveCommand(List<Document> documentList, String path){
         try {
             FileOutputStream fout = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fout);
             oos.writeObject(documentList);
             fout.close();
             oos.close();
         } catch (IOException e) {
             System.err.println("ERR");
         }
    }
    @Override
    void help() {

    }
}
