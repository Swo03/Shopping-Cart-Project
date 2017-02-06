package com.niit.shoppingcart.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CartItemDao;
import com.niit.shoppingcart.model.CartItem;

@Transactional
@Repository("cartItemDao")
public class CartItemDaoImpl implements CartItemDao {

	@Autowired
	private SessionFactory sessionFactory;
	public CartItemDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
		
	}
		public CartItemDaoImpl(){
			
		}
	
	
	
	
	protected SessionFactory getSessionFactory() {
			return sessionFactory;
		}
		protected void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		
		
		
		
	public boolean saveOrUpdate(CartItem cartItem) {
	try{
		
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(cartItem);
		session.flush();
		session.close();

		return true;
	}catch(Exception e){
		e.printStackTrace();
		
		return false;
	}
	}
	
	
	@Transactional
	public boolean delete(CartItem cartItem) {
		try{
			Session session=sessionFactory.openSession();
			session.delete(cartItem);
			session.flush();
			session.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			
	
		return false;
	}
	}
	public CartItem get(String cartItemId) {
		String hql= "from cartItem where cartItemId="+"'"+ cartItemId+"'";
		Session session=sessionFactory.openSession();
		Query query= session.createQuery(hql);
		
		@SuppressWarnings("uncheched")
		List<CartItem> list=query.list();
		session.flush();
		session.close();
		
		if(list==null){
			return null;
			
		}else{
			return list.get(0);
		}
	}

	
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<CartItem> getCartItemByUserId(String userId) {
		String hql= "from CartItem where cart.user.userId="+"'"+userId+"'";
		Session session=sessionFactory.openSession();
		Query query= session.createQuery(hql);
		session.flush();
		session.close();
		
		return query.list();
	}

}
