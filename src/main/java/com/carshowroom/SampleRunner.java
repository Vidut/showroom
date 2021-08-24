package com.carshowroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.carshowroom.car.model.Car;
import com.carshowroom.car.service.CarService;

@Component
public class SampleRunner implements CommandLineRunner{
	
	@Autowired
	CarService carService;
	

	@Override
	public void run(String... args) throws Exception {
		Car car =  new Car(2, "Harrier", "xt+", 2019, "SUV", "Disel", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null);
		System.out.println(carService.getAllCars().toString());
		System.out.println(carService.addCar(car));
	}

}
