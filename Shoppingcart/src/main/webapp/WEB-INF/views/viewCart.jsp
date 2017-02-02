<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Product Name</th><th>Price</th></tr>  
   <c:forEach var="product" items="${list}">   
   <tr>  
   <td>${product.productName}</td>  
   <td>${cart.GrandTotal}</td>  
    
  <td><a href="delete/${cartItem.cartId}">remove</a></td>  
     
     
   </tr>  
   
   
   </c:forEach>  
   </table>  
   <br/>  
  

</body>
</html>