package com.niit.shoppingcart.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class UserOrder implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Date dateOfOrder;
	private  int orderId;
	
	
	protected int getOrderId() {
		return orderId;
	}

	protected void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@ManyToOne
	@JoinColumn(name="id")
	User user;
	
	@OneToOne
	@JoinColumn(name="cartId")
	Cart cart;
	
	@OneToOne
	@JoinColumn(name="billingAddressID")
	BillingAddress billingAdress;

	public Date getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public BillingAddress getBillingAdress() {
		return billingAdress;
	}

	public void setBillingAdress(BillingAddress billingAdress) {
		this.billingAdress = billingAdress;
	}
	
	

}
