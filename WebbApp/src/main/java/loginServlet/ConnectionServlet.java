package loginServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ConnectionServlet")
public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ConnectionServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String metodoHttp = request.getMethod();
		
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title> Headers Servlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Client Connections</h1>");
		out.print("<table border='1'>");
		out.print("Metodo Http:" + metodoHttp);
		
		String uri = request.getRequestURI();
		out.print("<br>");
		out.print("Uri solicitada : " + uri);
		
		// imprimimos todos los cabeceros disponibles
		out.print("<br>");
		out.print("<br>");
		Enumeration cabeceros = request.getHeaderNames();
		while (cabeceros.hasMoreElements()) {
			String nombreCabecero = (String) cabeceros.nextElement();
			out.print("<br>" + nombreCabecero + "<br>");
			out.print(request.getHeader(nombreCabecero));
			
		}
		
		
		
		out.print("<body>");
		out.print("</html>");
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		
		//doGet(request, response);
	}

}
