<%-- 
    Document   : formulario1
    Created on : 24/11/2017, 16:40:26
    Author     : fernandez163
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="clientes" scope="request" class="Entidades.AlquilerBean" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="navbar.html" %>
        
        <h1>VIDEOCLUB ON-LINE</h1>
        <% if (request.getParameter("nombre") == null
                    && request.getParameter("dias") == null
                    && request.getParameter("edad") == null
                    && request.getParameter("pago") == null
                    && request.getParameter("especificaciones") == null) { %>
        Complete este formulario
        <form method="POST">
            Nombre Pelicula: <input type="text" name="nombre" value="" /><br>
            Numero Dias Alquiler:  <input type="number" name="dias" value="" /><br><br>
            Edad Cliente: <br> Menor de 7 Años: <input type="radio" name="edad" value="Menor de 7 Años" checked="checked" /><br>
            Menor de 14 Años: <input type="radio" name="edad" value="Menor de 14 Años" /><br>
            Menor de 18 Años: <input type="radio" name="edad" value="Menor de 18 Años" /><br>
            Mayor de 18 Años: <input type="radio" name="edad" value="Mayor de 18 Años" /><br><br>
            Forma pago: <br> <select name="pago">
                <option>VISA</option>
                <option>Contado</option>
            </select><br><br>
            Especificaciones Extras: <br> <textarea name="especificaciones" rows="4" cols="20">
            </textarea>
            <input type="submit" value="Enviar" />
        </form>
        <% } else { %> <%-- scriplet de JSP --%>
        <% String nombre, dias, edad, pago, especificaciones; %>
        <% nombre = request.getParameter("nombre");
            dias = request.getParameter("dias");
            edad = request.getParameter("edad");
            pago = request.getParameter("pago");
            especificaciones = request.getParameter("especificaciones");
        %>
        <jsp:setProperty name="clientes" property="nombre" value="<%=nombre%>" />
        <jsp:setProperty name="clientes" property="dias" value="<%=dias%>" />
        <jsp:setProperty name="clientes" property="edad" value="<%=edad%>" />
        <jsp:setProperty name="clientes" property="pago" value="<%=pago%>" />
        <jsp:setProperty name="clientes" property="especificaciones" value="<%=especificaciones%>" />
        <jsp:forward page="/Formulario2.jsp"></jsp:forward>
        <% }%>
    </body>
</html>