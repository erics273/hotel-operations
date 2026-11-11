package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    public void getPrice_should_be_accurate_for_king_suite_no_weekend(){
        //arrange
        Reservation theReservation = new Reservation("king", 1, false);

        //act
        double price = theReservation.getPrice();

        //assert
        assertEquals(139, price);
    }

    @Test
    public void getPrice_should_be_accurate_for_king_suite_with_weekend(){
        //arrange
        Reservation theReservation = new Reservation("king", 1, true);

        //act
        double price = theReservation.getPrice();

        //assert
        assertEquals(152.9, price);
    }

    @Test
    public void getReservationTotal_should_be_accurate_for_king_suite_with_weekend_3_nights(){
        //arrange
        Reservation theReservation = new Reservation("king", 3, true);

        //act
        double total = Math.round(theReservation.getReservationTotal());

        //assert
        assertEquals(459, total);
    }

}