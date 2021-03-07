package com;


public class Hotel extends Location implements Payable{

    private int price;

    Hotel(String newName) {
        super(newName);
    }

    @Override
    public double getTicketPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        this.price = price;
    }
}
