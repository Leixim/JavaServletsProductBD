<%@ page import="models.Manufacturer" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.ManufacturerDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add product</title>
</head>
<body>
<h1>Новый продукт.</h1>

<form action="/add-product" method="post" accept-charset="UTF-8">
    <p>Наименование товара</p>
    <input type="text" name="product_name">

    <p>Product price</p>
    <input type="text" name="product_price">

    <p>Указать производителя.</p>


    <select name="manufacturerid" style="width: 50mm">
        <option value="">Производитель</option>
        <%!
            private String manufacturerName;
            private Long manufacturerId;
            ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
        %>
        <%
        List<Manufacturer> manufacturerList = manufacturerDAO.getAll() ;
        for(Manufacturer m: manufacturerList) {
            manufacturerName = m.getManufacturerName();
            manufacturerId = m.getId();
    %>
        <option value="<%=manufacturerId%>">"<%=manufacturerName%>"</option>
        <%}
        %>

    </select>


    <input type="submit" value="Добавить.">

</form>


</body>
</html>