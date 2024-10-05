package com.proiect_3.aeroport.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private String airline;

    public Flight() {
    }

    public Flight(String city, LocalDate departureDate, LocalDate arrivalDate, String airline) {
        this.city = city;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.airline = airline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", airline='" + airline + '\'' +
                '}';
    }

}
