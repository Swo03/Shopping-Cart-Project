<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Add New Category</h1>  
       <form:form method="post" action="csave">    
        <table >    
         <tr>    
          <td>Category Name : </td>   
          <td><form:input path="categoryName"  /></td>  
         </tr>    
         <tr>    
          <td>Category Description :</td>    
          <td><form:input path="categoryDescription" /></td>  
         </tr>   
         
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    


</body>
</html>