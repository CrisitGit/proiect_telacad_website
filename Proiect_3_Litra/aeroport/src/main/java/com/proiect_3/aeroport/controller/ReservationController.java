package com.proiect_3.aeroport.controller;

import com.proiect_3.aeroport.model.User;
import com.proiect_3.aeroport.repository.FlightRepository;
import com.proiect_3.aeroport.repository.UserRepository;
import com.proiect_3.aeroport.service.ReservationService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FlightRepository flightRepository;

    @PostMapping("/reserve")
    public String reserveFlight(@RequestParam Long flightId,
                                @RequestParam int numberOfAdults,
                                @RequestParam int numberOfChildren,
                                HttpSession session,
                                Model model) {
        User currentUser = (User) session.getAttribute("currentUser");

        if (currentUser == null) {
            return "redirect:/login";
        }

        System.out.println("User ID: " + currentUser.getId());
        System.out.println("Flight ID: " + flightId);
        System.out.println("Number of Adults: " + numberOfAdults);
        System.out.println("Number of Children: " + numberOfChildren);

        reservationService.createReservation(currentUser.getId(), flightId, numberOfAdults, numberOfChildren);

        return "redirect:/home";
    }
}
