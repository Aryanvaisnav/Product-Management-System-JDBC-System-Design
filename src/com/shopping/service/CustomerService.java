package com.shopping.service;

import java.util.List;

import com.shopping.dao.CustomerDao;
import com.shopping.dto.Customer;

public class CustomerService {

	CustomerDao customerDao = new CustomerDao();

//========================================================================================================================

	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);

	}

//=======================================================================================================================

	public boolean deleteCustomerById(int id) {
		return customerDao.deleteCustomerById(id);
	}

//======================================================================================================================

	public boolean updateCustomerNameById(String name, int id) {
		return customerDao.updateCustomerNameById(name, id);
	}
	
//=======================================================================================================================
	
	public boolean updateCustomerEmailById(String email, int id) {
		return customerDao.updateCustomerEmailById(email, id);
	}
	
//========================================================================================================================
	
	public boolean updateCustomerAddressById(String address, int id) {
		return customerDao.updateCustomerAddressById(address, id);
	}

//========================================================================================================================

	public void displayCustomerDetailsById(int id) {
		customerDao.displayCustomerDetailsById(id);
	}

//=========================================================================================================================

	public void displayAllCustomerDetails() {
		customerDao.displayAllCustomerDetails();
	}

//========================================================================================================================
	
	public void saveMultipleCustomers(List<Customer> customers) {
		customerDao.saveMultipleCustomers(customers);
	}
	
//=======================================================================================================================
	
	public void deleteMultipleCustomers(List<Customer> customers) {
		customerDao.deleteMultipleCustomers(customers);
	}
	
//========================================================================================================================

}
