package com;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Student implements Comparator<Student> {

    private String name;

    private List<String> list = new LinkedList<>();

    Student(String newName){
        this.name = newName;
    }

    public void addPreference(String preference){
        list.add(preference);
    }

    public List<String> getPreference(){
        return list;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
