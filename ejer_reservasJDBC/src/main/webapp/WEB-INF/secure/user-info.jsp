<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Spring 4 Security Example</title>
    </head>
    <body>
      <h3>Logged In User Detail</h3>
      <table>
        <tr><td>Name</td><td><c:out value="${user.fullName}"/></td></tr>
        <tr><td>Role</td><td><c:out value="${user.role}"/></td></tr>
        <tr><td>Country</td><td><c:out value="${user.country}"/></td></tr>
      </table>      
      <form action="<%=request.getContextPath()%>/appLogout" method="POST">
        <input type="submit" value="Logout"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>		
      </form> 
       <h4><a href="<%=request.getContextPath()%>/user/verreservas">Ver reservas realizadas</a></h4>     
    </body>
</html>  