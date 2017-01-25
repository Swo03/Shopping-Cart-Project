package com.niit.shoppingcart.controller;
/*package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

	@RequestMapping(value="/login")
	public ModelAndView loginPage()
	
	{
		ModelAndView mv=new ModelAndView("login");
		mv.addObject("msg", "This the login page");
		mv.addObject("loginPage", "true");
		return mv;
		}

	@RequestMapping(value = "/registration")
	public ModelAndView registrationPage() {
		ModelAndView mv = new ModelAndView("registration");
		mv.addObject("msg", "This is the registration page");
		mv.addObject("registrationPage", "true");
		return mv;

	}

	@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("id") String id, @RequestParam("password") String password)
	{ System.out.println("In Validate method");
	System.out.println("id:" + id);
	System.out.println("Password:" + password);
	ModelAndView mv= new ModelAndView("home");
	
	
	UserDAO userDAO = new UserDAOImpl;
	if(UserDAO.isValid(id,password)==true)
	{
		mv.addObject("successMsg", "You have logged in successfully");
	}
	else
	{
		mv.addObject("errorMsg", "Invalid credentials.Please try again");
	
	}
	return mv;
	}
	
}
*/