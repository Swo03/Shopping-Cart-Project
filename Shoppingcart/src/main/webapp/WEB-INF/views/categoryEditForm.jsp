<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Edit</title>
</head>
<body>
<h1>Edit Category</h1>  
       <form:form method="POST" action="/Shoppingcart/ceditsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="categoryId" /></td>  
         </tr>   
         <tr>    
          <td>Category Name: </td>   
          <td><form:input path="categoryName"  /></td>  
         </tr>    
            
          
          <tr>    
          <td>Category Description</td>    
          <td><form:input path="categoryDescription" /></td>  
         </tr> 
         
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>


</body>
</html>