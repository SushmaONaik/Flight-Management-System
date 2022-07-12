package com.capgemini.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.model.Flight;
import com.capgemini.main.repository.SearchFlightRepository;
import com.capgemini.main.service.SearchFlightService;

@Service
public class SearchFlightServiceImpl implements SearchFlightService{
	
	@Autowired
	SearchFlightRepository searchFlightRepository;

	@Override
	public List<Flight> getAllFlightByData(String flightFrom, String flightTo) {
		
		return searchFlightRepository.findAll() ;
	}

}
