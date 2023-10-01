package com.shopping.service;

import java.util.List;

import com.shopping.dao.ProductDao;
import com.shopping.dto.Product;

public class ProductService {

	ProductDao productDao = new ProductDao();

//========================================================================================================================

	public Product saveProduct(Product product) {
		return productDao.saveProduct(product);

	}

//=======================================================================================================================

	public boolean deleteProductById(int id) {
		return productDao.deleteProductById(id);
	}

//======================================================================================================================

	public boolean updateProductNameById(String name, int id) {
		return productDao.updateProductNameById(name, id);
	}
	
//=======================================================================================================================
	
	public boolean updateProductBrandById(String brand, int id) {
		return productDao.updateProductBrandById(brand, id);
	}
	
//========================================================================================================================
	
	public boolean updateProductStatusById(String status, int id) {
		return productDao.updateProductStatusById(status, id);
	}
	
//=======================================================================================================================
	
	public boolean updateProductPriceById(double price, int id) {
		return productDao.updateProductPriceById(price, id);
	}
	
//========================================================================================================================

	public void displayProductDetailsById(int id) {
		productDao.displayProductDetailsById(id);
	}

//=========================================================================================================================

	public void displayAllProductDetails() {
		productDao.displayAllProductDetails();
	}

//========================================================================================================================
	
	public void saveMultipleProducts(List<Product> products) {
		productDao.saveMultipleProducts(products);
	}
	
//=======================================================================================================================
	
	public void deleteMultipleProducts(List<Product> products) {
		productDao.deleteMultipleProducts(products);
	}
	
//========================================================================================================================

}
