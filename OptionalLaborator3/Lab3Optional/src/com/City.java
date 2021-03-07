package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class City {

    private String name;
    private List<Location> nodes = new ArrayList<>();               // Lista cu locatii

    City(String newName){
        this.name = newName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLocation(Location node){
        nodes.add(node);
    }
    public List<Location> getNodes() {                          // Afisam locatiile
        return nodes;
    }
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", nodes=" + nodes +
                '}';
    }
    public void showNodes(){
        for(Location node : nodes){
            if((node instanceof Visitable) == true && (node instanceof Payable) == false)     // Verificam daca variabila noastra poate fi instanta a lui visitable si pentru Payable nu
                System.out.println(node);
        }
    }


}
