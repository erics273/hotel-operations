package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    //derived getter using other properties on the class
    public boolean isAvailable() {

        //--fancy one liner
        // return !dirty && !occupied;

        //full if statement
        if(dirty == false && occupied == false) {
            return true;
        }

        return false;

    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
}
