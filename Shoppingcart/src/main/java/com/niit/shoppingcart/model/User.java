package com.niit.shoppingcart.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User implements Serializable{
	@Id
	@Column(name="id")
	private String userId;
	
	@NotEmpty(message="Please enter User Name")
	private String userName;
	
	@NotEmpty(message="Please enter password")
	@Length(min=5,max=5)
	private String password;
	private String role;
	private boolean enabled;
	
	@OneToOne
	@JoinColumn(name="billingAddressId")
	BillingAddress billingAddress;
	
	
	@OneToMany(mappedBy="user")
	List<UserOrder> order;
	
	@OneToOne
	@JoinColumn(name="cartId")
	Cart cart;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public List<UserOrder> getOrder() {
		return order;
	}

	public void setOrder(List<UserOrder> order) {
		this.order = order;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	

}
