<%-- 
    Document   : ejercicio2
    Created on : 24-nov-2017, 1:33:40
    Author     : Michael Soft
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="navbar.html" %>
        <% Calendar hora = Calendar.getInstance();
            out.println(hora.get(Calendar.HOUR) + ":" + hora.get(Calendar.MINUTE) + ":" + hora.get(Calendar.SECOND));
        %>
    </body>
</html>
