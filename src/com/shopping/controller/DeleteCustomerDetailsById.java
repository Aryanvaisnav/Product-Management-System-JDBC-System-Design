package com.shopping.controller;

import com.shopping.service.CustomerService;

public class DeleteCustomerDetailsById {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		customerService.deleteCustomerById(2);

	}

}
