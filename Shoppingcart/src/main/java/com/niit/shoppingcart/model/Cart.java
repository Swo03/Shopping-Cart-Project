package com.niit.shoppingcart.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int cartId;
	private double GrandTotal;
	@OneToOne
	@JoinColumn(name="id")
	User user;
	@OneToMany(mappedBy="cart",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<CartItem> cartItems;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getGrandTotal() {
		return GrandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		GrandTotal = grandTotal;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<CartItem> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	
	
	
	
	
}
