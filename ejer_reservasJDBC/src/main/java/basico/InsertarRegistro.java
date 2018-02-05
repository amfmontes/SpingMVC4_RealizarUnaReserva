package basico;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.sql.Insert;

/**
 * Servlet implementation class InsertarRegistro
 */
public class InsertarRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarRegistro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		String n= request.getParameter("nombre");
		String ap= request.getParameter("apellidos");
		String em= request.getParameter("email");
		String t= request.getParameter("telefono");
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");	
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservas", "root", "");
			
			PreparedStatement ps=conn.prepareStatement("INSERT INTO clientes (nombre, apellidos, email, telefono) VALUES (?,?,?,?)");
			ps.setString(1, n);
			ps.setString(1, ap);
			ps.setString(1, em);
			ps.setString(1, t);
			int insertar= ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/registrado.jsp");
		
		

		
		
	}

}
