<%--
  Created by IntelliJ IDEA.
  User: Dmytro
  Date: 05.11.2017
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete manufacturer </title>
</head>
<body>
<h1>Manufacturer ID</h1>

<form action="/delete-manufacturer" method="post" accept-charset="UTF-8">
    <p>Введите ID Производителя</p>
    <input type="text" name="manufacturerId">
    <input type="submit" value="Подтвердить">

</form>



</body>
</html>
