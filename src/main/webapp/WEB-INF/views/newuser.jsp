<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Natalia Klekocińska
  Date: 24.04.2021
  Time: 08:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
</head>
<body>
<form:form method="post" modelAttribute="user">
    <p>
       Name: <form:input path="name"/>
    </p>
    <p>
        Surname: <form:input path="surname" />
    </p>

    <p>
        Email: <form:input path="email" />
    </p>

    <input type="submit" value="register">
</form:form>
</body>
</html>
