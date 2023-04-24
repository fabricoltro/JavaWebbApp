<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="jsycss/" rel="stylesheet" type="text/css">
<script src="jsycss/js.js"  type="text/javascript"/></script>

<link href="https://fonts.googleapis.com/css2?family=Playfair+Display&display=swap" rel="stylesheet">
 
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" ></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://kit.fontawesome.com/2c36e9b7b1.js" ></script>
<meta charset="UTF-8">
<head>
<title></title>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark"> 
   <ul class="navbar-nav">
   		<li class="nav-item">
      <a class="nav-link" class="navbar-toggler-icon" style="color: white" href="index.html">Home</a>
    	</li>
    	
    	<li>
    	<div class="dropdown">
    	<a style="color: white" href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" >Cerrar sesión</a>
    	<div class="dropdown-menu text-center">
    		<a><img src="images/persona.png" height="80" width="80"></a>
			<a>Usser</a>    	
    		<a>example@gmail.com</a>
    		<div class="dropdown-divider"></div>
    		<a  href="index.jsp" class="dropdown-item">Salir</a>
    	</div> 
    	</div>  	
    	</li>
	</ul>
</nav>

</head>


<body>


<h1>Bienvenido <%= request.getAttribute("nombre") %>!</h1>
	<p>Los datos de tu registro son:</p>
	<ul>
		<li>Usuario: <%= request.getAttribute("usuario") %></li>
		<li>Contraseña: <%= request.getAttribute("contrasena") %></li>
		<li>Nombre: <%= request.getAttribute("nombre") %></li>
		<li>Apellido: <%= request.getAttribute("apellido") %></li>
		<li>Email: <%= request.getAttribute("email") %></li>
	</ul>

</body>
</html>