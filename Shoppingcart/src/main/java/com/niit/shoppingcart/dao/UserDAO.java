package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.User;

public interface UserDAO {
public List<User> list();
public User get(String id);


public User getUserbyId(String id);
public boolean saveOrUpdate(User user);



}
