package com;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Map<Student, List<School>> StudentPreference = new HashMap<>();
        Map<School, List<Student>> SchoolPreference = new HashMap<>();

        School highschools0 = new School("H0");
        highschools0.setCapacity(1);
        School highschools1 = new School("H1");
        highschools1.setCapacity(2);
        School highschools2 = new School("H2");
        highschools2.setCapacity(2);

        /**
         * Creez studenti, scoli impreuna cu preferintele lor
         */
        Student student0 = new Student("S0", highschools0, highschools1, highschools2);
        Student student1 = new Student("S1", highschools0, highschools1, highschools2);
        Student student2 = new Student("S2", highschools0, highschools1);
        Student student3 = new Student("S3", highschools0, highschools2);

        StudentPreference.put(student0, Arrays.asList(highschools0, highschools1, highschools2));
        StudentPreference.put(student1, Arrays.asList(highschools0, highschools1, highschools2));
        StudentPreference.put(student2, Arrays.asList(highschools0, highschools1));
        StudentPreference.put(student3, Arrays.asList(highschools0, highschools2));

        SchoolPreference.put(highschools0, Arrays.asList(student3, student0, student1, student2));
        SchoolPreference.put(highschools1, Arrays.asList(student0, student2, student1));
        SchoolPreference.put(highschools2, Arrays.asList(student0, student1, student3));

        LinkedList<Student> students = Stream.of(student0, student3, student2, student1).distinct().collect(Collectors.toCollection(LinkedList::new));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getIdStudent().compareTo(s2.getIdStudent());
            }
        });


        /**
         * Utilizam Faker pentru a genera nume scolilor si studentilor. Parcurgem scolile din mapa, creez o variabila noua care va prealua un nume fake
         * iar cheia din mapa va primi noul nume.
         */
        Faker fakeName = new Faker();
        for (School keySchool : SchoolPreference.keySet()) {
            String newSchoolName = keySchool.getNameSchool();
            newSchoolName = fakeName.university().name();
            keySchool.setNameSchool(newSchoolName);
        }

        for(Student keyStudent : StudentPreference.keySet()){
            String newStudentName = keyStudent.getNameStudent();
            newStudentName = fakeName.name().firstName();
            keyStudent.setNameStudent(newStudentName);
        }

        /**
         * Descriem problema prin intermediul clasei Problem si prin intermediul clasei Solution afisam un matching.
         */
        Problem obj = new Problem(highschools0);
        Problem obj1 = new Problem(student0);
        Solution sol1 = new Solution();
        sol1.showSolution(StudentPreference, SchoolPreference);


        List<School> schoolList = new LinkedList<>();
        schoolList.add(highschools0);
        schoolList.add(highschools1);
        schoolList.add(highschools2);

        students.stream().
            filter(student -> student.getPreferenceScholl().containsAll(schoolList)).
                forEach(System.out::println);

    }
}
