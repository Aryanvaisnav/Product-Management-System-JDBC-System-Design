package com.shopping.controller;

import com.shopping.service.ProductService;

public class UpdateProductStatus {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		productService.updateProductStatusById("Available", 3);

	}

}
