package com.niit.shoppingcart.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.UserOrderDao;
import com.niit.shoppingcart.model.UserOrder;

@Repository("userOrderDao")
@Transactional
public class UserOrderDaoImpl implements UserOrderDao {
@Autowired SessionFactory sessionFactory;

	protected SessionFactory getSessionFactory() {
	return sessionFactory;
}

protected void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}

public List<UserOrder> list() {
	// TODO Auto-generated method stub
	return null;
}





}
