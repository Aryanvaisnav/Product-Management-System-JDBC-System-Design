package com.shopping.controller;

import com.shopping.dto.Product;
import com.shopping.service.ProductService;

public class SaveProductDetails {

	public static void main(String[] args) {

		ProductService productService = new ProductService();

		Product product = new Product();
		product.setId(1);
		product.setName("Television");
		product.setBrand("Sony");
		product.setStatus("Available");
		product.setPrice(80000);
		
		productService.saveProduct(product);

	}

}
