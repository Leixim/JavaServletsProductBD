<%@ page import="models.Manufacturer" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.ManufacturerDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add product</title>
</head>
<body>
<h1>New product</h1>
<form action="/add-product" method="post" accept-charset="UTF-8">
    <p>Product name</p>
    <input type="text" name="product_name">
    <p>Product price</p>
    <input type="text" name="product_price">
    <p>Product manufacturer</p>
    <select name="manufacturerid" style="width: 50mm">
        <option value="">Manufacturer</option>
        <%!
            private String manufacturerName;
            private Long manufacturerId;
            ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
        %>
        <%
            List<Manufacturer> manufacturerList = manufacturerDAO.getAll();
            for (Manufacturer m : manufacturerList) {
                manufacturerName = m.getManufacturerName();
                manufacturerId = m.getId();
        %>
        <option value="<%=manufacturerId%>">"<%=manufacturerName%>"</option>
        <%
            }
        %>

    </select>
    <input type="submit" value="Add">
</form>
</body>
</html>