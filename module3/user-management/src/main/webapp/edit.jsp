<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 12/1/2023
  Time: 11:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit product</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <a href="/userServlet">Back to customer list</a>
</p>
<c:if test="${product != null}">
    <input type="hidden" name="id", value="<c:out value='${product.id}'/>" >
</c:if>
<form method="post">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" value="${requestScope["product"].getName()}"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" id="email" value="${requestScope["product"].getEmail()}"></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td><input type="text" name="country" id="country" value="${requestScope["product"].getCountry()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="save"></td>
            </tr>
        </table>
    </fieldset>
</form>

</body>
</html>
