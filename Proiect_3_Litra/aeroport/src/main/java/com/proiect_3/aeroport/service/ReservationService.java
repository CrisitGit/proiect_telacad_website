package com.proiect_3.aeroport.service;

import com.proiect_3.aeroport.model.Reservation;
import com.proiect_3.aeroport.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Transactional
    public void createReservation(Long userId, Long flightId, int numberOfAdults, int numberOfChildren) {
        System.out.println("Creating reservation for User ID: " + userId + ", Flight ID: " + flightId);
        Reservation reservation = new Reservation();
        reservation.setUserId(userId);
        reservation.setFlightId(flightId);
        reservation.setNumberOfAdults(numberOfAdults);
        reservation.setNumberOfChildren(numberOfChildren);
        System.out.println("Reservation: " + reservation);
        reservationRepository.save(reservation);
    }

    public void createReservation(Reservation reservation) {
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }
}