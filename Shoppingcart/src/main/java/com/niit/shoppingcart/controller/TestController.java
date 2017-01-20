package com.niit.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDao;
import com.niit.shoppingcart.dao.ProductDao;

@Controller
public class TestController {
	@Autowired
	CategoryDao  categoryDao;
	@Autowired
	ProductDao  productDao;
	@RequestMapping("/Test")
	public String test()
	{
		return "header";
	}
	@RequestMapping("/home")
	public ModelAndView home()
	{
		
		ModelAndView mv=new ModelAndView("header");
		mv.addObject("categoryList", categoryDao.getAllCategory());
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
	

}
