<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>

</style>
<title>Products</title>
<style>
#position {
	width: 100%;
	margin-left: 20%;
}
a,b{
padding-left: 20%;

}

</style>

</head>
<body>
	<%@ include file="header.jsp"%>
	<div id="position"><br>
		<c:forEach items="${productList}" var="product">
			<img
				src="${pageContext.request.contextPath}/${product.productImage}"
				height="200" width="100">
				
				<a
				href="${pageContext.request.contextPath}/product/${product.productId}">${product.productName}</a>
				<b>${product.productPrice}</b>
				 &nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/addItem/${product.productId}" class="btn btn-primary btn-md" role="button"><span class="glyphicon glyphicon-shopping-cart"></span></a>
				
				<hr>
				


			
		</c:forEach>
	</div>

</body>
</html>