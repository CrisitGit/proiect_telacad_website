package com.proiect_3.aeroport.repository;

import com.proiect_3.aeroport.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
