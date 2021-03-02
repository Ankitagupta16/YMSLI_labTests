package com.customerapp.model.service;

import java.util.Optional;

import com.customerapp.model.dao.CustomerDao;
import com.customerapp.model.dao.CustomerDaoImpl;
import com.customerapp.model.entity.Customer;
import com.customerapp.model.exceptions.DataAccessException;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	
	
	public CustomerServiceImpl() {
		customerDao=new CustomerDaoImpl();
	}

	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) throws DataAccessException{
		return customerDao.getCustomerById(id);
	}

}
