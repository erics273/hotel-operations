package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    //the constructor, helps us instantiate or create a new room?
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }


    public boolean isOccupied() {
        return isOccupied;
    }


    public boolean isDirty() {
        return isDirty;
    }

    //calculated or derived
    public boolean isAvailable(){
        //if its not dirt and not occupied then its available
//        if(!this.isOccupied() && !this.isDirty()){
//            return true;
//        }
//
//        //otherwise its not avaialable
//        return false;

        return !this.isOccupied() && !this.isDirty();

//        if(this.isDirty() && this.isOccupied()){
//            return false;
//        }else {
//            return true;
//        }

    }

    public void checkOut(){
        this.cleanroom();
        this.isOccupied = false;
    }

    public void cleanroom(){
        this.isDirty = false;
    }

    public void checkIn(){
        if(this.isAvailable()){
            this.isOccupied = true;
            this.isDirty = true;
        }else{
            System.out.println("sorry, not available");
        }

    }

}
