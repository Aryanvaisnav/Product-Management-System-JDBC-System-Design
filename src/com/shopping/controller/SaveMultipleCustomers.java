package com.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import com.shopping.dto.Customer;
import com.shopping.service.CustomerService;

public class SaveMultipleCustomers {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerService();
		
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("James");
		c1.setEmail("james@mail.com");
		c1.setAddress("London");
		
		Customer c2 = new Customer();
		c2.setId(2);
		c2.setName("Robert");
		c2.setEmail("robert@mail.com");
		c2.setAddress("Sydney");
		
		Customer c3 = new Customer();
		c3.setId(3);
		c3.setName("Lily");
		c3.setEmail("lily@mail.com");
		c3.setAddress("Florida");
		
		List<Customer> customers = new ArrayList<>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		
		customerService.saveMultipleCustomers(customers);
		
		System.out.println("Inserted Successfully........");
		
		System.out.println("All Good......");
		

	}

}
