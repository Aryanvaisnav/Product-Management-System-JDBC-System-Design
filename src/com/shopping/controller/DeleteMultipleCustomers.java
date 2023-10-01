package com.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import com.shopping.dto.Customer;
import com.shopping.service.CustomerService;

public class DeleteMultipleCustomers {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerService();
		
		Customer c1 = new Customer();
		c1.setId(1);
		
		
		Customer c2 = new Customer();
		c2.setId(2);
		
		
		Customer c3 = new Customer();
		c3.setId(3);
		
		
		List<Customer> customers = new ArrayList<>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		
		customerService.deleteMultipleCustomers(customers);
		
		System.out.println("Deleted Successfully........");
		
		System.out.println("All Good......");
		

	}

}
