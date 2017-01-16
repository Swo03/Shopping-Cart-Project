package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;

public interface CategoryDao {
	


	public void addCategory(Category category);

	public List<Category> getAllCategory();

	public Category getAllCategoryById(int id);

	public void updateCategory(Category category);

	public void deleteCategory(int id);

	
	 public List<Category> list();
	

}
