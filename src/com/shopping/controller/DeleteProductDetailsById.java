package com.shopping.controller;

import com.shopping.service.ProductService;

public class DeleteProductDetailsById {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		productService.deleteProductById(5);

	}

}
