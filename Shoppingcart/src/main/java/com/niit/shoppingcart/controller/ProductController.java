package com.niit.shoppingcart.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
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

@RequestMapping(value="/save",method=RequestMethod.POST)
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

@RequestMapping(value="/psave",method=RequestMethod.POST)
public ModelAndView save(@ModelAttribute("product")Product product, HttpServletRequest request, @RequestParam("file") MultipartFile file){

byte fileBytes[];
FileOutputStream fos=null;

String fileName="";
String productImage="";
ServletContext context=request.getServletContext();
String realContextPath=context.getRealPath("/");
String un= product.getProductName();
if(file !=null){
	fileName=realContextPath+"/resources/img/"+un+".jpg";
	productImage="resources/img/"+un+".jpg";
	System.out.println("===="+fileName+"====");
	
File fileobj=new File(fileName);
try{
	fos=new FileOutputStream(fileobj);
	fileBytes=file.getBytes();
	fos.write(fileBytes);
}catch(Exception e){
	e.printStackTrace();
}
}
product.setProductImage(productImage);

productDao.addProduct(product);

return new ModelAndView("redirect:/viewProduct");
}


}


