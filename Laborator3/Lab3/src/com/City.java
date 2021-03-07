package com;

import java.util.ArrayList;
import java.util.List;


public class City implements Classifiable{
    private String name;
    private List<String> locations = new ArrayList<String>();  // Folosim o lista pentru stocarea locatiilor

    City(String nameCity){
        this.name = nameCity;
    }

    public void addLocation(String place){
        locations.add(place);
    }           //Functie pentru adaugare locatie in lista
    public void showLocation(){
        for(int i = 0; i < locations.size(); i ++){
            System.out.println(locations.get(i));
        }
    }                                           // Parcurgem lista si afisam locatiile.
}
