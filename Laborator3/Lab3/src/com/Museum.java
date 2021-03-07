package com;

import java.util.HashMap;
import java.util.Map;

public class Museum implements Visitable, Payable {
    private String name;
    private int price;
    private int hourStart;
    private Map<String, Integer> times = new HashMap<>();

    Museum(String nameCity){
        this.name = nameCity;
    }

    public void showLocationTime() {
        for (String key : times.keySet()) {
            System.out.println(name + " -> " + key + " : " + times.get(key));       // Parcurgem cheile mapei si afisam cheia + valoarea
        }
    }                                   // Afisam key + valoare din Map.
    public void setPrice(int price){
        this.price = price;
    }
    public void getPrice(){
        System.out.println(this.price);
    }
    public void setHourOpen(int hourOpen){
        this.hourStart = hourOpen;
    }                            // Setam o ora de deschidere a hotelului.
    public void getHour(){
        System.out.println(this.hourStart);
    }
    public void addLocationTime(String location, Integer time){
        times.put(location, time);   // punem in Map locatia si timpul
    }       // Adaugam o locatia si costul unei locatii

}
