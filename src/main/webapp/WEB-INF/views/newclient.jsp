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
        <form:errors path="firstName" cssClass="error" />
    </p>

    <p>
        Surname: <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error" />
    </p>

    <p>
        Email: <form:input path="emailAdress" />
        <form:errors path="emailAdress" cssClass="error" />
    </p>
    <p>
        Phone number: <form:input path="telephonNumber" />
        <form:errors path="telephonNumber" cssClass="error" />
    </p>
    <p>
        Address: <form:input path="address" />
        <form:errors path="address" cssClass="error" />
    </p>

    <input type="submit" value="dodaj">

</form:form>
</body>
</html>
