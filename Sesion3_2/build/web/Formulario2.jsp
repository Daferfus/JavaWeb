<%-- 
    Document   : formulario2
    Created on : 24/11/2017, 16:41:31
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
        <b>Usted indico la siguiente informacion: </b>
        <br><b>Pelicula:</b><jsp:getProperty name="clientes" property="nombre" />
        <br><b>Dias de Alquiler:</b><jsp:getProperty name="clientes" property="dias" />
        <br><b>Edad de Cliente:</b><jsp:getProperty name="clientes" property="edad" />
        <br><b>Forma de Pago:</b><jsp:getProperty name="clientes" property="pago" />
        <br><b>Extras:</b><jsp:getProperty name="clientes" property="especificaciones" />
        <b>¡Disfrute de la pelicula!</b>
    </body>
</html>
