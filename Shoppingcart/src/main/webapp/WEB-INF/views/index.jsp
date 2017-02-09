<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Shopping Cart</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/scripts/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
 <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 100%;
      max-height:500px;
      margin: auto;
  }
  
   
   footer {
      background-color: black;
      color: white;
      padding: 15px;
     
    bottom: 0;
    right: 0;
    width: 100%;
    
    }
   
 
  </style>

  
  
</head>
<body>
<%@ include file="header.jsp" %>

<div id = "myCarousel" class = "carousel slide">
   
  
   <!-- Carousel items -->
   <div class = "carousel-inner">
      <div class = "item active">
         <img src = "resources/carousel/moto.jpg" alt = "First slide">
      </div>
      
      <div class = "item">
         <img src = "resources/carousel/mi.png" alt = "Second slide">
      </div>
      
      <div class = "item">
         <img src = "resources/carousel/i_phone.jpg" alt = "Third slide">
      </div>
      
      
       <div class = "item">
         <img src = "resources/carousel/samsung.jpg" alt = "Third slide">
      </div>
       <div class = "item">
         <img src = "resources/carousel/top.jpg" alt = "Third slide">
      </div>
   </div>
   
   <!-- Carousel nav -->
   <a class = "carousel-control left" href = "#myCarousel" data-slide = "prev">&lsaquo;</a>
   <a class = "carousel-control right" href = "#myCarousel" data-slide = "next">&rsaquo;</a>
   
</div> 
<div class="container text-center">    
  <h3>Deal of the Day</h3><br>
  <div class="row">
    <div class="col-sm-4">
      <img src="resources/carousel/lenovo-p2.jpg" class="img-responsive"  style="width:100%" alt="Image">
      <p>Lenovo P2</p>
    </div>
    <div class="col-sm-4"> 
      <img src="resources/carousel/pixel1.png" class="img-responsive" style="width:100%" alt="Image">
      <p>Google Pixel</p>    
    </div>
    <div class="col-sm-4">
      <div class="alert alert-success">
       <p>Best Bargains</p>
      </div>
      <div class="alert alert-info">
       <p>
  <strong>Hurry!!</strong> For limited time only...
</p>
      </div>
    </div>
  </div>
</div><br>


<footer class="container-fluid text-center">
  <p >Mail Us:
Flipkart Internet Private Limited,
Ozone Manay Tech Park,
#56/18 & 55/09, 7th Floor,
Garvebhavipalya, Hosur Road,
Bangalore - 560068,
Karnataka, India.
</p>
</footer>


</body>
</html>