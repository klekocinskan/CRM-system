<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Natalia Klekocińska
  Date: 24.04.2021
  Time: 07:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new concract</title>
</head>
<body>
<form:form method="post" modelAttribute="contract">
    Contract name: <form:input path="contractName"/>
    Additional information: <form:textarea path="comment"/>
    Contract price: <form:input path="contractValue"/>
    <input type="submit" value="save">
</form:form>


</body>
</html>
