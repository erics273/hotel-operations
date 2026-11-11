package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private boolean occupied;
    private boolean dirty;
    private String type;


    public Room(int numberOfBeds, boolean occupied, boolean dirty,  String type) {
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.dirty = dirty;
        this.type = type;
    }

    public void cleanRoom(){
        this.dirty = false;
    }

    //derived getter using other properties on the class
    public boolean isAvailable() {

        //--fancy one liner
        // return !dirty && !occupied;

        //full if statement return true if not dirty and not occupied
        if(dirty == false && occupied == false) {
            //room available
            return true;
        }

        //room is dirty and occupied so its not available
        return false;

    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public double getPrice() {
        double price = 0;

        //if king, price is 139
        if(type.equalsIgnoreCase("king")){
            price += 139;
        }

        //if double  price is 124
        if(type.equalsIgnoreCase("double")){
            price += 124;
        }

        return price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void cleanRoom(){
        this.dirty = false;
    }

    public void checkIn(){
        this.occupied = true;
        this.dirty = true;
    }

    public void checkOut(){
        this.occupied = false;
        this.cleanRoom();
    }
}
