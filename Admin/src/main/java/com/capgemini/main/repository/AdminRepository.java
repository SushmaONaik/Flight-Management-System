package com.capgemini.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.main.model.Flight;

public interface AdminRepository extends MongoRepository<Flight,Integer>{
	
	

}
