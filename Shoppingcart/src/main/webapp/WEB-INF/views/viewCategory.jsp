<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category List</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th><th>Description</th></tr>  
   <c:forEach var="category" items="${list}">   
   <tr>  
   <td>${category.categoryName}</td>  
   <td>${category.categoryDescription}</td>  
    
  <td><a href="editCategory/${category.categoryId}">Edit</a></td>  
   <td><a href="deleteCategory/${category.categoryId}">Delete</a></td>  
     
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="categoryForm">Add New Category</a> 

</body>
</html>