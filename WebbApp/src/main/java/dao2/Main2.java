package dao2;

import java.util.List;

import conexion.DAOException;

public class Main2 {

	public static void main(String[] args) throws DAOException, Exception {
		PersonaDAO personaDao = new PersonaDAO();
		
		
		
		List<Persona> personas = personaDao.obtenerLogin();
		for (Persona persona : personas ) {
			System.out.println("persona =" + persona);
		}
	}

}
