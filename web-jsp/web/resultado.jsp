<%-- 
    Document   : resultado
    Created on : 14/11/2017, 21:12:07
    Author     : fernandez163
--%>
<jsp:useBean id="usuario" scope="request" class="Entidad.InfoUsuario" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultados</h1>
        Usted indico la siguiente informacion
        <br><b>Nombre:</b><jsp:getProperty name="usuario" property="name" />
        <br><b>Email:</b><jsp:getProperty name="usuario" property="email" />
    </body>
</html>
