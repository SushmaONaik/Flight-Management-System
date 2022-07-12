package com.capgemini.main.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.capgemini.main.model.Flight;

public interface SearchFlightService {
	
	//public List<Flight> getAllFlightByData(String flightFrom,String flightTo);
	public List<Flight> getAllFlightByData(@Param("flightFrom") String flightFrom,@Param("flightTo") String flightTo);

}
