<%@page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<%--    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">--%>
    <title>Insert title here</title>
</head>
<body>
<a href="index" class="button button-green">Вернуться на главную</a>
<h1>Welcome to my page</h1>

<a href="<c:url value='/logout'/>">Logout</a>

<%--<p>Hello ${userLogin.userName}!</p>--%>
<%--<p>You password: ${userLogin.password}!</p>--%>
</body>
</html>
