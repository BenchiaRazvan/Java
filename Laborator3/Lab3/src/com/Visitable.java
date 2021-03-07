package com;

public interface Visitable {

    // Interfata pentru clasele Museum, Church, Restaurant impreuna cu functiile respective
    public void getHour();
    public void setHourOpen(int hourOpen);
    public void addLocationTime(String location, Integer time);
    public void showLocationTime();
}
