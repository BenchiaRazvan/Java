package com;

public class Problem {

    /**
     * Construim doi costructori cu parametri diferite pentru School si Student si afisam numele scolii capaciteatea etc
     * @param school
     */
    Problem(School school){
        System.out.println("School name: " + school.getNameSchool());
        System.out.println("School capacity: " + school.getCapacity());
    }
    Problem(Student student){
        System.out.println("ID student: " + student.getIdStudent());
        System.out.println("Student preference: " + student.getPreferenceScholl());
    }


}
