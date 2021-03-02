package com.customerapp.controller;


import java.util.Optional;

import com.customerapp.model.entity.Customer;
import com.customerapp.model.service.CustomerService;
import com.customerapp.model.service.CustomerServiceImpl;

public class CustomerController {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		CustomerService customerService=new CustomerServiceImpl();

		/**------------------ adding customer-----------------------------------*/
//		Customer customer=new Customer("ankita", "delhi", "987654321", new Date(2012,02,23));	
//		customerService.addCustomer(customer);
//		Customer customer=new Customer("amit", "kanpur", "990654321", new Date(2002,02,22));	
//		customerService.addCustomer(customer);
		
		
		/**-------------------get Customer Name by Id---------------------------*/
		Optional<Customer> customerOpt=customerService.getCustomerById(4);
		try {
		String customerName=customerOpt.map(cust->cust.getName()).orElse("Customer with given id not found");
		System.out.println(customerName);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
