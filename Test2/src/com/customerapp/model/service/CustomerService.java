package com.customerapp.model.service;
import java.util.Optional;

import com.customerapp.model.entity.Customer;
import com.customerapp.model.exceptions.DataAccessException;

public interface CustomerService {
	
	public void addCustomer(Customer customer);
	public Optional<Customer> getCustomerById(int id) throws DataAccessException;
}
