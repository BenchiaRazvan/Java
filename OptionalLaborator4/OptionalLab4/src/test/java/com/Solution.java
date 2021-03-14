package com;

import java.util.List;
import java.util.Map;


public class Solution {

    Solution(){

    }

    /**
     * Ca parametri vom seta doua mape care vor contine obiect de tip Studenti si o lista de scoli, care vor reprezenta preferintele studentilor
     * o mapa pentru preferintele scolilor. Parcurgem atat scolile cat si studentii si verificam daca capacitatea unei scoli poate mai primi un student
     *, verificam daca scoala are ca preferinta studentul respectiv si daca da, vom afisa numele studentului si scoala.

     */
    public void showSolution(Map<Student, List<School>> stdPref, Map<School, List<Student>> schPref){
        for(School key : schPref.keySet()){
            for(Student key2 : stdPref.keySet()){
                if(key.getCapacity() > 0) {
                    if (schPref.get(key).contains(key2)) {
                        System.out.println("(" + key + ", " + key2 + ")");
                        key.setCapacity(key.getCapacity() -  1);
                    }
                }
            }
        }
    }
}

