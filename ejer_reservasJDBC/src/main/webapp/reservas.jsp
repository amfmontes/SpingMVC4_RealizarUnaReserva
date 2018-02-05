<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false" %>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" %>
<%@ page import = "basico.InsertarRegistro"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservas</title>
</head>
<body>
<h1>Realizaci�n de reservas</h1>
<p>

<!-- NO HE CONSEGUIDO A�N QUE META LOS DATOS DEL FORMULARIO EN LA BASE DE DATOS -->

<h3>Si quiere realizar una reserva, proceda a rellenar el siguiente formulario. 
Se le contestar� en la mayor brevedad posible</h3>

<br>
<form action="InsertarRegistro" method="post" >
Nombre: <input type="text" name="nombre"/><br/><br/>
Apellidos: <input type="text" name="apellidos"/> <br/><br/>
Email: <input type="text" name="email"/> <br/><br/>
Tel�fono: <input type="text" name="telefono"/> <br/><br/>
Fecha de entrada: <input type="text" name="fechaEntrada"/> <br/><br/>
Fecha de salida: <input type="text" name="fechaSalida"/> <br/><br/>
Referencia casa: <input type="text" name="idcasa"/> <br/><br/>
<input type="submit" value="Enviar"/>

</form>
<br>
<a href="registrado.jsp">Ver aqu� si se ha registrado</a>
</p>
</body>
</html>