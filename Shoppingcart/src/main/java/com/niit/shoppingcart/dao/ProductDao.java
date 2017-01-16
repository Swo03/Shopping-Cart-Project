package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Product;

public interface ProductDao {
 public List<Product> list();
 public List<Product> listByCategoryId(int CategoryId);
 public Product listByProductId(int productId);
public void addProduct(Product product);
public List<Product> getAllProduct();
public Product getProductById(int productId);
public void updateProduct(Product product);
public void deleteProduct(int id);

 
}
