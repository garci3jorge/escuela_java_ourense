<%-- 
    Document   : registrado
    Created on : 21-feb-2019, 23:21:10
    Author     : IEUser
--%>
<%@page import="com.vn.appusuarios.modelo.Usuario"%>
<%@page import="com.vn.appusuarios.modelo.logica.ServicioUsuarios"%>
<%
	//ServicioUsuarios servicioU = (ServicioUsuarios) request.getAttribute("servicioUsu");
	Usuario usuario = (Usuario) session.getAttribute("usuario");
%>
<html>
<body>
	<h1>Registrado correctamente</h1>
	<%--         <h2 style="color: green"> ID: <%= servicioU.leerUno(usuario.getEmail()).getId()%> --%>
	<!--             <br> -->
	<%--             Nombre: <%= servicioU.leerUno(usuario.getEmail()).getNombre()%> --%>
	<!--         </h2> -->
	<h2 style="color: green">
		ID:
		<%=usuario.getId()%>
		<br> Nombre:
		<%=usuario.getNombre()%>
		<br> Email:
		<%=usuario.getEmail()%>
		<br> Password:
		<%=usuario.getPassword()%>
	</h2>
</body>
</html>
