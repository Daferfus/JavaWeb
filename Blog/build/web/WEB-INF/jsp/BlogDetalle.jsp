<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LISTA DE POSTS</h1>
        <table border="2">
            <c:forEach items="${posts}" var="post">
                <tr>
                    <!--<c:out value="${post.getPostTitle()}"></c:out>-->
                    <td>${post.getPostTitle()}</td>
                    <td>${post.getPostSlug()}</td>
                </tr>
            </c:forEach>
        </table>    
    </body>
</html>
