package com.capgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.model.Flight;
import com.capgemini.main.service.AdminService;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/addFlight")
	public Flight addFlight(@RequestBody Flight flight) {
		return adminService.addFlight(flight);
		
	}
	
	@GetMapping("/getAllFlights")
	public List<Flight> getAllFlights(){
		return  adminService.getAllFlight();
		
	}
	
	@PostMapping("/updateFlight/{flightId}")
	public Flight updateFlight(@RequestBody Flight flight, @PathVariable("flightId") int flightId) {
		return  adminService.updateFlight(flightId, flight);
		
	}
	
	@DeleteMapping("/deleteFlight/{flightId}")
	public String deleteFlight(@RequestBody Flight flight, @PathVariable("flightId") int flightId) {
		 adminService.deleteFlight(flightId);
		return "Flight deleted successfully";
		
	}

}
