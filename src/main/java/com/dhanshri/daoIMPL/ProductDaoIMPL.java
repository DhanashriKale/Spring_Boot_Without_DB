package com.dhanshri.daoIMPL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dhanshri.dao.ProductDao;
import com.dhanshri.model.Product;
@Repository
public class ProductDaoIMPL implements ProductDao {

	List<Product> list=new ArrayList<>();
	
	
	public ProductDaoIMPL() {
		list.add(new Product(1l,"pen",1l,1l,10,120.00));
		list.add(new Product(2l,"Book",1l,1l,10,120.00));

	}

	@Override
	public boolean saveProduct(Product product) {
		
		
		boolean isExist=false;
		for (Product productdb : list) {
			if(productdb.getProductName().equalsIgnoreCase(product.getProductName()))
			{
			isExist=true;
			break;
			}
		}
		list.add(product);
		return isExist;
	}

	@Override
	public Product getProductById(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public boolean upadateProduct(Product product) {
		// TODO Auto-generated method stub
		boolean isupdated=false;
		for (Product productdb : list) {
			if(productdb.getProductId().equals(product.getProductId()))
			{
				list.set(list.indexOf(productdb), product);
				isupdated=true;
				break;
			}
			
		}
		System.out.println(list);
		return isupdated;
	}

	@Override
	public Product getMaxPrizeProducts() {
		
	Product maxproduct=null;
	for (Product product : list) {
		
		Double max = 0.0;
		if(max<product.getProductPrize()) {
			max=product.getProductPrize();
			maxproduct=product;
		}
			
		
	}
	
	return maxproduct;
	
	}

}
