package com.shopping.controller;

import com.shopping.dto.Customer;
import com.shopping.service.CustomerService;

public class SaveCustomerDetails {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();

		Customer customer = new Customer();
		customer.setId(2);
		customer.setName("Harry");
		customer.setEmail("harry@mail.com");
		customer.setAddress("Alaska");

		customerService.saveCustomer(customer);
		


	}

}
