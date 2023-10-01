package com.shopping.controller;

import com.shopping.service.ProductService;

public class UpdateProductBrand {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		productService.updateProductBrandById("Oppo", 3);
		
	}

}
