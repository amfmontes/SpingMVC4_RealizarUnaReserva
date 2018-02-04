package basico;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Consola extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Método doGet");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre= request.getParameter("nombre");
		System.out.println(nombre);
		int unidades= Integer.parseInt(request.getParameter("unidades"));
				System.out.println(unidades);
				String email= request.getParameter("email");
				System.out.println(email);
		System.out.println("Método doPost");
		doGet(request, response);

		PrintWriter out;
		response.setContentType("text/html");
		out=response.getWriter();
		out.println("<p>Tu nombre es " + nombre);

	}
	
	
	
	
	
}
