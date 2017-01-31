package com.niit.shoppingcart.dao;

import com.niit.shoppingcart.model.Cart;

public interface CartDao {
public boolean saveOrUpdate(Cart cart);
public boolean delete(Cart cart) ;
	

public Cart getCartByUserId(String userId);
}
