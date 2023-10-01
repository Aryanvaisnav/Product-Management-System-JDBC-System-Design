package com.shopping.controller;

import com.shopping.service.ProductService;

public class UpdateProductName {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		productService.updateProductNameById("Mobile", 3);

	}

}
