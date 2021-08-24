package com.carshowroom.customer.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.carshowroom.customer.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
	
	List<Customer> findByCityIgnoreCase(String city);
	

}
