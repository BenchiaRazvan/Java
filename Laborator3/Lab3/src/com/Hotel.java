package com;
import java.util.*;

import java.util.HashMap;

public class Hotel implements Payable{
   private String name;
   private int price;
   private Map<String, Integer> times = new HashMap<>();

   Hotel(String nameCity){
      this.name = nameCity;
   }

   public void addLocationTime(String location, Integer time){
      times.put(location, time);
   }   // Adaugam o locatia si costul unei locatii
   public void showLocationTime() {
      for (String key : times.keySet()) {          // Parcurgem toate cheile mapei
         System.out.println(name + " -> " + key + " : " + times.get(key));
      }
   }                              // Afisam key + valoare din Map.
   public void setPrice(int price){
      this.price = price;
   }            // Setam un pret pentru Hotel
   public void getPrice(){
      System.out.println(this.price);
   }


}
