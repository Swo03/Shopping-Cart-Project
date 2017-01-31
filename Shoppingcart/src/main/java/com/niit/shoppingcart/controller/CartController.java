package com.niit.shoppingcart.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CartDao;
import com.niit.shoppingcart.dao.CartItemDao;
import com.niit.shoppingcart.dao.ProductDao;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.CartItem;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.User;

@Controller
public class CartController {
	@Autowired
CartDao cartDao;
	@Autowired
	Cart cart;
	@Autowired
	CartItemDao cartItemDao;
	@Autowired
	UserDAO userDao;
	@Autowired
	ProductDao productDao;
	@Autowired
	CartItem cartItem;
	
	@RequestMapping("/viewCart")
	public ModelAndView viewProduct(HttpSession session){
		ModelAndView mv=new ModelAndView("cart");
		Cart cart=(Cart) session.getAttribute("cart");
		if (cart==null)
		{
			mv.addObject("errMsg","No Items in Cart");
			
		}
		else
		{
			mv.addObject("cartContent", cart.getCartItems());
			mv.addObject("grandTotal",cart.getGrandTotal());
			
		}
		return mv;
	}
	
	private void updateCart(CartItem cartItem) {
		Cart c1=cartItem.getCart();
		c1.setGrandTotal(c1.getGrandTotal()+cartItem.getProduct().getProductPrice());
		cartDao.saveOrUpdate(c1);
		}
	
	
	@RequestMapping("/addItem/{productId}")
	public ModelAndView addItemsToCart(@PathVariable int productId,Principal principal,HttpSession session){
		ModelAndView mv=new ModelAndView("Product");
		String id=principal.getName();
		System.out.println("Logged in users"+id);
		Product product=productDao.listByProductId(productId);
		Cart cart=cartDao.getCartByUserId(id);
		
		if(cart==null){
			System.out.println("no cart ");
			Cart c=new Cart();
			User user=userDao.getUserbyId(id);
			c.setUser(user);
			cartDao.saveOrUpdate(c);
			
			CartItem cartItem=new CartItem();
			cartItem.setCart(c);
			cartItem.setProduct(product);
			cartItem.setQuantity(1);
			cartItem.setSubTotal(product.getProductPrice());
			cartItemDao.saveOrUpdate(cartItem);
			updateCart(cartItem);
			session.setAttribute("cart", cartItem.getCart());
			
			
		
		return mv;
		
		
	}




	
	
	
	
	List<CartItem> cartItems=cart.getCartItems();
	for(CartItem cartItem:cartItems)
	{
		if(cartItem.getProduct().getProductId()==productId)
		{
			cartItem.setQuantity(cartItem.getQuantity()+1);
			cartItem.setSubTotal(cartItem.getSubTotal()+product.getProductPrice());
			cartItemDao.saveOrUpdate(cartItem);
			updateCart(cartItem);
			session.setAttribute("cart",cartItem.getCart());
			return mv;
			
		}
		
	}
	CartItem item=new CartItem();
	item.setCart(cart);
	item.setProduct(product);
	item.setQuantity(1);
	item.setSubTotal(product.getProductPrice());
	cartItemDao.saveOrUpdate(item);
	updateCart(item);
	session.setAttribute("cart", item.getCart());
	return mv;
	}
}
	
	
	
	

	




	
