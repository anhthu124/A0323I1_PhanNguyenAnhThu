<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 3/1/2024
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Phones</title>
</head>
<body>
<h1 style="font-size: 50px">Phone</h1>
<nav class="navbar navbar-light bg-light">
    <div class="container-fluid">
        <a href="/phone_servlet?action=create">
            <button type="button" class="btn btn-primary">Add new phone
            </button>
        </a>
        <form class="d-flex">
            <input type="hidden" name="action" id="action" value="search">
            <input class="form-control me-2" type="search" placeholder="Search by name" name="search" id="search"
                   style="float: right;">
        </form>
    </div>
</nav>
<table class="table">
    <tr>
        <td><b>#</b></td>
        <td><b>NAME</b></td>
        <td><b>PRICE</b></td>
        <td><b>CATEGORY</b></td>
        <td><b>ACTION</b></td>
    </tr>
    <c:forEach items="${phones}" var="p" varStatus="loop">
        <tr>
            <td>
                    ${loop.count}
            </td>
            <td>
                    ${p.getName()}
            </td>
            <td>
                    ${p.getPrice()}$
            </td>

            <c:forEach items="${categories}" var="c">
                <c:if test="${c.getId() == p.getCategory()}">
                    <td>
                            ${c.getName()}
                    </td>
                </c:if>
            </c:forEach>

            <td>
                    <%--                btn edit--%>
                <a href="/phone_servlet?action=edit&id=${p.id}">
                    <button type="button" class="btn btn-primary">Sửa</button>
                </a>
                    <%--                button delete--%>
                <button type="button" onclick="sendInfo('${p.id}','${p.name}')" class="btn btn-danger"
                        data-bs-toggle="modal" data-bs-target="#exampleModal">Delete
                </button>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
<!-- Modal delete-->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Are you sure?</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form method="post" action="/phone_servlet?action=delete">
                <div class="modal-body">
                    <input type="hidden" id="id" name="id">
                    Are you sure to delete <span id="name"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancle</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>
<style>
    table {
        font-size: 20px;
    }
</style>
<script>
    function sendInfo(id, name) {
        document.getElementById("name").innerText = name;
        document.getElementById("id").value = id;
    }
</script>
</html>

