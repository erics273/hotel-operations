package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
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

        double price = 0;

        //if king, price is 139
        if(roomType.equalsIgnoreCase("king")){
            price += 139;
        }

        //if double  price is 124
        if(roomType.equalsIgnoreCase("double")){
            price += 124;
        }

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
