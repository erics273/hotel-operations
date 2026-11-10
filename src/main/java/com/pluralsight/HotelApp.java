package com.pluralsight;

public class HotelApp {

    public static void main(String[] args) {

        //test my Room by creating one and for this test making it not available
        Room dirtyRoom = new Room(5, 500, false, true);

        //test my code
        if(dirtyRoom.isAvailable()){
            System.out.println("the room is available");
        }else{
            System.out.println("the room is not available");
        }


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
