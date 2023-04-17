package loginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao2.Persona;
import dao2.PersonaDAO;

/**
 * formularyServlet implementation class FormularioServlet
 */
@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String action = request.getServletPath();
		PersonaDAO personadao = new PersonaDAO();
		
		
			
	}
	protected void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("formulary.jsp");
		dispatcher.forward(request, response);
		
		
		
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		
		
		
	/*  String accion = request.getParameter("btnlogin");
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
					System.out.println("problemas en el Login-formularyServlet");
					out.println("Error al logearse en: Login/formularyServlet/java");
					out.print("error al logearse");
				}				
			} catch (Exception e) {
				
				System.out.println("problemas en el Login-formularyServlet");
				out.println("Error al logearse en: Login/formularyServlet/java");
				e.printStackTrace();
			}
			
												
		}else {
			System.out.println("problemas en el primer if");
			request.getRequestDispatcher("index.html").forward(request, response);
		}
			
		*/
		
		 
	}
	
	protected void insertUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
	}

}
