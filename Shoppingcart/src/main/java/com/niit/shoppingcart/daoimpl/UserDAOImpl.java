package com.niit.shoppingcart.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

public class UserDAOImpl implements UserDAO{
	
@Autowired
private SessionFactory sessionFactory;
public UserDAOImpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public User get(String id) {
		// TODO Auto-generated method stub
		return (User) sessionFactory.getCurrentSession().get(User.class,id);
	}

	public User validate(String id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(User user) {
		sessionFactory.getCurrentSession().update(user);
		
		return false;
	}

}
