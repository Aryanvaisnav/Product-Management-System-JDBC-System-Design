package com.shopping.controller;

import com.shopping.service.CustomerService;

public class DisplayAllCustomers {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		customerService.displayAllCustomerDetails();

	}

}
