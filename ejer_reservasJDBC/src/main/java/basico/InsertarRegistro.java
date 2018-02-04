/**
 * 
 */
package basico;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Ana
 *
 */
@WebServlet("/Insertar")
public class InsertarRegistro extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public InsertarRegistro() {
//		super();
//	}
			
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
	}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
//			String nombre = request.getParameter("nombre");
//			String apellidos = request.getParameter("apellidos");
//			String email = request.getParameter("email");
//			String telefono = request.getParameter("telefono");
//			String fechaEntrada = request.getParameter("fechaEntrada");
//			String fechaSalida = request.getParameter("fechaSalida");
//			String idcasa = request.getParameter("idcasa");
			
		
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			try {
				Class.forName("com.mysql.jdbc.Driver");

				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservas", "root", "");
				
				PreparedStatement ps = conn.prepareStatement("INSERT INTO clientes(nombre, apellidos, email, telefono,"
						+ "fechaEntrada, fechaSalida, idcasa) VALUES (?,?,?,?,?,?,?)");

				ps.setString(1, request.getParameter("nombre"));
				ps.setString(2, request.getParameter("apellidos"));
				ps.setString(3, request.getParameter("email"));
				ps.setString(4, request.getParameter("telefono"));
				ps.setString(5,request.getParameter ("fechaEntrada"));
				ps.setString(6,request.getParameter ("fechaSalida"));
				ps.setString(7, request.getParameter("idcasa"));
				
		ps.executeUpdate();


				out.println("<p>Resgistro insertado</p>");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			

	

	
	
	}//el de main

}//el de class
