<%-- 
    Document   : scripts
    Created on : 10/11/2017, 21:24:53
    Author     : fernandez163
--%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Contenido dinamico SCRIPTS JSP!</h1>
        <ul>
            <li><b>Expresiones JSP</b>
                Fecha Actual: <%= new Date() %></li>
            <li><b>Scriplet JSP</b>
                <% Calendar cal=Calendar.getInstance();
                out.println("La fecha actual es:"+
                        cal.get(Calendar.DATE)+ "/" + (cal.get(Calendar.MONTH)+1) +
                        "/" + cal.get(Calendar.YEAR) );
                %>
                
            </li>
            <li><b>Declaracion (mas expresion) </b><br>
                <%! private int accessCount = 0; %>
                Accesos a la pagina
                <%= ++accessCount %>
        </ul>
    </body>
</html>
