<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update manufacturer</title>
</head>
<body>
<h1>Manufacturer ID</h1>
<form action="/update-manufacturer" method="post" accept-charset="UTF-8">
    <p>Type ID</p>
    <input type="text" name="manufacturerId">
    <p>New manufacturer name</p>
    <input type="text" name="manufacturerName">
    <input type="submit" value="Submit">
</form>
</body>
</html>
