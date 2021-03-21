package com;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
;

public class Catalog implements Serializable {

    private List<Document> entries = new ArrayList<Document>();
    String path = "D:\\Test.txt";

    public void shell() {
        Scanner scanner = new Scanner(System.in);
        String commandLine;
        while(true){
            System.out.println("Introduce command: ");
            commandLine = scanner.nextLine();
            try{
                if((commandLine.compareTo("exit") == 0)){
                    System.out.println("Ai accesat comanda exit");
                    break;
                }
                else if(commandLine.contains("Save") || commandLine.contains("save")){
                    new SaveCommand(entries, path);
                }
                else if(commandLine.contains("Load") || commandLine.contains("load")){
                        new LoadCommand(path);
                }
                else if(commandLine.contains("Play") || commandLine.contains("play")){
                    new PlayCommand(new Document());
                }
                else if(commandLine.contains("List") || commandLine.contains("list")){
                    new ListCommand(entries);
                }
                else if(commandLine.contains("Add") || commandLine.contains("add")){
                    new AddCommand(new Catalog(), new Document());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Document> getList(){
        return entries;
    }

    public void add(Document song1) {
        entries.add(song1);
    }
}
