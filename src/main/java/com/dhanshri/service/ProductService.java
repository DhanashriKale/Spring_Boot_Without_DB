package com.dhanshri.service;

import java.util.List;

import com.dhanshri.model.Product;

public interface ProductService {
	public boolean saveProduct(Product product);
	public Product getProductById(Long productId);
	public List<Product> getAllProduct();
	public boolean upadateProduct(Product product);
	public Product getMaxPrizeProducts();

}
