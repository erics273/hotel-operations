package com.pluralsight;

public class Reservation {

    private int numberOfNights;
    private boolean weekend;
    private Room room;

    public Reservation(boolean weekend, int numberOfNights, Room room) {
        this.room = room;
        this.weekend = weekend;
        this.numberOfNights = numberOfNights;
        this.room = room;
    }


    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    /*
    DERIVED GETTERS
     */

    //get price
    public double getPrice() {

        //get thebase price for the room from the room
        double price = room.getPrice();

        //if weekend +10%
        if(weekend){
            price *= 1.10;
        }

        //return price
        return price;
    }

    //Gets the price based on the numeber of nights
    public double getReservationTotal() {

        return getPrice() *  numberOfNights;

    }




}
