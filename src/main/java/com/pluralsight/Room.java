package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

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
