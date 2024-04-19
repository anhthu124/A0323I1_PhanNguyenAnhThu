<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 12/1/2023
  Time: 8:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
</head>
<body>
<h1>Create new product</h1>
<p>
    <a href="/productServlet">Back to  list</a>
</p>
<form method="post" action="/productServlet?action=create">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" id="price"></td>
            </tr>
            <tr>
                <td>Quantily</td>
                <td><input type="text" name="quatily" id="quatily"></td>
            </tr>
            <tr>
                <td>Color</td>
                <td><input type="text" name="color" id="color"></td>
            </tr>
            <tr>
                <td>Description</td>
                <td><input type="text" name="Description" id="description"></td>
            </tr><tr>
            <td>Category</td>
            <td><input type="text" name="Category" id="category"></td>
        </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Add new product"></td>
            </tr>
        </table>
    </fieldset>
</form>

</body>
</html>
