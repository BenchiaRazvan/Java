package com;

import java.util.List;

public class ListCommand {
    ListCommand(List<Document> documentList){
        for(Document x : documentList){
            System.out.println(x);
        }
    }
}
