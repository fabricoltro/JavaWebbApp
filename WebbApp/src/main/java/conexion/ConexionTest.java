package conexion;

import java.sql.SQLException;

public class ConexionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ConnectionManager cc = new ConnectionManager();

		if (cc.conectar() != null) {
			System.out.println("La conexion a BD es correcta");
		}else {
			System.out.println("Error de conexion");
		}
		
	}

}
