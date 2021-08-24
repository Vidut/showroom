package com.carshowroom.car.model;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("car")
public class Car {
	
	@Id
	Integer id;
	String name;
	String varient;
	Integer launchYear;
	String type;
	
	String engine;
	Double displacement;
	Double fuleType;
	String transmission;
	String ownership;
	Integer registrationYear;
	Double seatingCapacity;
	Integer kilometerDone;
	Integer doors;
	Integer bootspace;
	String colour;
	private Binary[] images;
	private Binary[] soundNotes;
	private String headLamps;
	private Boolean headLampWasher;
	private Boolean sunroof;
	private Double length;
	private Double width;
	private Double height;
	private Double wheelBase;
	private Double weight;
	private Integer row;
	private Boolean isBooked;
	
	
	
	

}
