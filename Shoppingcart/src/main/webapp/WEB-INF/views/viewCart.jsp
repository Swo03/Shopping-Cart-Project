<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
table{

}
th {
	text-align: center;
	 background-color: #4CAF50;
    color: white;
}

td {
	text-align: center;
}

h2 {
	text-align: center;
}
</style>
</head>
<body>
	<%@ include file="header.jsp"%>

	${errMsg}
	<c:if test="${empty errMsg}">
		<h2>CART</h2>
		<table class="table table-hover"  border="2" width="100%"
			cellpadding="2">
			<tr>
				<th>ITEM</th>
				<th>QTY</th>
				<th>PRICE</th>
				<th>SUBTOTAL</th>
				<th></th>
			</tr>
			<c:forEach var="cartItem" items="${cartContent}">
				<tr>

					<td>${cartItem.product.productName}</td>
					<td>${cartItem.quantity}</td>
					<td>${cartItem.product.productPrice}</td>
					<td>${cartItem.subTotal}</td>
					<td><a
						href="${pageContext.request.contextPath}/removeItem/${cartItem.cartItemId}"><button
								type="button" class="btn btn-default btn-sm">
								<span class="glyphicon glyphicon-trash"></span> Remove
							</button></a></td>




				</tr>
			</c:forEach>

		</table>
		<br><br><br><br><br>
		 <c:if test="${grandTotal > 0}">
 <h3> Amount Payable   : ${grandTotal}</h3> 
   </c:if>

	</c:if>


</body>
</html>