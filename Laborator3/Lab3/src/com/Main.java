package com;


public class Main {
    public static void main(String[] args) {

        // Creeare de obiecte respectiv afisare

        Visitable churchA = new Church("Church A");
        churchA.setHourOpen(6);
        churchA.addLocationTime("Church B", 30);
        churchA.addLocationTime("Restaurant", 10);

        Visitable churchB = new Church("Church B");
        churchB.setHourOpen(6);
        churchB.addLocationTime("Church A", 30);
        churchB.addLocationTime("Restaurant",20);

        Museum museumB = new Museum("Museum B");
        museumB.setHourOpen(7);
        museumB.setPrice(15);
        museumB.addLocationTime("Museum A", 20);
        museumB.addLocationTime("Church A", 20);

        Payable hotel = new Hotel("Hotel");
        hotel.setPrice(250);
        hotel.addLocationTime("Museum A", 10);
        hotel.addLocationTime("MuseumB", 50);

        Museum museumA = new Museum("Museum A");
        museumA.setHourOpen(7);
        museumA.setPrice(20);
        museumA.addLocationTime("MuseumB", 20);
        museumA.addLocationTime("Church A", 20);
        museumA.addLocationTime("Church B", 10);

        Classifiable city = new City("City");
        city.addLocation("Hotel");   // Adaugam locatii in obiectul city
        city.addLocation("Museum A");
        city.addLocation("MuseumB");
        city.addLocation("Church A");
        city.addLocation("Church B");
        city.addLocation("Restaurant");

        Visitable Restaurant = new Restaurant("Restaurant");
        Restaurant.setHourOpen(8);

        hotel.showLocationTime();
        museumA.showLocationTime();
        museumB.showLocationTime();
        churchA.showLocationTime();
        churchB.showLocationTime();
        hotel.showLocationTime();

    }
}
