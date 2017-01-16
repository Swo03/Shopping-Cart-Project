package com.niit.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDao;
import com.niit.shoppingcart.model.Category;

@Controller
public class CategoryController {
@Autowired
CategoryDao categoryDao;
@RequestMapping("/cindex")  
public ModelAndView cindex(){  
    return new ModelAndView("cindex");  
} 

@RequestMapping("/categoryForm")
public ModelAndView showForm(){
	return new ModelAndView("categoryForm","command",new Category());
	
}
@RequestMapping(value="/csave",method=RequestMethod.POST)
public ModelAndView csave(@ModelAttribute("category") Category category){
categoryDao.addCategory(category);
return new ModelAndView("redirect:/viewCategory");


}

@RequestMapping("/viewCategory")
public ModelAndView viewCategory(){
	List<Category> list=categoryDao.getAllCategory();
	return new ModelAndView("viewCategory","list",list);
	
}

@RequestMapping(value="/editCategory/{id}")
public ModelAndView edit(@PathVariable int id){
Category category=categoryDao.getAllCategoryById(id);
return new ModelAndView("categoryEditForm","command",category);
}

@RequestMapping(value="/ceditsave",method=RequestMethod.POST)
public ModelAndView editsave(@ModelAttribute("category")Category category){
	categoryDao.updateCategory(category);
	return new ModelAndView("redirect:/viewCategory");
	
}


@RequestMapping(value="/deleteCategory/{id}",method=RequestMethod.GET)
public ModelAndView delete(@PathVariable int id){
	System.out.println("delete was called");
	categoryDao.deleteCategory(id);
	return new ModelAndView("redirect:/viewCategory");
	
}

}