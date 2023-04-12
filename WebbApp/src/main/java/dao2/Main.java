package dao2;

import static org.junit.Assert.assertTrue;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import conexion.ConnectionManager;
import conexion.DAOException;

public class Main {

	public static void main(String[] args) throws DAOException, Exception {
		
		PersonaDAO personaDao = new PersonaDAO();	
		int variable = 0 ;
		
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("digite del 1 al 4 la operacion que quiera realizar");
		System.out.println("1)SELECT,  2)INSERT,  3)UPDATE,  4)DELETE  ");
		variable = Integer.parseInt(scanner.nextLine());
		
		switch (variable) {
		case 1: {
			
			Persona persona = new Persona ("chanchope", "abila", 38383838,"chanchopeok@hotmail.com",24325853, "canchook", "fede" );
			personaDao.insertar(persona);
			
			break ;
		}
		default:
			System.out.println("opcion no valida");
		}
		
		List<Persona> personas = personaDao.obtenerTodos2();
		for (Persona persona : personas ) {
			System.out.println("persona =" + persona);
		}	
		/*
		
		
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
