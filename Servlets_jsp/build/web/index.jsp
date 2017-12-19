<%-- 
    Document   : index
    Created on : 17/11/2017, 20:03:37
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
        <h1>Entrada de datos</h1>
        <form action="RecogeDatos" method="POST">
            <h2>Datos del alumno</h2>
            Nombre: <input type="text" name="nombre" value="" /><br>
            Primer Apellido: <input type="text" name="apellido1" value="" />
            Segundo Apellido: <input type="text" name="apellido2" value="" />
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
