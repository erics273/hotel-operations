package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void bookroom_should_decrease_available_rooms(){
        //arrange
        Hotel hotel = new Hotel("Grand Hotel", 5, 20);

        //act
        hotel.bookRoom(3, false);

        //assert
        assertEquals(17, hotel.getAvailableRooms());
    }

    @Test
    public void bookroom_should_decrease_available_suites(){
        //arrange
        Hotel hotel = new Hotel("Grand Hotel", 5, 20);

        //act
        hotel.bookRoom(3, true);

        //assert
        assertEquals(2, hotel.getAvailableSuites());
    }

    @Test
    public void bookroom_should_fail_if_no_suites_available(){
        //arrange
        Hotel hotel = new Hotel("Grand Hotel", 5, 20);

        //act
        boolean booked =  hotel.bookRoom(10, true);

        //assert
        assertFalse(booked);
    }

}