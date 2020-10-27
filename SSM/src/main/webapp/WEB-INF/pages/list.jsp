<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h2>Accounts</h2>
<c:forEach items="${list}" var="account">
    <div><h3>用户:${account.name} 余额:${account.money}</h3></div><br>
</c:forEach>
</body>
</html>
