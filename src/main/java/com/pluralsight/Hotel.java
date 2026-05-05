package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookeSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfRooms, int numberOfSuites) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;

        //default these to 0
        this.bookedBasicRooms = 0;
        this.bookeSuites = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookeSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookeSuites = bookeSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
}
