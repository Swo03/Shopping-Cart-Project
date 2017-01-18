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
<h1>Add New Product</h1> 


 
       
        <form:form  enctype="multipart/form-data" action="psave">

        
        <table >    
         <tr>    
          <td>Product Name : </td>   
          <td><form:input path="productName"  /></td>  
         </tr>    
         <tr>    
          <td>Product Description :</td>    
          <td><form:input path="productDescription" /></td>  
         </tr>   
         <tr>    
            
          <td><form:hidden path="productImage" /></td>  
         </tr> 
         <tr>    
          <td>Product Price :</td>    
          <td><form:input path="productPrice" /></td>  
         </tr> 
         <tr>    
          <td>Category Id :</td>    
          <td><form:input path="productCategory.categoryId" /></td>  
         </tr> 
         <tr>    
          <td> </td>    
          <tr><td><form:hidden path="productImage"/></td>
</tr>
<tr><td>Choose Image</td><td><input type="file" name="file"/></td></tr>
          
          
          
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    

</body>
</html>