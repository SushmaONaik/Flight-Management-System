package com.capgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.model.Flight;
import com.capgemini.main.repository.SearchFlightRepository;

@RestController
@RequestMapping("/search")
public class SearchFlightController {
	
	@Autowired
	SearchFlightRepository searchFlightRepo;
	
	@GetMapping("/flight/{flightFrom}/{flightTo}")
	public List<Flight> getAllFlightByData(@RequestBody Flight flight,@PathVariable("flightFrom") String flightFrom,
			@PathVariable("flightTo") String flightTo){
				
		return searchFlightRepo.getAllFlightByData(flightFrom, flightTo);
		
	}

}
