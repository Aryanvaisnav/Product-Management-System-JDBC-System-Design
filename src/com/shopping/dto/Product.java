package com.shopping.dto;

public class Product {
	private int id;
	private String name;
	private String brand;
	private String status;
	private int price;

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

	// Brand

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// Status

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// Price

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
