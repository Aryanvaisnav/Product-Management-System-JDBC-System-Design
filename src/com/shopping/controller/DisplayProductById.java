package com.shopping.controller;

import com.shopping.service.ProductService;

public class DisplayProductById {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		productService.displayProductDetailsById(1);

	}

}
