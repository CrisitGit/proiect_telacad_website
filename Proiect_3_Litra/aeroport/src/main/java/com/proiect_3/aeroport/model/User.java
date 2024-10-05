package com.proiect_3.aeroport.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Getter
    private String password;

    public void setId(Long id) {
        this.id = id;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    @OneToMany(mappedBy = "user")
    private Set<Reservation> reservations;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
