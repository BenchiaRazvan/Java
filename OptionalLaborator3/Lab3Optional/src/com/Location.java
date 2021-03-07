package com;

import java.util.HashMap;
import java.util.Map;

public abstract class Location implements Comparable<Location> {

    private String name;
    private Map<Location, Integer> cost = new HashMap<>();

    Location(String newName){
        this.name = newName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return
                "Location:" + name;
    }
    public void setCost(Map<Location, Integer> cost) {
        this.cost = cost;
    }
    @Override
    public int compareTo(Location o) {
        if(name.length() == 0)
            return 0;
        return this.name.compareTo(o.name);

    }

}
