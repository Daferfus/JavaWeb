<%-- 
    Document   : variablesImpl
    Created on : 14/11/2017, 20:26:56
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
        <h1>Objeto Request</h1>
        La Ip del ordenador es <%= request.getRemoteHost() %>
        <br>
        El nombre del servidor es <%= request.getServerName() %>
        <br>
        El puerto del servidor es <%= request.getServerPort() %>
        <br>
        La Ip del servidor es <%= request.getRemoteAddr()%>
        <br>
        El protocolo es <%= request.getProtocol() %>
    </body>
</html>
