package com.niit.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.ProductDao;
import com.niit.shoppingcart.model.Product;


@Controller
public class ProductController {
@Autowired
ProductDao productDao;

@RequestMapping("/pindex")  
public ModelAndView pindex(){  
    return new ModelAndView("pindex");  
} 



@RequestMapping("/productForm")
public ModelAndView showForm()
{
	return new ModelAndView("productForm","command",new Product());
	
}

@RequestMapping(value="/psave",method=RequestMethod.POST)
public ModelAndView psave(@ModelAttribute("product")Product product){
	productDao.addProduct(product);
	return new ModelAndView("redirect:/viewProduct");
	
}

@RequestMapping("/viewProduct")
public ModelAndView viewProduct(){
	List<Product> list=productDao.getAllProduct();
	return new ModelAndView("viewProduct","list",list);
}
@RequestMapping(value="/editProduct/{id}")  
public ModelAndView edit(@PathVariable int id){  
    Product product=productDao.listByProductId(id);
    return new ModelAndView("productEditForm","command",product);  
}  


@RequestMapping(value="/peditsave",method = RequestMethod.POST) 
public ModelAndView productSave(@ModelAttribute("product") Product product){  
	productDao.updateProduct(product);
    return new ModelAndView("redirect:/viewProduct");  
}  
@RequestMapping(value="/deleteProduct/{id}",method = RequestMethod.GET)  
public ModelAndView delete(@PathVariable int id){ 
	System.out.println("delete is called");
   productDao.deleteProduct(id);
    return new ModelAndView("redirect:/viewProduct");  
}  

}
