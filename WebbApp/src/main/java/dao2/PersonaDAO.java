package dao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import conexion.ConnectionManager;
import conexion.DAOException;


public class PersonaDAO extends ConnectionManager implements DAO{
			
	private static final String SQL_SELECT = "SELECT id_persona,nombre,apellido,telefono,correo,dni,usuario,password FROM formulario.datos";
	private static final String SQL_SELECT_LOGIN = "SELECT * FROM formulario.datos WHERE usser=? AND password=?";
	private static final String SQL_INSERT = "INSERT INTO formulario.datos (nombre,apellido,telefono,correo,dni,usser,password) VALUES (?,?,?,?,?,?,?)";	
	private static final String SQL_UPDATE = "UPDATE formulario.datos SET nombre= ? ,apellido = ?,telefono = ?,correo= ?, dni= ? ,usser = ? ,password = ?   WHERE id_persona = ? ";
	private static final String SQL_DELETE = "DELETE FROM formulario.datos WHERE id_persona = ? ";
	
	private Connection conexionTransaccional;
	
	Connection conn = null;
	Statement st = null;
	PreparedStatement stm ;	
	ResultSet rs = null;
		
	public PersonaDAO() {
		
	}
	public PersonaDAO(Connection conexionTransaccional) {
		this.conexionTransaccional = conexionTransaccional;
	}
		
	
	
	@Override
		
	public Persona obtenerLogin(String usser, String password) throws DAOException, Exception {
			int registros = 0;
			Persona persona = new Persona();
		try {
			
			conn = ConnectionManager.conectar();
			stm =  (PreparedStatement) conn.prepareStatement(SQL_SELECT_LOGIN);	
			stm.setString(1, usser);
			stm.setString(2, password);	
			rs=stm.executeQuery();
			while(rs.next())
			{									
				persona.setUsser(rs.getString("usser"));
				persona.setPassword(rs.getString("password"));	
				
			}																											
			
		} catch (Exception e) {
			System.out.println("error en el metodo obtener login!");
			
		}
		return persona;
	
		}
							
	
	@Override		
	public int insertar(Persona persona) throws Exception {					
		int registros = 0;					
		try {
			conn = this.conexionTransaccional !=null ? this.conexionTransaccional : ConnectionManager.conectar();
			stm = (PreparedStatement) conn.prepareStatement(SQL_INSERT);
			stm.setString(1, persona.getNombre());
			stm.setString(2, persona.getApellido());
			stm.setInt(3, persona.getTelefono());
			stm.setString(4, persona.getEmail());
			stm.setInt(5, persona.getDni());
			stm.setString(6, persona.getUsser());
			stm.setString(7, persona.getPassword());
			registros = stm.executeUpdate();								
		
		}
		finally {		
			try {
			stm.close();				
				} catch (Exception e2) {
				e2.printStackTrace(System.out);
				}
			if (this.conexionTransaccional ==null) {
				conn.close();	
			}			
		}
		return registros;									
	}
	
	@Override	
	public int obtenerTodos1(Persona persona) throws DAOException, Exception {						
			
		int registros = 0;	
		try {
			conn = this.conexionTransaccional !=null ? this.conexionTransaccional : ConnectionManager.conectar();
			stm = (PreparedStatement) conn.prepareStatement(SQL_SELECT_LOGIN);
			rs = stm.executeQuery();
			while (rs.next()) {
				int id          =    rs.getInt("id_persona");
				String nombre   =     rs.getString("nombre");
				String apellido =   rs.getString("apellido");
				int telefono    =      rs.getInt("telefono");
				String email    =     rs.getString("correo");
				int dni         =           rs.getInt("dni");
				String usser     =     rs.getString("usser");
				String pass     =   rs.getString("password");
				stm.setString(6, persona.getUsser());
				stm.setString(7, persona.getPassword());
				persona = new Persona(id, nombre, apellido, telefono, email, dni, usser, pass);
			    registros = stm.executeUpdate();	
			
			}
		
		}
		finally {		
			try {
			rs.close();
			stm.close();				
				} catch (Exception e2) {
				e2.printStackTrace(System.out);
				}
			if (this.conexionTransaccional ==null) {
				conn.close();	
			}			
		}
		return registros;			
			
	}
	
	
	@Override	
	public List<Persona> obtenerTodos2() throws DAOException, Exception {				
		Persona persona = null;
		List<Persona> personas = new ArrayList<>();		
		
		try {
			conn = this.conexionTransaccional !=null ? this.conexionTransaccional : ConnectionManager.conectar();
			stm = (PreparedStatement) conn.prepareStatement(SQL_SELECT);
			rs = stm.executeQuery();
			while (rs.next()) {
				int id          =    rs.getInt("id_persona");
				String nombre   =     rs.getString("nombre");
				String apellido =   rs.getString("apellido");
				int telefono    =      rs.getInt("telefono");
				String email    =     rs.getString("correo");
				int dni         =           rs.getInt("dni");
				String usser     =     rs.getString("usuario");
				String pass     =   rs.getString("password "); 
				persona = new Persona(id, nombre, apellido, telefono, email, dni, usser, pass);
			    personas.add(persona);	
			
			}
		
		}
		finally {		
			try {
			rs.close();
			stm.close();				
				} catch (Exception e2) {
				e2.printStackTrace(System.out);
				}
			if (this.conexionTransaccional ==null) {
				conn.close();	
			}			
		}
		return personas;			
			
	}
	
  
	public int eliminar(Persona persona) throws DAOException, Exception {
		Connection conn = null;		
		PreparedStatement stm = null;					
		int registros = 0;					
		try {
			conn = this.conexionTransaccional !=null ? this.conexionTransaccional : ConnectionManager.conectar();
			stm = (PreparedStatement) conn.prepareStatement(SQL_DELETE);			
	        stm.setInt(1, persona.getId());
			registros = stm.executeUpdate();								
		
		}
		finally {		
			try {
			stm.close();				
				} catch (Exception e2) {
				e2.printStackTrace(System.out);
				}
			if (this.conexionTransaccional ==null) {
				conn.close();	
			}			
		}
		return registros;	
		
		
	}
	@Override
	public int actualizar(Persona persona) throws Exception {
		Connection conn = null;		
		PreparedStatement stm = null;					
		int registros = 0;					
		try {
			conn = this.conexionTransaccional !=null ? this.conexionTransaccional : ConnectionManager.conectar();
			stm = (PreparedStatement) conn.prepareStatement(SQL_UPDATE);
			stm.setString(1, persona.getNombre());
			stm.setString(2, persona.getApellido());
			stm.setInt(3, persona.getTelefono());
			stm.setString(4, persona.getEmail());
			stm.setInt(5, persona.getDni());
	        stm.setString(6, persona.getUsser());
	        stm.setString(7, persona.getPassword());
	        stm.setInt(8, persona.getId());
	        	        
			registros = stm.executeUpdate();										
		}
		finally {		
			try {
			stm.close();				
				} catch (Exception e2) {
				e2.printStackTrace(System.out);
				}
			if (this.conexionTransaccional ==null) {
				conn.close();	
			}			
		}
		return registros;	
		
		
	}
	
	
	
	
	
}
