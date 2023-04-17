/**
 * 
 */

function ValidarForma(forma){
	
	var nombre = forma.nombre;
	
	if(nombre.value == "" || nombre.value.lenght <3){
	alert("Debe escribir su nombre completo");	
	nombre.focus();
	nombre.select();
	return false;
	}

	var apellido = forma.apellido;
	
	if(apellido.value == ""){
	alert("Debe escribir apellido completo");	
	apellido.focus();
	apellido.select();
	return false;
	}
	
	var telefono = forma.telefono;
	
	if(telefono.value == "" || telefono.value.lenght <=10 ){
	alert("debe escribir numero telefonico sin codigo de area(10 digitos)");	
	telefono.focus();
	telefono.select();
	return false;
	}
	
	var correo = forma.correo;
	
	if(correo.value == "" || correo.value.lenght<=20  ){
	alert("Escribe tu direccion de correo correctamente");	
	correo.focus();
	correo.select();
	return false;
	}
	
	var dni = forma.dni;
	
	if(dni.value == "" || dni.value.lenght <=8  ){
	alert("Debe escribir un nombre de usuario de almenos 6 caracteres");	
	usuario.focus();
	usuario.select();
	return false;
	}
	
	var usuario = forma.usuario;
	
	if(usuario.value == "" || usuario.value.lenght < 6  ){
	alert("Debe escribir un nombre de usuario de almenos 6 caracteres");	
	usuario.focus();
	usuario.select();
	return false;
	}

	var password = forma.password;
	
	if(password.value == "" || password.value.lenght <5  ){
	alert("Debe escribir una contrase�a de almenos 6 caracteres");
		
	password.focus();
	password.select();
	return false;
	}
	
	var confirmpassword = forma.confirmpassword;
	
	if(confirmpassword.value != password.value ){
	alert("Las contrase�as son diferentes");
		
	password.focus();
	password.select();
	return false;
	}
	

	var generos = forma.genero ;
	//var geneross = document.getElementBgetElementsByName("genero");
	var radioSeleccionado = false;
	
	
	
	for(var i = 0 ; i<generos.lenght ; i++){
	if(generos[i].checked){ 
	radioSeleccionado = true;	
	  }
	
	}
	
	
	if(generos.value == "Hombre" || generos.value == "Mujer"){
		radioSeleccionado = true;
	}
	
	if(!radioSeleccionado){
		alert("Debe seleccionar algun genero");
		return false;
	}

//formulario valido
alert("Formulario validoo :D, procesando datos...")
return true;
	
}