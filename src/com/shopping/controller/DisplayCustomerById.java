package com.shopping.controller;

import com.shopping.service.CustomerService;

public class DisplayCustomerById {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		customerService.displayCustomerDetailsById(1);

	}

}
