package com.niit.shoppingcart.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.ProductDao;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;

@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public List<Product> list() {
		// TODO Auto-generated method stub
		Session session = getSession();
		Query query = session.createQuery("From Product");
		List<Product> productList = query.list();
		session.close();
		return productList;
	}

	public List<Product> listByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Query query = session.createQuery("from Product where productCategory.categoryId=:categoryId");
		query.setParameter("categoryId", categoryId);
		List<Product> productList = query.list();
		session.close();
		return productList;

	}

	public Product listByProductId(int productId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Query query = session.createQuery("from Product where productId=:productId");
		query.setParameter("productId", productId);
		List<Product> productList = query.list();
		session.close();
		if (productList == null || productList.isEmpty()) {
			return null;
		} else {
			return productList.get(0);

		}
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		Session session=getSession();
		String s= product.getProductName();
		session.save(product);
		session.flush();
		session.close();
		
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		Session session=getSession();
		Query query=session.createQuery("from Product");
		List<Product> productList=query.list();
		
		return productList;
	}

	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session session=getSession();
		String p= product.getProductName();
		session.update(product);
		session.flush();
		session.close();
		
		
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		Session session= getSession();
		Query query=session.createQuery("from Product where productId=:productId");
		query.setParameter("productId", id);
		
		Product p=(Product)query.uniqueResult();
		session.delete(p);
		session.flush();
		session.close();
		
	
	}

	
}
