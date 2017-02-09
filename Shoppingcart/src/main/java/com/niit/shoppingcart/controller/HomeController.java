package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDao;
import com.niit.shoppingcart.dao.ProductDao;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.BillingAddress;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.User;

@Controller
public class HomeController {
	@Autowired
	CategoryDao  categoryDao;
	@Autowired
	ProductDao  productDao;
	@Autowired
	UserDAO userDAO;
	@RequestMapping("/Test")
	public String test()
	{
		return "header";
	}
	@RequestMapping("/index")
	public ModelAndView home(HttpSession session)
	{
		
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("categoryList", categoryDao.getAllCategory());
		session.setAttribute("categoryList", categoryDao.getAllCategory());
		return mv;
	}
	
	@RequestMapping("/home")
	public ModelAndView home1()
	{
		
		ModelAndView mv=new ModelAndView("index");
		//mv.addObject("categoryList", categoryDao.getAllCategory());
		return mv;
	}
	
	
	@RequestMapping("/showCategoryWiseProducts/{categoryId}")
	public ModelAndView  showCategoryWiseProducts(@PathVariable  int categoryId)
	{
		ModelAndView mv=new ModelAndView("products");
		mv.addObject("productList", productDao.listByCategoryId(categoryId));
		
		return mv;
	}
	
	@RequestMapping("/product/{productId}")
	public ModelAndView  products(@PathVariable  int productId)
	{
		ModelAndView mv=new ModelAndView("product");
		mv.addObject("product", productDao.listByProductId(productId));
		
		return mv;
	}
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public ModelAndView loginPage() {

		return new ModelAndView("loginPage");
	}

	@RequestMapping(value = "/register")
	public ModelAndView register() {

		return new ModelAndView("register","command",new User());
	}
	@RequestMapping(value="/usave",method=RequestMethod.POST)
	public ModelAndView usave(@ModelAttribute("user")User user,HttpServletRequest request){
		BillingAddress  b=new BillingAddress();
		user.setBillingAddress(b);
		Cart c=new Cart();
		user.setCart(c);
		userDAO.addUser(user);
		return new ModelAndView("redirect:/register");
	}
}
	
