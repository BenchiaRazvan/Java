package com;

import java.io.*;
import java.util.List;

public class LoadCommand implements Serializable {

    LoadCommand( String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Document> documentList = (List<Document>) objectInputStream.readObject();
    }
}
