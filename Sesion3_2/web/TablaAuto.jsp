<%-- 
    Document   : TablaAuto
    Created on : 24-nov-2017, 12:34:48
    Author     : Michael Soft
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="navbar.html" %>
        <table border="1">

            <%  for (int i = 0; i < 55; i = i + 6) {%>
            <tr>
                <td>
                    <%= i%>
                </td>
            <% for (int g = i+1; g < i + 6; g++) {%>
            <td>
                <%= g%>
            </td>
            <% } %>
        </tr>
        <% } %>       
    </table>
</body>
</html>
