<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Case</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="Bootstrap/jquery/jquery.js"></script>
<script src="jq/jquery-2.1.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<style>
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Shopping Cart</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a
						href="${pageContext.request.contextPath}/home">Home</a></li>


					<c:forEach items="${categoryList}" var="category">
						<li><a
							href="${pageContext.request.contextPath}/showCategoryWiseProducts/${category.categoryId}">${category.categoryName}</a></li>
					</c:forEach>

				</ul>
				<ul class="nav navbar-nav navbar-right">
					<security:authorize access="hasRole('ROLE_ADMIN')">
						<li><a href="${pageContext.request.contextPath}/cindex"><span
								class="glyphicon glyphicon-wrench"></span> Manage Category</a></li>
						<li><a href="${pageContext.request.contextPath}/pindex"><span
								class="glyphicon glyphicon-wrench"></span> Manage Product</a></li>
					</security:authorize>
					<c:if test="${pageContext.request.userPrincipal.name == null}">
						<li><a href="${pageContext.request.contextPath}/register"><span
								class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					</c:if>
					<c:if test="${pageContext.request.userPrincipal.name == null}">
						<li><a href="loginPage"><span
								class="glyphicon glyphicon-log-in"></span> Login</a></li>
					</c:if>
					<c:if test="${pageContext.request.userPrincipal.name != null}">
						<li><a 
							href="${pageContext.request.contextPath}/logout"> 
							 <span class="glyphicon glyphicon-log-out"></span> Logout
						</a></li>
					</c:if>
				</ul>
			</div>
		</div>
	</nav>



</body>
</html>
