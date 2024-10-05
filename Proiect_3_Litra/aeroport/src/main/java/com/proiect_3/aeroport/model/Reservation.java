package com.proiect_3.aeroport.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    private Long userId;
    @Getter
    private Long flightId;
    @Getter
    private int numberOfAdults;
    @Getter
    private int numberOfChildren;
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "flight")
    private Flight flight;



    public void setId(Long id) {
        this.id = id;
    }



    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }



    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public Long getId() {
        return id;
    }
}
