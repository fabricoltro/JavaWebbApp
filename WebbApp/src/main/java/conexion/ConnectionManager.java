package conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionManager {
	

	private static Connection con;
	
	public static Connection getConexion() {
		return con;
	}
	public static  Connection conectar() throws ClassNotFoundException, SQLException{
		
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/formulario","root", "admin");
		} catch (Exception e) {
			System.out.println("Error al conectar" + e.getMessage());
		}								
			return con;		
	}
	public static void desconectar() throws SQLException{
		con.close();
		
	}
	public static void close(ResultSet rs, PreparedStatement stm, Statement st) throws SQLException{
		
		rs.close();
		st.close();
		stm.close();
		con.close();
		
	}
	
}