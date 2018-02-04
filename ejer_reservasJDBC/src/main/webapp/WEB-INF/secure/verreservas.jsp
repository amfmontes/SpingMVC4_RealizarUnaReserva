<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page language="java" %>
<%@ page import = "com.concretepage.entity.ClientesPojo"%> 
<%@ page import = "com.concretepage.controller.VerRegistrosServlet"%> 
<%@ page import = "java.util.LinkedList"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservas realizadas</title>
</head>
<body>
	<h1>Welcome!</h1>
	
<!-- PENDIENTE DE PONER LAS FECHAS EN EL JSP, POJO Y SERVLET -->

	<h3>Estas son las reservas hechas</h3>
	<div class="container">

		<table class="table table-striped">

			<thead>
				<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>Apellidos</th>
					<th>Email</th>
					<th>Teléfono</th>
					<th>Referencia de casa</th>
					<th>Fecha de entrada</th>
					<th>Fecha de salida</th>
					

				</tr>
			</thead>
			<tbody>
			<%
LinkedList<ClientesPojo> lista = VerRegistrosServlet.getClientesPojo();
for (int i=0;i<lista.size();i++)
{
   out.println("<tr>");
   out.println("<td>"+lista.get(i).getId()+"</td>");
   out.println("<td>"+lista.get(i).getNombre()+"</td>");
   out.println("<td>"+lista.get(i).getApellidos()+"</td>");
   out.println("<td>"+lista.get(i).getEmail()+"</td>");
   out.println("<td>"+lista.get(i).getTelefono()+"</td>");
   /* out.println("<td>"+lista.get(i).getFechaEntrada()+"</td>");
   out.println("<td>"+lista.get(i).getFechaSalida()+"</td>"); */
   out.println("<td>"+lista.get(i).getIdcasa()+"</td>");
    out.println("</tr>");
}
%>
				<%-- <c:forEach items="${listClientes}" var="clientes">
					<p>
					<tr>
						<td><c:out  value="${clientes.id}"></c:out></td>
						<td><c:out value="${clientes.nombre}"></c:out></td>
						<td><c:out value="${clientes.apellidos}"></c:out></td>
						<td><c:out value="${(clientes.email)}"></c:out></td>
						<td><c:out value="${clientes.telefono}"></c:out></td>
						<td><c:out value="${clientes.fechaEntrada}"></c:out></td>
						<td><c:out value="${clientes.fechaSalida}"></c:out></td>
					</tr> --%>
					<!-- </p>
			 -->
				</p>



			</tbody>
		</table>
	</div>
</body>
</html>