package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;


public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        Flight flights1 = new Flight("Wrocław", "Warszawa");
        Flight flights2 = new Flight("Wrocław", "Katowice");
        Flight flights3 = new Flight("Wrocław", "Poznań");
        flights.add(flights1);
        flights.add(flights2);
        flights.add(flights3);
        return flights;

    }
}
