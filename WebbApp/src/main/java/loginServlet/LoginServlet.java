package loginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao2.Persona;
import dao2.PersonaDAO;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
  
    public LoginServlet() {
        super();
      
    }

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
			response.setContentType("text/html;charset=UTF-8");			
			PrintWriter out = response.getWriter();
			Persona persona = new Persona();
			PersonaDAO personaDao = new PersonaDAO();						
				try {	
					String accionBoton = request.getParameter("btnlogin");
					if(accionBoton.equalsIgnoreCase("ingresar")) {
						String usuario = request.getParameter("txtusser");
						String contraseña = request.getParameter("txtpass");						
						 persona=personaDao.obtenerLogin(usuario, contraseña);
						if(persona.getUsser() != null) {
							request.getRequestDispatcher("loginSucces.jsp").forward(request, response);	
							System.out.println("usuario = " + usuario);	
							System.out.println("password = " + contraseña);
						}else {
							request.getRequestDispatcher("login.jsp").forward(request, response);
						}												
					}										
				} catch (Exception e) {
					request.getRequestDispatcher("index.jsp").forward(request, response);			
			}
			
		
		/*
		
		
		String accion = request.getParameter("btnlogin");
		if (accion.equals("ingresar")) {
			
			String user = request.getParameter("txtusser");
			String pas = request.getParameter("txtpass");
			
			PersonaDAO logindao = new PersonaDAO();
			Persona p = new Persona();			
			int r;
			p.setUsser(user);
			p.setPassword(pas);						
			
			try {
				r=logindao.obtenerLogin(p);				
				if (r==1) {
				request.getRequestDispatcher("loginSucces.jsp").forward(request, response);
				System.out.println("usuario = " + user);	
				System.out.println("password = " + pas);			
				}else {
					request.getRequestDispatcher("index.html").forward(request, response);
					System.out.println("problemas en el Login-Servlet");
					out.println("Error al logearse en: Login/Servlet/java");
					out.print("error al logearse");
				}				
			} catch (Exception e) {
				
				System.out.println("problemas en el Login-Servlet");
				out.println("Error al logearse en: Login/Servlet/java");
				e.printStackTrace();
			}
			
												
		}else {
			System.out.println("problemas en el primer if");
			request.getRequestDispatcher("index.html").forward(request, response);
		}
		
		*/
	}

}
