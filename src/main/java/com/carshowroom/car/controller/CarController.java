package com.carshowroom.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carshowroom.car.model.Car;
import com.carshowroom.car.service.CarService;


@RestController
@RequestMapping(value ="showroom/car")
public class CarController {
	
	@Autowired
	CarService carService;
	
	
	
	@RequestMapping(value = "/getAllCar", method = RequestMethod.GET)
	public List<Car> allCars(){
//		HttpHeaders headers =  new HttpHeaders();
//		headers.add("desc" ,"list of cars");
//		headers.add("type" ,"json data");
//		List<Car> list= carService.getAllCars();
//		
//		ResponseEntity<List<Car>> response = new ResponseEntity<List<Car>>(list, headers, HttpStatus.ACCEPTED);
		
		return carService.getAllCars();
		
	}
	
	@RequestMapping(value = "/addCar", method = RequestMethod.POST)
	public ResponseEntity<Car>  addCar(Car car){
		HttpHeaders headers =  new HttpHeaders();
		headers.add("desc" ,"Adding car");
		headers.add("type" ,"json data");
		Car bean = carService.addCar(car);
		
		ResponseEntity<Car> response = new ResponseEntity<Car>(bean, headers, HttpStatus.ACCEPTED);
		
		return response;
		
	}
	
	@RequestMapping(value = "/getCarById/{carId}", method = RequestMethod.GET)
	public ResponseEntity<Car>  addCar(@RequestParam("carId") int carId){
		HttpHeaders headers =  new HttpHeaders();
		headers.add("desc" ,"Adding car");
		headers.add("type" ,"json data");
		Car bean = carService.getCarbyId(carId);
		
		ResponseEntity<Car> response = new ResponseEntity<Car>(bean, headers, HttpStatus.ACCEPTED);
		
		return response;
		
	}
	

	@RequestMapping(value = "/updateCar", method = RequestMethod.POST)
	public ResponseEntity<Car>  updateCar(Car car){
		HttpHeaders headers =  new HttpHeaders();
		headers.add("desc" ,"updating car ");
		headers.add("type" ,"json data");
		Car bean = carService.updateCar(car);
		
		ResponseEntity<Car> response = new ResponseEntity<Car>(bean, headers, HttpStatus.ACCEPTED);
		
		return response;
		
	}
	
	
	@RequestMapping(value = "/deleteCar", method = RequestMethod.DELETE)
	public ResponseEntity<Car>  deleteCar(Car car){
		HttpHeaders headers =  new HttpHeaders();
		headers.add("desc" ,"delete car ");
		headers.add("type" ,"json data");
		carService.deleteCar(car.getId());
		
		ResponseEntity<Car> response = new ResponseEntity<Car>( headers, HttpStatus.OK);
		
		return response;
		
	}
	@RequestMapping(value = "/bookCar/{carId}", method = RequestMethod.POST)
	public ResponseEntity<Car>  bookCar(@RequestParam("carId")  int  carId){
		HttpHeaders headers =  new HttpHeaders();
		headers.add("desc" ,"booking car ");
		headers.add("type" ,"json data");
		carService.bookCarbyId(carId);
		
		ResponseEntity<Car> response = new ResponseEntity<Car>( headers, HttpStatus.OK);
		
		return response;
		
	}
	
	@RequestMapping(value ="/getCarsByType/{type}", method = RequestMethod.GET )
	public ResponseEntity<List<Car>> getCarsByType(@RequestParam("type") String type){
		
		HttpHeaders headers =  new HttpHeaders();
		headers.add("desc" ,"List of  cars By type "+type);
		headers.add("type" ,"json data");
		
		
		ResponseEntity<List<Car>> response = new ResponseEntity<List<Car>>(carService.carListBytype(type) ,headers, HttpStatus.OK);
		
		return response;
		
	}
	
	
	
	
	
	
	
	
	
	

}
