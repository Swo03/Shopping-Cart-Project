package com.niit.shoppingcart.daoimpl;

import java.util.List;

import javax.persistence.Entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CategoryDao;
import com.niit.shoppingcart.model.Category;
@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao{
@Autowired
private SessionFactory sessionFactory;


	
public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}





	protected Session getSession() {
	return sessionFactory.openSession();
}





	




	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		Session session=getSession();
		String s=category.getCategoryName();
		session.save(category);
		session.flush();
		session.close();		
		
	}





	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
	Session session= getSession();
		
		Query query=session.createQuery("From Category");
		List<Category> categoryList=query.list();
		session.close();
		return categoryList;
	}





	public Category getAllCategoryById(int id) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Query query=session.createQuery("from Category where categoryId=:categoryId");
		query.setParameter("categoryId", id);
		List<Category> categoryList=query.list();
		session.close();
		
		if (categoryList == null || categoryList.isEmpty()) {
			return null;
		} else {
			return categoryList.get(0);

		}
		
	}





	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		Session session=getSession();
		String s=category.getCategoryName();
		session.update(category);
		session.flush();
		session.close();
		
	}





	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Query query=session.createQuery("from Category where categoryId=:categoryId");
		query.setParameter("categoryId", id);
		Category d=(Category) query.uniqueResult();
		session.delete(d);
		session.flush();
		session.close();
		
	}





	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}






	
	

}
