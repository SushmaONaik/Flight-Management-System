package com.capgemini.main.service;

import java.util.List;

import com.capgemini.main.model.Booking;

public interface BookFlightService {
	
	public Booking bookFlight(Booking booking);
	
	public List<Booking> getFlightByBookingId(int bookingId);
	
	public String cancelBooking(int bookingId);
	

}
