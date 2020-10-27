<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SSM</title>
</head>
<body>
<a href="account/findAll">查询所有</a>
<form method="post" action="account/save">
    Name:<input type="text" name="name"><br>
    Money:<input type="text" name="money"><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
