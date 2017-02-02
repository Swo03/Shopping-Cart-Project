package com.niit.shoppingcart.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CartDao;
import com.niit.shoppingcart.model.Cart;

@Repository("cartDao")
@Transactional
public class CartDaoImpl implements CartDao{

	public CartDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private SessionFactory sessionFactory;
	public CartDaoImpl (SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		
	}
	
	
	
	
	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}




	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



@Transactional
	public boolean saveOrUpdate(Cart cart) {
		try{
			Session session=sessionFactory.openSession();
			sessionFactory.openSession().saveOrUpdate(cart);
			session.flush();
			session.close();

			
			return true;
		}catch(Exception e){
			e.printStackTrace();
		
		return false;
	}
}


@Transactional

	public boolean delete(Cart cart) {
try{
	sessionFactory.getCurrentSession().delete(cart);
	return true;
}catch(Exception e){
	e.printStackTrace();
	
	return false;
	}
}
@Transactional
	public Cart getCartByUserId(String userId) {
String hql="from Cart where user.userId="+"'"+userId+"'";
Session session=sessionFactory.openSession();
Query query=session.createQuery(hql);
@SuppressWarnings("unchecked")
List<Cart> list=query.list();
session.flush();
session.close();
if(list==null||list.isEmpty()){
	return null;
}
else{
	return list.get(0);
	
}
}	
	}


