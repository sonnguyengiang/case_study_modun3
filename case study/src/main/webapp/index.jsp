<%@ page import="java.util.ArrayList" %>
<%@ page import="models.account.Account" %>
<%@ page import="dao.CRUD_Account" %>
<%@ page import="javax.servlet.annotation.WebServlet" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 03/08/2021
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<div class="cotn_principal">
    <div class="cont_centrar">

        <div class="cont_login">
            <div class="cont_info_log_sign_up">
                <div class="col_md_login">
                    <div class="cont_ba_opcitiy">

                        <h2>LOGIN</h2>
                        <p></p>
                        <button class="btn_login" onclick="cambiar_login()">LOGIN</button>
                    </div>
                </div>
                <div class="col_md_sign_up">
                    <div class="cont_ba_opcitiy">
                        <h2>SIGN UP</h2>
                        <p></p>
                        <button class="btn_sign_up" onclick="cambiar_sign_up()">SIGN UP</button>
                    </div>
                </div>
            </div>


            <div class="cont_back_info">
                <div class="cont_img_back_grey">
                    <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
                </div>

            </div>
            <div class="cont_forms" >
                <div class="cont_img_back_">
                    <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
                </div>

                <%--                sign in--%>
                <form action="/login?action=login" method="post">
                    <div class="cont_form_login">
                        <a href="#" onclick="ocultar_login_sign_up()" ><i class="material-icons">&#xE5C4;</i></a>
                        <h2>LOGIN</h2>
                        <c:if test="${err}">
                            <p align="center" style="color: #ef5350">tài khoản hoặc mật khẩu không chính xác</p>
                        </c:if>
                        <input type="text" placeholder="Username or Gmail" name="username" required pattern="[a-zA-Z0-9_].{1,30}"  title="không thể để ô trống: ký tự hợp lệ: _" />
                        <input type="password" placeholder="Password" name="password" required pattern="[a-zA-Z0-9].{1,30}" title="không thể để ô trống" />
                        <button type="submit" class="btn_login" onclick="cambiar_login()">LOGIN</button>
                    </div>
                </form>

                <%--                sign up--%>
                <form action="/login?action=create" method="post">
                    <div class="cont_form_sign_up">
                        <a href="#" onclick="ocultar_login_sign_up()"><i class="material-icons">&#xE5C4;</i></a>
                        <h2>SIGN UP</h2>
                        <c:if test="${CreateErr}">
                            <p align="center" style="color: #ef5350">có dữ liệu bị trùng, nhập lại</p>
                        </c:if>
                        <input type="email" placeholder="Gmail" name="gmail" required/>
                        <input type="text" placeholder="User" name="username" required pattern="[a-zA-Z0-9_].{1,30}" title="không thể để ô trống: ký tự hợp lệ: _" />
                        <input type="password" placeholder="Password" name="password" pattern="[a-zA-Z0-9].{8,30}" title="không thể nhỏ hơn 8 ký tự" required />
                        <input type="text" placeholder="PhoneNumber" name="phonenumber"  pattern="[0]{1}+[0-9]{9}" title="định dạng bắt buộc 0XXXXXXXXX" />
                        <input type="text" placeholder="Address" required name="address" />
                        <button type="submit" class="btn_sign_up" onclick="cambiar_sign_up()">SIGN UP</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
<script>

    /* ------------------------------------ Click on login and Sign Up to  changue and view the effect
---------------------------------------
*/

    function cambiar_login() {
        document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_login";
        document.querySelector('.cont_form_login').style.display = "block";
        document.querySelector('.cont_form_sign_up').style.opacity = "0";

        setTimeout(function(){  document.querySelector('.cont_form_login').style.opacity = "1"; },400);

        setTimeout(function(){
            document.querySelector('.cont_form_sign_up').style.display = "none";
        },200);
    }

    function cambiar_sign_up(at) {
        document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_sign_up";
        document.querySelector('.cont_form_sign_up').style.display = "block";
        document.querySelector('.cont_form_login').style.opacity = "0";

        setTimeout(function(){  document.querySelector('.cont_form_sign_up').style.opacity = "1";
        },100);

        setTimeout(function(){   document.querySelector('.cont_form_login').style.display = "none";
        },400);


    }



    function ocultar_login_sign_up() {

        document.querySelector('.cont_forms').className = "cont_forms";
        document.querySelector('.cont_form_sign_up').style.opacity = "0";
        document.querySelector('.cont_form_login').style.opacity = "0";

        setTimeout(function(){
            document.querySelector('.cont_form_sign_up').style.display = "none";
            document.querySelector('.cont_form_login').style.display = "none";
        },500);

    }


</script>
