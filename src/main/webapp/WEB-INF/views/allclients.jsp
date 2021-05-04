<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>CRM</title>
</head>
<body>
<c:forEach items="${clients}" var = "client">
        <p>${client}</p>
</c:forEach>
</body>
</html>
