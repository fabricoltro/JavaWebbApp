package dao2;

import java.sql.SQLException;
import java.util.List;

import conexion.DAOException;


public interface DAO {

	public int insertar(Persona persona) throws DAOException, Exception;
	
	public int actualizar(Persona persona) throws DAOException, Exception;	
	
    public int eliminar (Persona persona) throws DAOException, Exception;
    
	public List<Persona> obtenerTodos2() throws DAOException, Exception;

	public Persona obtenerLogin(String usser, String password) throws DAOException, Exception;
	
	public int obtenerTodos1(Persona persona) throws DAOException, Exception;
		
	
   // Persona obtener (Long id) throws DAOException;
	
}
