package com.carshowroom.customer.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.carshowroom.car.model.Car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("customers")
public class Customer {
	
	@Id
	private Integer customerId;
	private String customerName;
	private String customerEmailId;
	private String password;
	private Boolean isBuyer;
	
	private List<Integer> carId;
	private String city;
	private String state;
	private  Car car;
	
	
	

}
