package com.proiect_3.aeroport.service;

import com.proiect_3.aeroport.model.Flight;
import com.proiect_3.aeroport.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class FlightService {


    @Autowired
    private FlightRepository flightRepository;


    public List<Flight> searchFlights(String city, LocalDate departureDate, LocalDate arrivalDate) {
        List<Flight> flight = flightRepository.findByCityAndDepartureDateAndArrivalDate(city, departureDate, arrivalDate);
        System.out.println("Found " + flight.size() + " flights.");
        return flight;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }
}
