<%-- 
    Document   : mostrarDatos
    Created on : 17/11/2017, 20:27:29
    Author     : fernandez163
--%>
<jsp:useBean id="alumno" scope="request" class="Entidad.InfoAlumno" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>El alumno introdujo los siguientes datos:</h1>
        Nombre: <jsp:getProperty name="alumno" property="nombre" /><br>
        Primer Apellido: <jsp:getProperty name="alumno" property="primerApellido" /><br>
        Segundo Apellido: <jsp:getProperty name="alumno" property="segundoApellido" />
    </body>
</html>
