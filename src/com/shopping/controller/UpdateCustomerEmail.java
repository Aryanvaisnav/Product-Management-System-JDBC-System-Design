package com.shopping.controller;

import com.shopping.service.CustomerService;

public class UpdateCustomerEmail {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		customerService.updateCustomerEmailById("Tom@mail.com", 5);

	}

}
