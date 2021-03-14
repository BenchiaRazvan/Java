package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class School implements Comparable<School>{

    private String name;
    School(String newName){
        this.name = newName;
    }

    private TreeSet<String> schoolPreference = new TreeSet<>();

    public void addPreference(String preference){
        schoolPreference.add(preference);
    }

    public TreeSet<String> getPreference(){
        return schoolPreference;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(School o) {
        return this.name.compareTo(o.getName());
    }
}
