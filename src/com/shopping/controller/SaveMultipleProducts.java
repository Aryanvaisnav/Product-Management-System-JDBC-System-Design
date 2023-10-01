package com.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import com.shopping.dto.Product;
import com.shopping.service.ProductService;

public class SaveMultipleProducts {

	public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Mobile");
		p1.setBrand("Moto");
		p1.setStatus("Out Of Stock");
		p1.setPrice(16000);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Laptop");
		p2.setBrand("Apple");
		p2.setStatus("Available");
		p2.setPrice(72000);

		Product p3 = new Product();
		p3.setId(3);
		p3.setName("Television");
		p3.setBrand("OnePlus");
		p3.setStatus("Available");
		p3.setPrice(90000);

		
		
		
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		productService.saveMultipleProducts(products);
		
		System.out.println("Inserted Successfully........");
		
		System.out.println("All Good......");
		

	}

}
