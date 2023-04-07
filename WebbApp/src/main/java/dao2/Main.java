package dao2;

import static org.junit.Assert.assertTrue;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.ConnectionManager;
import conexion.DAOException;

public class Main {

	public static void main(String[] args) throws DAOException, Exception {
		
		PersonaDAO personaDao = new PersonaDAO();	
	
		
		Persona persona = new Persona ("carlos", "abilaxx", 38383838,"chanchopeok@hotmail.com",24325853, "elchanchi", "chanchococo" );
		personaDao.insertar(persona);
		
		
		
		System.out.println(persona.getUsser());
		System.out.println(persona.getPassword());
		
		
		//prueba de consultas				
		
		/*Connection conexion = null;			
		
		 SELECT *
		
		PersonaDAO personaDao = new PersonaDAO();
		List<Persona> personas =  personaDao.obtenerTodos2(); 
		for (Persona persona: personas) {
			System.out.println( "   persona =  "  +  persona + "  ");
			}
		
		
		//login
		
		Persona persona = new Persona();
		personaDao.obtenerLogin("ricardo", "fort123");	
		
		System.out.println(persona.getUsser());
		System.out.println(persona.getPassword());
		
		//INSERT
		
		
		
		Persona persona = new Persona ("chanchope", "abila", 38383838,"chanchopeok@hotmail.com",24325853, "canchook", "fede" );
		personaDao.insertar(persona);
		
		  
		  
		//UPDATE
        /*
		
		PersonaDAO personaDao = new PersonaDAO();
		
		Persona personaActualizar = new Persona(82, "wanchope", "abilax", 32212318, "eltitere@hotmail.com", 23254431, "canchope", "fedede");
		personaDao.actualizar(personaActualizar);
		List<Persona> personas = personaDao.obtenerTodos2();
		for (Persona persona : personas ) {
			System.out.println("persona =" + persona);
		}				
						
						
	    */	
	
		//DELETE
		
		/*
		Persona personaeliminar = new Persona(2);
		personaDao.eliminar(personaeliminar);										
	    */
		
		
	}

	}
