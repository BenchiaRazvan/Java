package com;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new LinkedList<>();

        Student student1 = new Student("Student 1");
        Student student2 = new Student("Student 2");
        Student student3 = new Student("Student 3");
        Student student4 = new Student("Student 4");


        students = Stream.of(student1, student2, student3, student4).collect(Collectors.toList());
        Set<School> schools = new TreeSet<>();

        School school1 = new School("School 1");
        School school2 = new School("School 2");
        School school3 = new School("School 3");

        schools = Stream.of(school1, school2, school3).collect(Collectors.toSet());


        Map<Student, String> map1 = new HashMap<>();
        map1.put(student1, "school 1, school 2, school 3");
        map1.put(student2, "school 1, school 2, school 3");
        map1.put(student3, "school 1, school 2");
        map1.put(student4, "school 1, school 3");

        for(Map.Entry<Student, String> entry : map1.entrySet()){
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }

        Map<School, String> map2 = new TreeMap<>();
        map2.put(school1, "student 4, student 1, student 2, student 3");
        map2.put(school2, "student 1, student 3, student 2");
        map2.put(school3, " student 1, student 2, student 4");

        for (Map.Entry<School , String> entry : map2.entrySet())
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
    }
}
