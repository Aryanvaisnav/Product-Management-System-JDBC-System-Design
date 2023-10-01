package com.shopping.controller;

import com.shopping.service.ProductService;

public class UpdateProductPrice {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		productService.updateProductPriceById(60000, 2);

	}

}
