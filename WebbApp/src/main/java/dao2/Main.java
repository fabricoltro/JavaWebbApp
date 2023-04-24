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
		System.out.println("1)SELECT,  2)INSERT,  3)UPDATE,  4)DELETE,  5)ObtenerLogin  ");
		variable = Integer.parseInt(scanner.nextLine());
		
		switch (variable) {
		case 1: {
			
			List<Persona> personas = personaDao.obtenerTodos2();
			for (Persona persona : personas ) {
				System.out.println("persona =" + persona);
			}
			
			break ;
		}
		case 2: {
			
			Persona persona = new Persona ("romanco", "riquelme", 38383838,"chanchopeok@hotmail.com",24325853, "canchook", "fede" );
			personaDao.insertar(persona);
			
			
			System.out.println(persona);
			break ;
		}
		case 3: {
			
			Persona personaModificar = new Persona (2,"roman", "riquelme", 38383838,"rriquelme@hotmail.com",24325853, "canchook", "fede" );
			personaDao.actualizar(personaModificar);
			
			
			System.out.println(personaModificar);
			break ;
		}
		case 4: {
			
			Persona personaeliminar = new Persona(3);
			personaDao.eliminar(personaeliminar);
			
			
			System.out.println(personaeliminar);
			break ;
		}
		case 5: {
			// usar un usuario y contraseña de la BBDD
			String usuario = "atina";   
			String contraseña = "tina123";
			
			Persona personalogea = personaDao.obtenerLogin(usuario, contraseña);
			
			System.out.println(personalogea.toString());
		    
			break ;
		}
		default:
			System.out.println("opcion no valida");
		}
		
		
		
		
		
	
		
	}

	}
