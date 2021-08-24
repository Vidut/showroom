package com.carshowroom.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carshowroom.car.model.Car;
import com.carshowroom.customer.model.Customer;
import com.carshowroom.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	

	@RequestMapping(value = "/getAllCustomer", method = RequestMethod.GET)
	public List<Customer> allCustomers(){
//		HttpHeaders headers =  new HttpHeaders();
//		headers.add("desc" ,"list of customers");
//		headers.add("type" ,"json data");
//		List<Car> list= carService.getAllCustomer();
//		
//		ResponseEntity<List<Car>> response = new ResponseEntity<List<Car>>(list, headers, HttpStatus.ACCEPTED);
		
		return customerService.getAllCustomer();
		
	}
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public ResponseEntity<Customer>  addcustomer(Customer customer){
		HttpHeaders headers =  new HttpHeaders();
		headers.add("desc" ,"Adding Customer");
		headers.add("type" ,"json data");
		Customer bean = customerService.addCustomer(customer);
		
		ResponseEntity<Customer> response = new ResponseEntity<Customer>(bean, headers, HttpStatus.ACCEPTED);
		
		return response;
		
	}
	
	@RequestMapping(value = "/getCustomerById/{customerId}", method = RequestMethod.GET)
	public ResponseEntity<Customer>  addCustomer(@RequestParam("customerId") int customerId){
		HttpHeaders headers =  new HttpHeaders();
		headers.add("desc" ,"Adding customer");
		headers.add("type" ,"json data");
		Customer bean = customerService.getCustomerById(customerId);
		
		ResponseEntity<Customer> response = new ResponseEntity<Customer>(bean, headers, HttpStatus.ACCEPTED);
		
		return response;
		
	}
	

	@RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
	public ResponseEntity<Customer>  updateCar(@RequestBody Customer customer){
		HttpHeaders headers =  new HttpHeaders();
		headers.add("desc" ,"updating Customer ");
		headers.add("type" ,"json data");
		Customer bean = customerService.updateCustomer(customer);
		
		ResponseEntity<Customer> response = new ResponseEntity<Customer>(bean, headers, HttpStatus.ACCEPTED);
		
		return response;
		
	}
	
	
	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.DELETE)
	public ResponseEntity<Customer>  deleteCustomer(Customer customer){
		HttpHeaders headers =  new HttpHeaders();
		headers.add("desc" ,"delete car ");
		headers.add("type" ,"json data");
		customerService.deleteCustomerById(customer.getCustomerId());
		
		ResponseEntity<Customer> response = new ResponseEntity<Customer>( headers, HttpStatus.OK);
		
		return response;
		
	}
	

}
