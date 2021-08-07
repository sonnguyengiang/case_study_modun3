<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06/08/2021
  Time: 20:08
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
    <!-- Place favicon.ico in the root directory -->
    <link rel="shortcut icon" type="image/x-icon" href="/img/favicon.png">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">

</head>
<body>
<div class="container">
    <h2>Edit Account</h2>
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
        </tr>
        </thead>
        <form method="post">
            <tbody>
            <tr>
                <td><input type="text" name="id" value="${productListEdit.id}" readonly></td>
                <td><input type="text" name="tensp" value="${productListEdit.name}"></td>
                <td><input type="text" name="tenhang" value="${productListEdit.tenhang}"></td>
                <td><input type="text" name="price" value="${productListEdit.price}"></td>
                <td><input type="text" name="color" value="${productListEdit.color}"></td>
                <td><input type="text" name="loaisp" value="${productListEdit.loaisp}"></td>
                <td><input type="text" name="soluong" value="${productListEdit.soluong}"></td>
                <td><input type="text" name="img" value="${productListEdit.img}"></td>
                <td>
                    <button type="submit"><img src="/img/edit.png" alt="" width="30px" height="30px"></button>
                </td>
            </tr>
            </tbody>
        </form>
    </table>
    <a href="/product?action=show"><img src="img/back.png" height="30px" width="30px"></a>
</div>
</body>
</html>


