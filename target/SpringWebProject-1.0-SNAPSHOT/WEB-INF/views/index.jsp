<%-- 
    Document   : index
    Created on : Nov 28, 2018, 2:07:45 PM
    Author     : anis
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ol>
        <c:forEach var="s" items="${students}">
            <li>${s.fullName}</li>
        </c:forEach>
        </ol>
    </body>
</html>
