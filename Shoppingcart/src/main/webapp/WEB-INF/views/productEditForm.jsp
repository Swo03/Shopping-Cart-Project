<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Edit</title>
</head>
<body>
 <h1>Edit Product</h1>  
 
   
       <form:form method="POST" enctype="multipart/form-data" action="/Shoppingcart/peditsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="productId" /></td>  
         </tr>   
         <tr>    
          <td>Product Name: </td>   
          <td><form:input path="productName"  /></td>  
         </tr>    
         <tr>    
          <td>Product Price</td>    
          <td><form:input path="productPrice" /></td>  
         </tr>   
          <tr>    
          <td>Category Id :</td>    
          <td><form:input path="productCategory.categoryId" /></td>  
         </tr> 
          <tr>    
          <td>Product Description</td>    
          <td><form:input path="productDescription" /></td>  
         </tr> 
        <tr><td><form:hidden path="productImage"/></td>
        <img src="${pageContext.request.contextPath}/${product.productImage}"  height="100" width="100">
</tr>
<tr><td>Choose Image</td><td><input type="file" name="file"/></td></tr>
          
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>

</body>
</html>