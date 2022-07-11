package com.capgemini.main.service;

import java.util.List;

import com.capgemini.main.model.Flight;

public interface AdminService {
	
	public Flight addFlight(Flight flight);
	
	public Flight updateFlight(int flightId,Flight flight);
	
	public List<Flight> getAllFlight();
	
	public String deleteFlight(int flightId);

}
