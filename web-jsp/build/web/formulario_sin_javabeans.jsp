<%-- 
    Document   : formulario_sin_javabeans
    Created on : 14/11/2017, 20:35:55
    Author     : fernandez163
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario sin Javabeans</h1>
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
            Los valores introducidos son:<br><br>
            Nombre: <%= nombre %><br>
            Email: <%= email %> <br>
        <% } %>
    </body>
</html>
