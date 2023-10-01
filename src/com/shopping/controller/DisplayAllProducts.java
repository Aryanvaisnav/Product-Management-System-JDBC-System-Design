package com.shopping.controller;

import com.shopping.service.ProductService;

public class DisplayAllProducts {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		productService.displayAllProductDetails();

	}

}
