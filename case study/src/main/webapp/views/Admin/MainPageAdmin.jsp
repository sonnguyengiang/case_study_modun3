<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04/08/2021
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/css/Admin/mainPage.css">
    <link rel="stylesheet" href="/css/Admin/menuList.css">
    <!-- Place favicon.ico in the root directory -->
    <link rel="shortcut icon" type="image/x-icon" href="/img/favicon.png">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">

</head>
<body>
<div id="main">
    <div id="head"></div>
    <div id="head-link"></div>
    <div id="left">
        <div class="btn">
            <h3 align="center" >Menu list</h3>
            <div id="menu">
                <ul>
                    <li><a href="#">Quản lý tài khoản</a>
                        <ul>
                            <li><a href="/admin?action">hiện thị toàn bộ tài khoản</a></li>
                            <li><a href="/admin?action=create">Tạo tài khoản</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Quản lý đơn hàng </a>
                        <ul>
                            <li><a href="/product?action=show">Hiện thị danh sách đơn hàng</a></li>
                            <li><a href="/product?action=create">Thêm sản phẩm</a></li>
                        </ul>
                    </li>
                    <li><a href="#">tài chính</a>
                        <ul>
                            <li><a href="/admin?action=showBill">Hiện thị các hóa đơn</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="/index.jsp">log out</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div id="content"></div>
    <div id="right"></div>
    <div id="footer"></div>
</div>
</body>
</html>