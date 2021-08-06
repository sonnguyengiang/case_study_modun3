<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 05/08/2021
  Time: 17:33
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
    <h2>Edit Account</h2>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Id</th>
            <th>Username</th>
            <th>Password</th>
            <th>Phone number</th>
            <th>Gmail</th>
            <th>Address</th>
            <th>Type</th>
            <th>Edit</th>
        </tr>
        </thead>
        <form method="post">
            <tbody>
            <tr>
                <td><input type="text" name="id" value="${accountEdit.id}" readonly></td>
                <td><input type="text" name="username" value="${accountEdit.userName}"></td>
                <td><input type="text" name="password" value="${accountEdit.password}"></td>
                <td><input type="text" name="gmail" value="${accountEdit.gmail}"></td>
                <td><input type="text" name="phonenumber" value="${accountEdit.phoneNumber}"></td>
                <td><input type="text" name="address" value="${accountEdit.address}"></td>
                <td>
                    <select name="type">
                        <option value="USER">User</option>
                        <option value="ADMIN">Admin</option>
                    </select>
                </td>
                <td>
                    <button type="submit"><img src="/img/edit.png" alt="" width="30px" height="30px"></button>
                </td>
            </tr>
            </tbody>
        </form>
    </table>
    <a href="/admin"><img src="img/back.png" height="30px" width="30px"></a>
</div>
</body>
</html>


