<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link href="resources/css/font-awesome.css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/jquery-ui.min.css" rel="stylesheet">

<link href="resources/css/responsive.css" rel="stylesheet">

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
				<td><form:input path="userId" type="text" pattern=".{2,10}" 
				required="true" title="Id should contain 2-10 characters"/></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><form:input path="password" type="password" name="password" pattern=".{5,5}"
				required="true" title="password should be of 5 characters"/></td>
			</tr>
		

			<tr>
				<td>User Name</td>
				<td><form:input path="userName" type="text" name="name" required="true" 
				pattern=".{3,}" title="Name is too small"/></td>
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