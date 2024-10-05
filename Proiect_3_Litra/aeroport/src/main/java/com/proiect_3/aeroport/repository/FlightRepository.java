package com.proiect_3.aeroport.repository;

import com.proiect_3.aeroport.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByCityAndDepartureDateAndArrivalDate(String city, LocalDate departureDate, LocalDate arrivalDate);
}
