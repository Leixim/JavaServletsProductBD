<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Manufacturer</title>
</head>
<body>
<h1>New manufacturer</h1>
<form action="/add-manufacturer" method="post" accept-charset="UTF-8">
    <p>Manufacturer name</p>
    <input type="text" name="manufacturerName">
    <input type="submit" value="Add">
</form>
</body>
</html>
