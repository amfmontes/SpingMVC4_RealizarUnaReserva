package com.concretepage.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.concretepage.entity.ClientesPojo;

/**
 * Servlet implementation class VerRegistrosServlet
 */
@WebServlet("/Clientes")
public class VerRegistrosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VerRegistrosServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		

	public static LinkedList<ClientesPojo> getClientesPojo() {
		LinkedList<ClientesPojo> listaClientes = new LinkedList<ClientesPojo>();

		// RequestDispatcher rd=
		// getServletContext().getRequestDispatcher("/user/blog.jsp");
		// rd.forward(request, response);

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservas", "root", "");
			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM clientes");
			while (rs.next()) {
				ClientesPojo cliente = new ClientesPojo();
				cliente.setId(rs.getInt("id"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellidos(rs.getString("apellidos"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTelefono(rs.getString("telefono"));
				cliente.setIdcasa(rs.getInt("idcasa"));
				cliente.setFechaEntrada(rs.getString("fechaEntrada"));
				cliente.setFechaSalida(rs.getString("fechaSalida"));
				
				listaClientes.add(cliente);
			}
			rs.close();
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaClientes;

	}

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
