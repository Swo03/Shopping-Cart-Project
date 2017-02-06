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
<%@ include file="header.jsp" %>
 
${errMsg} 
<c:if test="${empty errMsg}">
<table border="2" width="70%" cellpadding="2">  
<tr><th></th><th>Name</th></tr>  
   <c:forEach var="cartItem" items="${cartContent}">   
   <tr>  
  
   <td>${cartItem.product.productName}</td>  <td><a href="${pageContext.request.contextPath}/removeItem/${cartItem.cartItemId}">Delete</a></td>  
       
  
     
   
   </tr>  
   </c:forEach>
  
   </table>  
    <c:if test="${grandTotal > 0}">
   Total   : ${grandTotal} 
   </c:if>
   
   </c:if>


</body>
</html>