package com;

import java.time.LocalTime;

public class Restaurant extends Location implements Visitable{

    private LocalTime openingTime, closingTime;         // Ora de deschidere respectiv cea de inchidere

    Restaurant(String newName) {
        super(newName);
    }
    public void setOpeningHour(LocalTime openingTime){
        this.openingTime = openingTime;
    }
    public void setClosingHour(LocalTime closingTime){
        this.closingTime = closingTime;
    }
    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }
    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }
    public void setOpeningTime(LocalTime newOpeningTime){
        this.openingTime = newOpeningTime;
    }
    public void setClosingTime(LocalTime newClosingTime){
        this.closingTime = newClosingTime;
    }

}
