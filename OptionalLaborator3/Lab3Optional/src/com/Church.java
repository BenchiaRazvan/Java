package com;

import java.time.LocalTime;

public class Church extends Location implements Visitable{

    private LocalTime openingTime, closingTime;

    Church(String newName) {
        super(newName);
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }
    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setOpeningHour(LocalTime openingTime){
        this.openingTime = openingTime;
    }
    public void setClosingHour(LocalTime closingTime){
        this.closingTime = closingTime;
    }

    public void setOpeningTime(LocalTime newOpeningTime){
        this.openingTime = newOpeningTime;
    }
}
