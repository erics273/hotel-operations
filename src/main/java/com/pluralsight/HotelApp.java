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

    }

}
