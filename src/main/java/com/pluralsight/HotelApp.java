package com.pluralsight;

import java.util.ArrayList;

public class HotelApp {

    public static void main(String[] args) {

        //create the rooms
        Room room1 = new Room(1, false, false, "King");
        Room room2 = new Room(2, true, false, "Double Queen");
        Room room3 = new Room(1, false, true, "Queen");
        Room room4 = new Room(2, false, false, "Double Queen");
        Room room5 = new Room(1, true, true, "King");

        //add the rooms to a list
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);

        //create the reservations with the rooms
        Reservation theReservataion = new Reservation(true, 7, rooms);

        //print the reservation total
        System.out.println("The total fort Reservation is: " + theReservataion.getReservationTotal());

        Room room6 = new Room(1, true, true, "King");

        theReservataion.addRoom(room6);

        //print the reservation total
        System.out.println("The total fort Reservation is: " + theReservataion.getReservationTotal());


        // Create a hotel with 5 suites and 20 rooms
        Hotel hotel = new Hotel("Grand Hotel", 5, 20);

        // Display initial availability
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());
        System.out.println("Available Suites: " + hotel.getAvailableSuites());

        // Book 3 regular rooms
        boolean booked = hotel.bookRoom(3, false);
        System.out.println("Booked 3 rooms: " + booked);

        // Book 2 suites
        booked = hotel.bookRoom(2, true);
        System.out.println("Booked 2 suites: " + booked);

        // Display updated availability
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());
        System.out.println("Available Suites: " + hotel.getAvailableSuites());

        // Try to book more suites than are available
        booked = hotel.bookRoom(5, true);
        System.out.println("Booked 5 suites: " + booked);

        // Try to book more rooms than are available
        booked = hotel.bookRoom(25, false);
        System.out.println("Booked 25 rooms: " + booked);

        // Display final availability
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());
        System.out.println("Available Suites: " + hotel.getAvailableSuites());

        // Test the second constructor with existing bookings
        Hotel hotel2 = new Hotel("Beach Resort", 10, 30, 4, 15);
        System.out.println("\nBeach Resort");
        System.out.println("Available Rooms: " + hotel2.getAvailableRooms());
        System.out.println("Available Suites: " + hotel2.getAvailableSuites());

        // Book additional rooms
        booked = hotel2.bookRoom(5, false);
        System.out.println("Booked 5 rooms: " + booked);

        // Display updated availability
        System.out.println("Available Rooms: " + hotel2.getAvailableRooms());

    }

}
