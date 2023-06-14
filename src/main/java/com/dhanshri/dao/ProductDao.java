package com.dhanshri.dao;

import java.util.List;

import com.dhanshri.model.Product;

public interface ProductDao {
	public boolean saveProduct(Product product);
	public Product getProductById(Long productId);
	public List<Product> getAllProduct();
	public boolean upadateProduct(Product product);
	public Product getMaxPrizeProducts();
}
