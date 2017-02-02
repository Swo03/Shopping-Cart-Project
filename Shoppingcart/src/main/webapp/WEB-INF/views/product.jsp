<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
img{
margin:0 0 0 50px;
}

#container {
    width:100%;
    margin:0 auto;
    overflow: hidden
}

#left {
    float:left;
   
    width:30%;
   
}

#right{
    float:left;
     
    width:50%;
    margin:150px 0 0 250px;
}

</style>
</head>
<body>
<%@ include file="header.jsp" %>
<h3 style="text-align:center;">${product.productName}</h3>

<div id="container">

    <div id="left">
        <img src="${pageContext.request.contextPath}/${product.productImage}" class="img-rounded" height="400" width="250">
    </div>

    <div id="right">
      <b>Price: ${product.productPrice}</b> 
    </div>
    <a href="${pageContext.request.contextPath}/addItem/${product.productId}">Add to Cart</a>
</div>


 


</body>
</html>