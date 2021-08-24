package com.carshowroom.customer.service;

import java.util.List;

import com.carshowroom.car.model.Car;
import com.carshowroom.customer.model.Customer;


public interface CustomerService {
	
	public Customer getCustomerById(int customerId);
	public List<Customer> getCustomerByCity(String city);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomerById(int customerId);
	public Customer getCustomerByEmailid(String emailId);
	public List<Customer> getCustomerAutoComplete(String query);
	public List<Customer> getAllCustomer();
	public List<Car> getCustomerCars(String CustomerCarsId);
	public Customer addCustomer(Customer customer);
	
	
	
	

}
