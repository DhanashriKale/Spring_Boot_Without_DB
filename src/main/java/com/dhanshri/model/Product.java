package com.dhanshri.model;


import java.util.regex.Pattern;


public class Product {
	
	
	private Long productId;
	private String productName;
	private Long supplierId;
	private Long categoryId;
	private Integer productQTY;
	private Double productPrize;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long productId, String productName, Long supplierId, Long categoryId, Integer productQTY,
			Double productPrize) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.supplierId = supplierId;
		this.categoryId = categoryId;
		this.productQTY = productQTY;
		this.productPrize = productPrize;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getProductQTY() {
		return productQTY;
	}

	public void setProductQTY(Integer productQTY) {
		this.productQTY = productQTY;
	}

	public Double getProductPrize() {
		return productPrize;
	}

	public void setProductPrize(Double productPrize) {
		this.productPrize = productPrize;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", supplierId=" + supplierId
				+ ", categoryId=" + categoryId + ", productQTY=" + productQTY + ", productPrize=" + productPrize + "]";
	}
	
	

}