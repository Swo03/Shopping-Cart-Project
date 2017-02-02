package com.niit.shoppingcart.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.User;
@Repository("userDao")
@Transactional
public class UserDAOImpl implements UserDAO{
	
public UserDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

@Autowired
private SessionFactory sessionFactory;
public UserDAOImpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}

	public List<User> list() {
return null;
		
	}

	

	private Session getSession() {
		
		return sessionFactory.openSession();
	}

	public User get(String id) {
		// TODO Auto-generated method stub
		return (User) sessionFactory.getCurrentSession().get(User.class,id);
	}

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
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

	public User getUserbyId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
