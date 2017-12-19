<%-- 
    Document   : formularios_con_javabeans
    Created on : 14/11/2017, 20:56:52
    Author     : fernandez163
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="usuario" scope="request" class="Entidad.InfoUsuario" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formularios con Javabeans</h1>
        <% if(request.getParameter("name")==null
                && request.getParameter("email")==null) { %>
                Complete este formulario
        <form method="POST">
            Nombre: <input type="text" name="name" value="" /><br>
            email:  <input type="text" name="email" value="" /><br>
            
            <input type="submit" value="Enviar" />
        </form>
        <% } else { %> <%-- scriplet de JSP --%>
        <% String nombre,email; %>
        <% nombre = request.getParameter("name");
           email = request.getParameter("email");
            %>
            <jsp:setProperty name="usuario" property="name" value="<%=nombre %>" />
            <jsp:setProperty name="usuario" property="email" value="<%=email %>" />
            <jsp:forward page="/resultado.jsp"></jsp:forward>
        <% } %>
    </body>
</html>
