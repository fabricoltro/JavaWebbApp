<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="jsycss/login.css" rel="stylesheet" type="text/css">
<script src="jsycss/js.js"  type="text/javascript"/></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Playfair+Display&display=swap" rel="stylesheet"> 

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<script src="https://kit.fontawesome.com/2c36e9b7b1.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
 
  <!-- Links -->
  
  <ul class="navbar-nav">
   <li class="nav-item">
      <a class="nav-link" class="navbar-toggler-icon" style="color: white" href="index.html">Home</a>
    </li>
   <li class="nav-item">
      <a class="nav-link" href="login.jsp">Login</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="register.jsp">Register</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="formulary.jsp">Client Lists(Formulary)</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Our Products">Our Products :$</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="login.jsp">Market</a>
    </li>
  </ul>
</nav>


<body>

  <div class="logindiv">
    
	<form action="/WebbApp/LoginServlet" method="POST" class="loginform" name="form1" >	
	<h2>Ingreso al Sistema</h2>			
    <h3>Ingrese  usuario y contraseña</h1>
 
	<input type="text" 	 name="txtusser" placeholder="enter your Username">
	<input type="password" name="txtpass" placeholder="enter your Password">
	
	<%
	
	%>
	
	<input class="btn btn-danger" type="submit" name="btnlogin" value="ingresar">

  </form>  
</div>
	
</body>
</html>