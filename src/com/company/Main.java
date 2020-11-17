package com.company;

import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

public class Main {

    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        airport.getAllAircrafts();
        System.out.println(airport.getAllAircrafts());
        System.out.println(airport.getAllAircrafts().size());

    }
}
