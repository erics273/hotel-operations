package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void isDirty_should_be_true_if_room_is_dirty() {
        //arrange
        Room someRoom = new Room(1, true, true, "King");

        //act
        boolean dirty = someRoom.isDirty();

        //assert
        assertTrue(dirty);
    }

    @Test
    public void checkIn_room_should_not_be_available_if_we_check_in() {
        //arrange
        Room someRoom = new Room(1, false, false, "King");

        //act
        someRoom.checkIn();

        //assert
        assertFalse(someRoom.isAvailable());

    }

    @Test
    public void checkOut_room_should_available_if_we_check_out() {
        //arrange
        Room someRoom = new Room(1, true, true, "King");

        //act
        someRoom.checkOut();

        //assert
        assertTrue(someRoom.isAvailable());

    }

    @Test
    public void checkOut_room_should_clean_if_we_check_out() {
        //arrange
        Room someRoom = new Room(1, true, true, "King");

        //act
        someRoom.checkOut();

        //assert
        assertFalse(someRoom.isDirty());

    }

    @Test
    public void checkOut_room_should_notOccupied_if_we_check_out() {
        //arrange
        Room someRoom = new Room(1, true, true, "King");

        //act
        someRoom.checkOut();

        //assert
        assertFalse(someRoom.isOccupied());

    }

    @Test
    public void isAvailable_should_be_true_if_room_is_clean_and_not_occupied(){
        //arrange
        Room someRoom = new Room(1, false, false, "King");

        //act
        boolean isAvailable = someRoom.isAvailable();

        //assert
        assertTrue(isAvailable);

    }

    @Test
    public void isAvailable_should_be_false_if_room_is_not_occupied_but_dirty(){
        //arrange
        Room someRoom = new Room(1, false, true, "King");

        //act
        boolean isAvailable = someRoom.isAvailable();

        //assert
        assertFalse(isAvailable);

    }

    @Test
    public void isAvailable_should_be_false_if_room_is_occupied_but_clean(){
        //arrange
        Room someRoom = new Room(1, true, false, "King");

        //act
        boolean isAvailable = someRoom.isAvailable();

        //assert
        assertFalse(isAvailable);

    }



}