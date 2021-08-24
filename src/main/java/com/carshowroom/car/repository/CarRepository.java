package com.carshowroom.car.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.carshowroom.car.model.Car;




@Repository
public interface CarRepository extends MongoRepository<Car, Integer> {
	
	 List<Car>  findByTypeIgnoreCase(String type);
	 
	 
	 

}
