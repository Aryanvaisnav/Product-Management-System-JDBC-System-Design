package com.shopping.controller;

import com.shopping.service.CustomerService;

public class UpdateCustomerAddress {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		customerService.updateCustomerAddressById("New York", 5);

	}

}
