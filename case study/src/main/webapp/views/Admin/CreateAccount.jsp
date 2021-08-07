<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 05/08/2021
  Time: 15:32
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
    <h2>Create Account</h2>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Username</th>
            <th>Password</th>
            <th>Phone number</th>
            <th>Gmail</th>
            <th>Address</th>
            <th>Type</th>
            <th>create</th>
        </tr>
        </thead>
        <form action="/admin?action=create" method="post">
            <tbody>
            <tr>
                <td><input type="text" name="username"></td>
                <td><input type="text" name="password"></td>
                <td><input type="text" name="phonenumber"></td>
                <td><input type="text" name="gmail"></td>
                <td><input type="text" name="address"></td>
                <td>
                    <select name="type">
                        <option value="USER">User</option>
                        <option value="ADMIN">Admin</option>
                    </select>
                </td>
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


