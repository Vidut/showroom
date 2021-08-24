package com.carshowroom.car.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshowroom.car.model.Car;
import com.carshowroom.car.repository.CarRepository;
import com.carshowroom.carNotFoundException.CarException;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarRepository carRepository;

	@Override
	public Car getCarbyId(int id) throws CarException {

		Optional<Car> bean = carRepository.findById(id);
		if (bean.isEmpty()) {
			throw new CarException("Car not found by Id : " + id);

		}
		return bean.get();
	}

	@Override
	public Car addCar(Car car) {

		return carRepository.save(car);

	}

	@Override
	public List<Car> carListBytype(String type) {
	
		return carRepository.findByTypeIgnoreCase(type);
	}

	

	

	@Override
	public boolean carStatusbyId(int carId) {
		
		 return getCarbyId(carId).getIsBooked();
	}

	@Override
	public boolean bookCarbyId(int carId) {
		Car bean  = getCarbyId(carId);
		if(!bean.getIsBooked()) {
			bean.setIsBooked(true);
			return true;
		}
		return false;
	}

	@Override
	public void deleteCar(int carId) {
		carRepository.deleteById(carId);

	}

	@Override
	public Car updateCar(Car car) {
		return carRepository.save(car);
	}

	@Override
	public List<Car> getAllCars() {
		return carRepository.findAll();
	}

	

}
