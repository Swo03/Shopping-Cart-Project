package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.CartItem;

public interface CartItemDao {
public boolean saveOrUpdate(CartItem cartItem);
public boolean delete(CartItem cartItem);
public CartItem get(String cartItemId);
public List<CartItem> getCartItemByUserId(String userId);

}
