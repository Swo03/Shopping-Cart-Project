<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th><th>Price</th></tr>  
   <c:forEach var="product" items="${list}">   
   <tr>  
   <td>${product.productName}</td>  
   <td>${product.productPrice}</td>  
    
  <td><a href="editProduct/${product.productId}">Edit</a></td>  
   <td><a href="deleteProduct/${product.productId}">Delete</a></td>  
     
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="productForm">Add New Product</a> 

</body>
</html>