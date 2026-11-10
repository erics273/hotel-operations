package com.pluralsight;

import java.util.ArrayList;

public class Reservation {

    private int numberOfNights;
    private boolean weekend;
    private ArrayList<Room> rooms;

    public Reservation(boolean weekend, int numberOfNights, ArrayList<Room> rooms) {
        this.weekend = weekend;
        this.numberOfNights = numberOfNights;
        this.rooms = rooms;
    }

    public Reservation(int numberOfNights, boolean weekend) {
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
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

        //get thebase price for the rooms from the room
        for(Room room :  rooms){
            price += room.getPrice();
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
