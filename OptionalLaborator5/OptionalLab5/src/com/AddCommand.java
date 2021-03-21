package com;


public class AddCommand {

    AddCommand(Catalog catalog, Document doc){
        if (catalog.getList().contains(doc) == false){
            catalog.add(doc);
        }
        else System.out.println("Already exists");
    }
}

