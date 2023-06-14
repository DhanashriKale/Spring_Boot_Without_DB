package com.dhanshri.serviceIMPL;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanshri.dao.ProductDao;
import com.dhanshri.model.Product;
import com.dhanshri.service.ProductService;
@Service
public class ProductServiceIMPL implements ProductService{

	
	@Autowired
	private ProductDao dao;
	@Override
	public boolean saveProduct(Product product) {
		String productId = new SimpleDateFormat("MMddyyyyhmmss").format(new java.util.Date());	
		product.setProductId(Long.parseLong(productId));
		boolean isadded=dao.saveProduct(product);
		return isadded;
	}

	@Override	public Product getProductById(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	
	  public List<Product> getAllProduct() {
	  
	 List<Product> list=dao.getAllProduct();
	  return list;
	  }
	 

	@Override
	public boolean upadateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.upadateProduct(product);
	}

	@Override
	public Product getMaxPrizeProducts() {

		
		
		return dao.getMaxPrizeProducts();
	}

}
