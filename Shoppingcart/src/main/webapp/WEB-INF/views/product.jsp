<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>${product.productName}</title>
<style>
img{


}


/* #container {
    width:100%;
    margin:0 auto;
    overflow: hidden
}
/* #left {
    float:left;
   
    width:30%;
  
} */

/* #right{
    float:left;
     
    width:50%;
    margin:150px 50px 0 250px;
} */ */
/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 500px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 100px;
      background-color: #cceeff;
      height: 600px;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: black;
      color: white;
      padding: 15px;
      
    bottom: 0;
    right: 0;
    width: 100%;
    
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
     @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
        .row.content {height:auto;} 
    }
 

</style>
</head>
<body>
<%@include file="header.jsp" %>


<div class="container-fluid text-center">    
  <div class="row content">
  
    <div class="col-sm-2 sidenav">
     <img src="${pageContext.request.contextPath}/${product.productImage}"  height="350" width="150">
    </div>
    <div class="col-sm-8 text-left"> 
    <h2 style="text-align:center;">${product.productName}</h2><br><br><br><br><br><br>
      <h4 style="padding-left: 50px" >Price: <i class="fa fa-rupee" style="font-size:24px"></i>${product.productPrice}</h4> <br><br><br><br>
      <hr>
      <h3>Details</h3><br>
      <h4>Specification:</h4>
				<h5"text-align:center;">${product.productDescription}</h5>
			</div>
    <div class="col-sm-2 sidenav">
    
   
      <br><br><br><br>
      <div class="well">
     
        <p>Services
1 Year Manufacturer Warranty
Cash On Delivery available
10 Days Replacement Policy</p>
      </div>
       <br><br><br><br>
      <a href="${pageContext.request.contextPath}/addItem/${product.productId}" class="btn btn-primary btn-md" role="button"><span class="glyphicon glyphicon-shopping-cart"></span> Add to Cart</a>
    </div>
  </div>
</div>

<footer class="container-fluid text-center">
  <p>Mail Us:
ShoppingCart Internet Private Limited,
Ozone Manay Tech Park,
#56/18 & 55/09, 7th Floor,
Garvebhavipalya, Hosur Road,
Bangalore - 560068,
Karnataka, India.
</p>
</footer>


</body>
</html>