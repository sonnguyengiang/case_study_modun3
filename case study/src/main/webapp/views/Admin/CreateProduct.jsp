<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06/08/2021
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <h2>Create Account</h2>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>tên sản phẩm</th>
            <th>tên hãng</th>
            <th>giá</th>
            <th>màu sắc</th>
            <th>loại sản phẩm</th>
            <th>số lượng</th>
            <th>hình ảnh</th>
            <th>Create</th>
        </tr>
        </thead>
        <form action="/product?action=create" method="post">
            <tbody>
            <tr>
                <td><input type="text" name="tensp"></td>
                <td><input type="text" name="tenhang"></td>
                <td><input type="text" name="price"></td>
                <td><input type="text" name="color"></td>
                <td><input type="text" name="loaisp"></td>
                <td><input type="text" name="soluong"></td>
                <td><input type="text" name="img"></td>
                <td>
                    <button type="submit"><img src="/img/create.png" alt="" width="30px" height="30px"></button>
                </td>
            </tr>
            </tbody>
        </form>
    </table>
</div>
</body>
</html>


