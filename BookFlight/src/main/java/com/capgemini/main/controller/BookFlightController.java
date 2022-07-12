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

import com.capgemini.main.exception.NoDataFoundException;
import com.capgemini.main.model.Booking;
import com.capgemini.main.repository.BookFlightRepository;
import com.capgemini.main.service.BookFlightService;

@RestController
@RequestMapping("/book")
public class BookFlightController {
	
	@Autowired
	BookFlightService bookFlightService;
	
	@PostMapping("/booknow")
	public Booking bookFlight(@RequestBody Booking booking) {
		
		return bookFlightService.bookFlight(booking);
	}
	
	@GetMapping("/getFlightById")
	public List<Booking> getBookingById(@PathVariable("bookingId") int bookingId) throws NoDataFoundException
	{
		return bookFlightService.getFlightByBookingId(bookingId);
		
	}
	
	@DeleteMapping("/deleteBooking")
	public String cancelBooking(@PathVariable("bookingId") int bookingId) {
		bookFlightService.cancelBooking(bookingId);
		return "booking cancelled successfully!!! your amount will be debited "
				+ "to your registered bank account within 3-5 working days";
		
	}
	
	
	

}
