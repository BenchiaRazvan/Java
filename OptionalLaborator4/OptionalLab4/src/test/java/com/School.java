package com;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class School {
    private String nameSchool;
    private int capacity;
    private List<Student> preferenceStudent = new LinkedList<Student>();

    public School(String name, Student... args) {
        this.nameSchool = name;
        Collections.addAll(this.preferenceStudent, args);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Student> getPreferenceStudent() {
        return this.preferenceStudent;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getNameSchool() {
        return nameSchool;
    }
    public void setNameSchool(String newName){
        this.nameSchool = newName;
    }

    @Override
    public String toString() {
        return nameSchool;
    }
}
