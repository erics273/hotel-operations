package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {
        // Create a room that is clean and not occupied

        Room room1 = new Room(2, 129.99, false, false);

        // Create a room that is occupied

        Room room2 = new Room(1, 89.99, true, false);

        // Create a room that is dirty

        Room room3 = new Room(2, 149.99, false, true);

        // Create a room that is occupied and dirty

        Room room4 = new Room(1, 99.99, true, true);

        // Display the details for room 1

        System.out.println("Room 1");

        System.out.println("Beds: " + room1.getNumberOfBeds());

        System.out.println("Price: $" + room1.getPrice());

        System.out.println("Occupied: " + room1.isOccupied());

        System.out.println("Dirty: " + room1.isDirty());

        System.out.println("Available: " + room1.isAvailable());

        System.out.println();

        // Display the details for room 2

        System.out.println("Room 2");

        System.out.println("Beds: " + room2.getNumberOfBeds());

        System.out.println("Price: $" + room2.getPrice());

        System.out.println("Occupied: " + room2.isOccupied());

        System.out.println("Dirty: " + room2.isDirty());

        System.out.println("Available: " + room2.isAvailable());

        System.out.println();

        // Display the details for room 3

        System.out.println("Room 3");

        System.out.println("Beds: " + room3.getNumberOfBeds());

        System.out.println("Price: $" + room3.getPrice());

        System.out.println("Occupied: " + room3.isOccupied());

        System.out.println("Dirty: " + room3.isDirty());

        System.out.println("Available: " + room3.isAvailable());

        System.out.println();

        // Display the details for room 4

        System.out.println("Room 4");

        System.out.println("Beds: " + room4.getNumberOfBeds());

        System.out.println("Price: $" + room4.getPrice());

        System.out.println("Occupied: " + room4.isOccupied());

        System.out.println("Dirty: " + room4.isDirty());

        System.out.println("Available: " + room4.isAvailable());

        System.out.println();

        Employee eric = new Employee(123, "eric", "the boss", 65, 20);

        System.out.println(eric.getTotalPay());
        System.out.println(eric.getRegularHours());

        eric.punchIn(1);
        eric.punchOut(5);

        System.out.println(eric.getTotalPay());
        System.out.println(eric.getRegularHours());


        eric.punchTimeCard(8, "in");
        eric.punchTimeCard(10, "out");

        System.out.println(eric.getTotalPay());
        System.out.println(eric.getRegularHours());

        eric.punchTimeCard(2, 7);

        System.out.println(eric.getTotalPay());
        System.out.println(eric.getRegularHours());


        //since the would prodce the same hour and ultimately not add to hoursworked
        //im called the method where we pass it a time then
        //calling punchOut that figures the time out
        eric.punchIn(2);
        eric.punchOut();

        System.out.println(eric.getTotalPay());
        System.out.println(eric.getRegularHours());


    }

}
