package com;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        City city = new City("city");
        Church v1 = new Church("v1");
        Church v2 = new Church("v2");
        Museum v3 = new Museum("v3");
        Restaurant v4 = new Restaurant("v4");
        Restaurant v5 = new Restaurant("v5");
        Hotel v6 = new Hotel("v6");

        city.addLocation(v1);
        city.addLocation(v2);
        city.addLocation(v3);
        city.addLocation(v4);
        city.addLocation(v5);
        city.addLocation(v6);

        city.showNodes();

        v1.setOpeningTime(LocalTime.of(9,30));                  // Setez ora de deschidere la 9:30
        System.out.println(v1.getOpeningTime());
        v1.setCloseTime(v1);                                                // Afisez faptul ca ora default este 20:00
        System.out.println(v1.getClosingTime());
        System.out.println(Visitable.getVisitingDuration(v1));

        TravelPlan travel = new TravelPlan();    // Creez un obiect de tip TravelPlan si adaug locatiile
        travel.addLocation(v3);
        travel.addLocation(v2);
        travel.addLocation(v6);
        travel.addLocation(v4);
        travel.addLocation(v5);
        travel.addLocation(v1);

        System.out.println(travel.getNodes());      // Afisez faptul ca au fost adaugate in ordinea preferintelor.
    }

}
