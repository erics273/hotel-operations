package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    public void getPrice_should_be_accurate_for_king_suite_no_weekend(){
        //arrange
        Reservation theReservation = new Reservation(false, 1, new ArrayList<Room>());
        Room newRoom = new Room(1, true, true, "King");
        theReservation.addRoom(newRoom);

        //act
        BigDecimal price = theReservation.getPrice();

        //assert
        assertEquals(0, price.compareTo(BigDecimal.valueOf(139.00)));
    }

    @Test
    public void getPrice_should_be_accurate_for_king_suite_with_weekend(){
        //arrange
        Reservation theReservation = new Reservation(true, 1, new ArrayList<Room>());
        Room newRoom = new Room(1, true, true, "King");
        theReservation.addRoom(newRoom);

        //act
        BigDecimal price = theReservation.getPrice();

        //assert
        assertEquals(0, price.compareTo(BigDecimal.valueOf(152.90)));
    }

    @Test
    public void getReservationTotal_should_be_accurate_for_king_suite_with_weekend_3_nights(){
        //arrange
        Reservation theReservation = new Reservation(true, 3, new ArrayList<Room>());
        Room newRoom = new Room(1, true, true, "King");
        theReservation.addRoom(newRoom);

        //act
        BigDecimal total = theReservation.getReservationTotal();

        //assert
        assertEquals(0, total.compareTo(BigDecimal.valueOf(458.70)));
    }

}