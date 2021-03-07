package com;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Museum extends Location implements Visitable, Payable {

    private LocalTime openingTime, closingTime;
    private double price;

    Museum(String newName) {
        super(newName);
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    @Override
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
    public double getTicketPrice() {
        return price;
    }

    public void setOpeningTime(LocalTime newOpeningTime){
        this.openingTime = newOpeningTime;
    }
    public void setClosingTime(LocalTime newClosingTime){
        this.closingTime = newClosingTime;
    }

}
