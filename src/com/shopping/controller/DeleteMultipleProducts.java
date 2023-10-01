package com.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import com.shopping.dto.Product;
import com.shopping.service.ProductService;

public class DeleteMultipleProducts {

	public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		
		Product p1 = new Product();
		p1.setId(1);
		
		
		Product p2 = new Product();
		p2.setId(2);
		
		
		Product p3 = new Product();
		p3.setId(3);
		
		
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		productService.deleteMultipleProducts(products);
		
		System.out.println("Deleted Successfully........");
		
		System.out.println("All Good......");
		

	}

}
