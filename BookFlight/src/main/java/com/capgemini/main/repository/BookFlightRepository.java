package com.capgemini.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.main.model.Booking;

@Repository
public interface BookFlightRepository extends MongoRepository<Booking, Integer>{

	
	
	

}
