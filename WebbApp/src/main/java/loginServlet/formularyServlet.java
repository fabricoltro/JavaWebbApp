package loginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * formularyServlet implementation class formularyServlet
 */
@WebServlet("/formularyServlet")
public class formularyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formularyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String telefono = request.getParameter("telefono");
		String correo = request.getParameter("correo");
		String dni = request.getParameter("dni");
		String usuario = request.getParameter("usuario");
		String contraseña = request.getParameter("password");
		String confirmpass = request.getParameter("confirmpassword");
		String genero = request.getParameter("genero");
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Resultado formularyServlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Parametros procesados por el servlet</h1>");
		out.print("<table border='1'>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Usuario");
		out.print("</td>");
		out.print("<td>");
		out.print(usuario);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Contrase�a");
		out.print("</td>");
		out.print("<td>");
		out.print(contraseña);
		out.print("</td>");
		out.print("</tr>");

		out.print("<tr>");
		out.print("<td>");
		out.print("Nombre");
		out.print("</td>");
		out.print("<td>");
		out.print(nombre);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Apellido");
		out.print("</td>");
		out.print("<td>");
		out.print(apellido);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("DNI");
		out.print("</td>");
		out.print("<td>");
		out.print(dni);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Telefono");
		out.print("</td>");
		out.print("<td>");
		out.print(telefono);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Correo");
		out.print("</td>");
		out.print("<td>");
		out.print(correo);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Genero");
		out.print("</td>");
		out.print("<td>");
		out.print(genero);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("</body>");
		out.print("</table>");
		out.print("</html>");
		
		
		// SERVLETS
		
		
		//doGet(request, response);
	}

}
