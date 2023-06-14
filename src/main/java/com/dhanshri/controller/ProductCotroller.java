package com.dhanshri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhanshri.model.Product;
import com.dhanshri.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductCotroller {

	@Autowired
	private ProductService service;

	@PostMapping("saveProduct")
	public String saveProduct(@RequestBody Product product)
	{
		boolean isadded = service.saveProduct(product);
		
		if(isadded)
		{
			return "Saved!!";
		}
		else
		{
			return "not Saved";
		}
	}
	@PostMapping("upadte-product")
	public String updateProduct(@RequestBody Product product)

	{
boolean isUpaded = service.upadateProduct(product);
		
		if(isUpaded)
		{
			return "Upaded!!";
		}
		else
		{
			return "not Upaded";
		}		
	}
	@GetMapping("get-AllProduct")
	public List<Product> getAllProduct()
	{
		
		List<Product> list=service.getAllProduct();
		return list;
		
	}
	@DeleteMapping("Delete-Product-ById")
	public String deleteProductById(@RequestBody long productId)
	{
		return null;
		
	}
	@GetMapping("getMaxPrizeProducts")
	public Product getMaxPrizeProducts()
	{
		
		Product product=service.getMaxPrizeProducts();
		return product;
		
	}
	
	
	

}
