package com.capgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.model.Booking;
import com.capgemini.main.repository.BookFlightRepository;

@RestController
@RequestMapping("/book")
public class BookFlightController {
	
	@Autowired
	BookFlightRepository bookFlightRepo;
	
	@PostMapping("/booknow")
	public Booking bookFlight(@RequestBody Booking booking) {
		
		return bookFlightRepo.save(booking);
	}
	
	public List<Booking> getBookingById(@PathVariable("bookingId") int bookingId){
		return bookFlightRepo.findAll();
		
	}
	
	
	

}
