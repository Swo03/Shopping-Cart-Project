package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	
	private int productId;
	private String productName;
	private String productDescription;
	private String productImage;
	private double productPrice;

	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category productCategory;
	
	@Transient
	private MultipartFile file;
		
		

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}
	
	
}
