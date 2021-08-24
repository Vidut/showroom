package com.carshowroom.customer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshowroom.car.model.Car;
import com.carshowroom.car.repository.CarRepository;
import com.carshowroom.carNotFoundException.CarException;
import com.carshowroom.customer.exception.CustomerNotFoundException;
import com.carshowroom.customer.model.Customer;
import com.carshowroom.customer.repository.CustomerRepository;

@Service

public class CustomerServiceImplementation  implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CarRepository carRepository;

	@Override
	public Customer getCustomerById(int customerId) {
		Optional<Customer> bean = customerRepository.findById(customerId);
		if (bean.isEmpty()) {
			throw new CustomerNotFoundException("Customer not found by Id : " + customerId);

		}
		return bean.get();
		
	}

	@Override
	public List<Customer> getCustomerByCity(String city) {
		return customerRepository.findByCityIgnoreCase(city);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomerById(int customerId) {
		customerRepository.deleteById(customerId);
		
	}

	@Override
	public Customer getCustomerByEmailid(String emailId) {
		List<Customer> bean = new ArrayList();
		Customer test = new Customer();
		if (bean == null) {
			throw new CustomerNotFoundException("Customer not found by eamilId : " + emailId);

		}
		return test;
		
	}

	@Override
	public List<Customer> getCustomerAutoComplete(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public List<Car> getCustomerCars(String CustomerCarsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

}
