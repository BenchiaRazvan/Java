package com;

import java.util.*;


import java.util.LinkedList;

public class Student {
    private int score;
    private String idStudent;
    private String nameStudent;
    private List<School> preferenceScholl = new LinkedList<School>();

    public Student(String id, School... args) {
        this.idStudent = id;
        Collections.addAll(this.preferenceScholl, args);

    }

    public int getScore() {
        return score;
    }

    public void setScore(int newRank) {
        this.score = score;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public List<School> getPreferenceScholl() {
        return this.preferenceScholl;
    }

    public String getIdStudent() {
        return this.idStudent;
    }

    @Override
    public String toString() {
        return nameStudent;
    }
}
