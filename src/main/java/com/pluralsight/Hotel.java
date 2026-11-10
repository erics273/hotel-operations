package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite){

        boolean booked = false;

        if(suite){

            if(getAvailableSuites() >= roomCount){
                this.bookedSuites += roomCount;
                booked = true;
            }

        }else{
            if(getAvailableRooms() >= roomCount){
                this.bookedRooms += roomCount;
                booked = true;
            }
        }

        return booked;
    }

    public int getAvailableRooms() {
        int availableRooms = numberOfRooms - bookedRooms;
        return (availableRooms < 0) ? 0 : availableRooms;
    }

    public int getAvailableSuites(){
        //figure out how many suites are available by working with bookedSuites vs numberofsuites
        int availableSuites = numberOfSuites - bookedSuites;
        return (availableSuites < 0) ? 0 : availableSuites;
    }
}
