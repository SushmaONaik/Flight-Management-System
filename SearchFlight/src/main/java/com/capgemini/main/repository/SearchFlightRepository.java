package com.capgemini.main.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.main.model.Flight;

@Repository
public interface SearchFlightRepository extends MongoRepository<Flight,Integer>{
	
	
	//List<Flight> getAllFlightByData(@Param("flightFrom") String flightFrom,@Param("flightTo") String flightTo);
	


}
