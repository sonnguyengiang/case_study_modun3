<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06/08/2021
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Admin</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Account List</h2>
    <p>all list in account</p>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Back</th>
            <th>Create</th>
            <th>Find</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><a href="/views/Admin/MainPageAdmin.jsp"><img src="img/back.png" height="30px" width="30px"></a></td>
            <td><a href="/product?action=create"><img src="img/create.png" height="30px" width="30px"></a></td>
        </tr>
        </tbody>
    </table>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>#</th>
            <th>tên sản phẩm</th>
            <th>tên hãng</th>
            <th>giá</th>
            <th>màu sắc</th>
            <th>loại sản phẩm</th>
            <th>số lượng</th>
            <th>hình ảnh</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productList}" var="product" varStatus="loop">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.tenhang}</td>
                <td>${product.price}</td>
                <td>${product.color}</td>
                <td>${product.loaisp}</td>
                <td>${product.soluong}</td>
                <td><img src="${product.img}" width="50px" height="50px"></td>
                <td><a href="/product?action=edit&index=${loop.index}"><img src="img/edit.png" height="30px" width="30px"></a></td>
                <td><a href="/product?action=delete&index=${loop.index}"><img src="img/trash.png" height="30px" width="30px"></a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

