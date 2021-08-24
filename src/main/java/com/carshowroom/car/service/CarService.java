package com.carshowroom.car.service;

import java.util.List;
import java.util.Optional;

import com.carshowroom.car.model.Car;
import com.carshowroom.carNotFoundException.CarException;

public interface CarService {
 
	 public Car getCarbyId(int id) throws CarException;
	 public Car addCar(Car car);
	 public List<Car> carListBytype(String type);
	 public List<Car> getAllCars();
	
	 public Car updateCar(Car car);
	 public boolean carStatusbyId(int carId);
	 public boolean bookCarbyId(int carId);
	 public void deleteCar(int carId);
	
	
}
