<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href=""src/main/webapp/WEB-INF/lib/bootstrap.css"" >
<script src=""src/main/webapp/WEB-INF/lib/bootstrap.js""></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to shopping cart</title>
</head>
<body>
<style>
body {
    background-color: lightblue;
}
</style>
<c:if test="${not empty successMsg }">
${successMsg}

</c:if>
<c:if test="${empty successMsg }">
	<a href="login"> Login</a>
	</c:if>
	<br>
	<a href="registration"> Register</a>
	<hr>
	
	
	
<c:if test="${loginPage }">
<jsp:include page="login.jsp"></jsp:include>
</c:if>

<c:if test="${not empty errorMsg }">
${errorMsg}
<jsp:include page="login.jsp"></jsp:include>
</c:if>

<c:if test="${registrationPage}">
<jsp:include page="registration.jsp"></jsp:include>
</c:if>




</body>
</html>