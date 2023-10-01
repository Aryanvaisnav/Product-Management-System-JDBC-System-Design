package com.shopping.dto;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String address;

	// Id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Address
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
