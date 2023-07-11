<%@  page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="jsycss/formulary.css" rel="stylesheet" type="text/css">
<script src="jsycss/formulary.js"  type="text/javascript"/></script>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Playfair+Display&display=swap" rel="stylesheet"> 
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
<title>Formulary</title>
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

<body>
	
</nav>
	
	<h1>Welcome to the formulary</h1>
	
	<form name="form1" action="/WebbApp/formularyServlet" method="post"
	onsubmit= "return ValidarForma(this)" >
	
	<table width="200" id="enfasis-columna">
	
	<caption>
		Formulario registro de datos
	</caption>
	
	<tr>
	 <td class="columna"> Nombre:
	 </td>
		<td>
		 <input class="default" type="text" name="nombre" value="" 
	onfocus="this.select()"/> 
		</td>
	</tr>
	<tr>
	 <td class="columna"> Apellido: 
	  </td>
	 	<td> 
	 	 <input class="default" type="text" name="apellido" value="" 
	onfocus="this.select()"/> 
		</td>
	</tr>
	<tr>
	 <td class="columna"> Telefono:
	  </td>
		<td> <input class="default" type="text" name="telefono" value="" 
	onfocus="this.select()"/> 
		</td>
	</tr>
	<tr>
	 <td class="columna"> Correo:
	  </td>
	   <td> <input class="default" type="email" name="correo" value="" 
	onfocus="this.select()"/> 
		</td>
	</tr>
	<tr>
	<td class="columna"> DNI: </td>
	<td> <input class="default" type="text" name="dni" value="" id="" 
	onfocus="this.select()"/> 
	</td>
	</tr>
	<tr>
	<td class="columna"> Usuario: </td>
	<td> <input class="default" type="text" name="usuario" value="" 
	onfocus="this.select()"/> 
	</td>
	</tr>
	<tr>
	<td class="columna"> Password: </td>
	<td> <input class="default" type="password" name="password" value="" 
	onfocus="this.select()"/> 
	</td>
	</tr>
	<tr>
	<td class="columna"> Confirm Password: </td>
	<td> <input class="default" type="password" name="confirmpassword" value="" 
	onfocus="this.select()"/> 
	</td>
	</tr>
	<tr>
	<td class="columna"> Genero: </td>
	<td> 
	Hombre<input type="radio" name="genero" id=hombre value="Hombre" > 
	&nbsp;&nbsp;&nbsp;
	Mujer<input type="radio" name="genero" id=mujer value="Mujer" > 
	</td>
	</tr>
	<tr style="text-align: center">
		
	<td> <input type="reset" value="limpar" class="default"> </td>
	<td> <input type="submit" value="enviar" class="default"> </td>
		
	</tr>
	</table>
	
	</form>
	
</body>
</html>