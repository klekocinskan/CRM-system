<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Natalia Klekocińska
  Date: 21.04.2021
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Client Form</title>
</head>
<body>
<form:form method="post" modelAttribute="client">
    <p>
        Name: <form:input path="firstName" />
    </p>

    <p>
        Surname: <form:input path="lastName" />
    </p>

    <p>
        Email: <form:input path="email" />
    </p>
    <p>
        Phone number: <form:input path="telephonNumber" />
    </p>
    <p>
        Address: <form:input path="address" />
    </p>

    <input type="submit" value="dodaj">

</form:form>
</body>
</html>
