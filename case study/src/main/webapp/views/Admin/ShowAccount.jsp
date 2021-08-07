<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04/08/2021
  Time: 07:51
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
    <!-- Place favicon.ico in the root directory -->
    <link rel="shortcut icon" type="image/x-icon" href="/img/favicon.png">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">

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
        <form action="/admin?action=find" method="post">
            <tbody>
            <tr>
                <td><a href="views/Admin/MainPageAdmin.jsp"><img src="img/back.png" height="30px" width="30px"></a></td>
                <td><a href="/admin?action=create"><img src="img/create.png" height="30px" width="30px"></a></td>
                <td><input type="text" name="find"><button type="submit"><img src="/img/find.png" height="30px" width="30px"></button></td>
            </tr>
            </tbody>
        </form>
    </table>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>#</th>
            <th>Username</th>
            <th>Password</th>
            <th>Phone number</th>
            <th>Gmail</th>
            <th>Address</th>
            <th>Type</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${AccountList}" var="account" varStatus="loop">
            <tr>
                <td>${account.id}</td>
                <td>${account.userName}</td>
                <td>${account.password}</td>
                <td>${account.phoneNumber}</td>
                <td>${account.gmail}</td>
                <td>${account.address}</td>
                <td>${account.type}</td>
                <td><a href="/admin?action=edit&index=${loop.index}"><img src="img/edit.png" height="30px" width="30px"></a>
                </td>
                <td><a href="/admin?action=delete&index=${loop.index}"><img src="img/trash.png" height="30px"
                                                                            width="30px"></a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

