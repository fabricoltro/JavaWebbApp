package loginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConnectionServlet
 */
@WebServlet("/ConnectionServlet")
public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ConnectionServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String metodoHttp = request.getMethod();
		
		String genero = request.getParameter("genero");
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title> Headers Servlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Client Connections</h1>");
		out.print("<table border='1'>");
		out.print("Metodo Http:" + metodoHttp);
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Usuario");
		out.print("</td>");
		out.print("<td>");
		out.print();
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Contrase�a");
		out.print("</td>");
		out.print("<td>");
		out.print();
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
		
		
		doGet(request, response);
	}

}
