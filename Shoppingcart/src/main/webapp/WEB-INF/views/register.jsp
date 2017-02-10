<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<style>
body {
    background-color: lightblue;
}
</style>
	<form:form action="usave">
		The fill the form:
		<table>
			<tr>
				<td>User ID:</td>
				<td><form:input path="userId" /></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><form:input path="password" type="password" name="password"/></td>
			</tr>
		

			<tr>
				<td>User Name</td>
				<td><form:input path="userName" type="text" name="name"/></td>
			</tr>
			<%-- <tr><td><form:hidden path="billingAddress.billingAddressId"/></td>
			</tr> --%>
			<tr>
			</tr>
			<%-- <tr><td><form:hidden path="cart.cartId"/></td> --%>
			
			<tr>
			</tr>
			<tr><td><form:hidden path="enabled"/></td>
			
			<tr>
				<td><input type="submit" value="register"></td>
				<td><input type="reset" value="reset"></td>
		</tr>
		</table>
	</form:form>
</body>
</html>