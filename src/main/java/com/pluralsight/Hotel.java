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

        //figure out if they are booking suite or not

        //if its a suite see if any are available and return true if there were and we booked it
        //probaly need to update booked suites if succesfull

        return false;
    }

    public int getAvailableRooms() {
        //figure out how many room are available by working with bookedRooms vs numberofrooms
        return 0;
    }
    public int getAvailableSuites(){
        //figure out how many suites are available by working with bookedSuites vs numberofsuites
        return 0;
    }
}
