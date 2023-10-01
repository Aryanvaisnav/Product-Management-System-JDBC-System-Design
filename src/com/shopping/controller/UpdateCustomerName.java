package com.shopping.controller;

import com.shopping.service.CustomerService;

public class UpdateCustomerName {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		customerService.updateCustomerNameById("Tom", 5);

	}

}
