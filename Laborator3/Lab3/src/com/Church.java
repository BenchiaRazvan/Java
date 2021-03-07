package com;

import java.util.HashMap;
import java.util.Map;

public class Church implements Visitable{

     private String name;
     private int hourStart;
     private Map<String, Integer> times = new HashMap<>();

    Church(String nameCity){
        this.name = nameCity;
    }

    public void setHourOpen(int hourOpen){
        this.hourStart = hourOpen;
    }
    public void getHour(){
        System.out.println("Test");
    }
    public void addLocationTime(String location, Integer time){
        times.put(location, time);
    }
    public void showLocationTime() {
        for (String key : times.keySet()) {
            System.out.println(name + " -> " + key + " : " + times.get(key));
        }
    }

}
