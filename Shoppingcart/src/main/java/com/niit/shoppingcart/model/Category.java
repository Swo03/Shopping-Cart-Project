package com.niit.shoppingcart.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable{

	@Id
	@GeneratedValue
	
	private int categoryId;
	private String categoryName;
	private String categoryDescription;
	
	@OneToMany(mappedBy="productCategory",fetch=FetchType.EAGER)
	List<Product> products;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	protected List<Product> getProducts() {
		return products;
	}

	protected void setProducts(List<Product> products) {
		this.products = products;
	}

	

	
	
	
	
	
	
}
