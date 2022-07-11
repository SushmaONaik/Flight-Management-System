package com.capgemini.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.main.model.Booking;

public interface BookFlightRepository extends MongoRepository<Booking, Integer>{

	
	
	

}
