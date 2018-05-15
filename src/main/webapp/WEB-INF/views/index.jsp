<%-- 
    Document   : inde
    Created on : May 15, 2018, 6:34:21 PM
    Author     : USER
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
        <h1>Skills</h1>
    <c:forEach var="skill" items="${requestScope.skills}">
        <h2>${skill.name}</h2>
    </c:forEach>
    </body>
</html>
