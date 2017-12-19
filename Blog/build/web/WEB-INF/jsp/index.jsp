<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <h1>LISTA DE POSTS</h1>
        <table border = 1>
            <c:forEach items="${lista}" var="post">
                <tr>
                <td><c:out value="${post.getPostTitle()}"></c:out></td>
                <td><img src="<c:url value="/images/${post.getPostImage()}"/>"></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
