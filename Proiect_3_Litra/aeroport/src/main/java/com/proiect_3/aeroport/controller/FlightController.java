package com.proiect_3.aeroport.controller;

import com.proiect_3.aeroport.model.Flight;
import com.proiect_3.aeroport.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.time.LocalDate;
import java.util.List;

@Controller
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/home")
    public String showHomePage(Model model){
        model.addAttribute("flight", null);
        model.addAttribute("numberOfAdults", 0);
        model.addAttribute("numberOfChildren", 0);
        return "home";
    }

    @GetMapping("/search")
    public String searchFlight(@RequestParam String city,
                                @RequestParam String departureDate,
                                @RequestParam String arrivalDate,
                                @RequestParam int numberOfAdults,
                                @RequestParam int numberOfChildren,
                                Model model) {
        List<Flight> flight = flightService.searchFlights(city, LocalDate.parse(departureDate), LocalDate.parse(arrivalDate));
        System.out.println("Found flights: " + flight.size());
        model.addAttribute("flight", flight);
        model.addAttribute("numberOfAdults", numberOfAdults);
        model.addAttribute("numberOfChildren", numberOfChildren);
        return "reserve";
    }
}

