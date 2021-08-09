<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="models.UserBill" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06/08/2021
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html class="no-js" lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Cart || Asbab - eCommerce HTML5 Template</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Place favicon.ico in the root directory -->
    <link rel="shortcut icon" type="image/x-icon" href="/views/User/images/favicon.png">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">


    <!-- All css files are included here. -->
    <!-- Bootstrap fremwork main css -->
    <link rel="stylesheet" href="/views/User/css/bootstrap.min.css">
    <!-- Owl Carousel min css -->
    <link rel="stylesheet" href="/views/User/css/owl.carousel.min.css">
    <link rel="stylesheet" href="/views/User/css/owl.theme.default.min.css">
    <!-- This core.css file contents all plugings css file. -->
    <link rel="stylesheet" href="/views/User/css/core.css">
    <!-- Theme shortcodes/elements style -->
    <link rel="stylesheet" href="/views/User/css/shortcode/shortcodes.css">
    <!-- Theme main style -->
    <link rel="stylesheet" href="/views/User/style.css">
    <!-- Responsive css -->
    <link rel="stylesheet" href="/views/User/css/responsive.css">
    <!-- User style -->
    <link rel="stylesheet" href="/views/User/css/custom.css">


    <!-- Modernizr JS -->
    <script src="/views/User/js/vendor/modernizr-3.5.0.min.js"></script>
</head>

<body>
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade
    your browser</a> to improve your experience.</p>
<![endif]-->

<!-- Body main wrapper start -->
<div class="wrapper">
    <!-- Start Header Style -->
    <header id="htc__header" class="htc__header__area header--one">
        <!-- Start Mainmenu Area -->
        <div id="sticky-header-with-topbar" class="mainmenu__wrap sticky__header">
            <div class="container">
                <div class="row">
                    <div class="menumenu__container clearfix">
                        <div class="col-lg-2 col-md-2 col-sm-3 col-xs-5">
                            <div class="logo">
                                <a href="index.html"><img src="/img/logoCase.png" alt="logo images"></a>
                            </div>
                        </div>
                        <div class="col-md-7 col-lg-8 col-sm-5 col-xs-3">
                            <nav class="main__menu__nav hidden-xs hidden-sm">
                                <ul class="main__menu">
                                    <li class="drop"><a>Xin Chao ${username}</a></li>
                                    <li class="drop"><a href="/user?action=home">Home</a></li>
                                    <li class="drop"><a href="/views/User/product-grid.jsp">Product</a></li>
                                    <li class="drop"><a href="#">blog</a></li>
                                    <li class="drop">
                                        <a href="#">Account</a>
                                        <ul class="dropdown">
                                            <li><a href="/user?action=showCart&user=${username}">Giỏ hàng</a></li>
                                            <li><a href="/views/User/checkout.jsp">Đổi mật khẩu</a></li>
                                            <li><a href="index.jsp">log out</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </nav>

                            <div class="mobile-menu clearfix visible-xs visible-sm">
                                <nav id="mobile_dropdown">
                                    <ul>
                                        <li><a href="index.html">Home</a></li>
                                        <li><a href="blog.html">blog</a></li>
                                        <li><a href="#">pages</a></li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                        <div class="col-md-3 col-lg-2 col-sm-4 col-xs-4">
                            <div class="header__right">
                                <div class="header__search search search__open">
                                    <a href="#"><i class="icon-magnifier icons"></i></a>
                                </div>
                                <div class="htc__shopping__cart">
                                    <a class="cart__menu" href="#"><i class="icon-handbag icons"></i></a>
                                    <a href="#"><span class="htc__qua">2</span></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="mobile-menu-area"></div>
            </div>
        </div>
        <!-- End Mainmenu Area -->
    </header>
    <!-- End Header Area -->

    <div class="body__overlay"></div>
    <!-- Start Offset Wrapper -->
    <div class="offset__wrapper">
        <!-- Start Search Popap -->
        <div class="search__area">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="search__inner">
                            <form action="#" method="get">
                                <input placeholder="Search here... " type="text">
                                <button type="submit"></button>
                            </form>
                            <div class="search__close__btn">
                                <span class="search__close__btn_icon"><i class="zmdi zmdi-close"></i></span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Search Popap -->
        <!-- Start Cart Panel -->
        <div class="shopping__cart">
            <div class="shopping__cart__inner">
                <div class="offsetmenu__close__btn">
                    <a href="#"><i class="zmdi zmdi-close"></i></a>
                </div>
                <div class="shp__cart__wrap">
                    <div class="shp__single__product">
                        <div class="shp__pro__thumb">
                            <a href="#">
                                <img src="images/product-2/sm-smg/1.jpg" alt="product images">
                            </a>
                        </div>
                        <div class="shp__pro__details">
                            <h2><a href="product-details.html">BO&Play Wireless Speaker</a></h2>
                            <span class="quantity">QTY: 1</span>
                            <span class="shp__price">$105.00</span>
                        </div>
                        <div class="remove__btn">
                            <a href="#" title="Remove this item"><i class="zmdi zmdi-close"></i></a>
                        </div>
                    </div>
                    <div class="shp__single__product">
                        <div class="shp__pro__thumb">
                            <a href="#">
                                <img src="images/product-2/sm-smg/2.jpg" alt="product images">
                            </a>
                        </div>
                        <div class="shp__pro__details">
                            <h2><a href="product-details.html">Brone Candle</a></h2>
                            <span class="quantity">QTY: 1</span>
                            <span class="shp__price">$25.00</span>
                        </div>
                        <div class="remove__btn">
                            <a href="#" title="Remove this item"><i class="zmdi zmdi-close"></i></a>
                        </div>
                    </div>
                </div>
                <ul class="shoping__total">
                    <li class="subtotal">Subtotal:</li>
                    <li class="total__price">$130.00</li>
                </ul>
                <ul class="shopping__btn">
                    <li><a href="cart.html">View Cart</a></li>
                    <li class="shp__checkout"><a href="checkout.html">Checkout</a></li>
                </ul>
            </div>
        </div>
        <!-- End Cart Panel -->
    </div>
    <!-- End Offset Wrapper -->
    <!-- Start Bradcaump area -->
    <div class="ht__bradcaump__area"
         style="background: rgba(0, 0, 0, 0) url(/views/User/images/bg/4.png) no-repeat scroll center center / cover ;">
        <div class="ht__bradcaump__wrap">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="bradcaump__inner">
                            <nav class="bradcaump-inner">
                                <a class="breadcrumb-item" href="/user?action=home" style="color: #ffb0e0">Home</a>
                                <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                <span class="breadcrumb-item active" style="color: #ffb0e0">shopping cart</span>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End Bradcaump area -->
    <!-- cart-main-area start -->
    <div class="cart-main-area ptb--100 bg__white">
        <div class="container">
            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <form action="#">
                        <div class="table-content table-responsive">
                            <table>
                                <thead>
                                <tr>
                                    <th class="product-thumbnail">products</th>
                                    <th class="product-name">name of products</th>
                                    <th class="product-price">Price</th>
                                    <th class="product-quantity">Quantity</th>
                                    <th class="product-subtotal">Total</th>
                                    <th class="product-remove">Remove</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${Cart}" var="cart" varStatus="loop">
                                    <tr>
                                        <td class="product-thumbnail"><a href="#"><img src="${cart.img}" alt="product img"/></a></td>
                                        <td class="product-name"><a href="#">${cart.name}</a></td>
                                        <td class="product-price"><span name="price" class="amount">${cart.price}</span>
                                        </td>
                                        <td class="product-quantity">${cart.soluongmua}</td>
                                        <td class="product-subtotal">${cart.tonggia}.VNĐ</td>
                                        </td>
                                        <td class="product-remove"><a
                                                href="/user?action=delete&id_detail_bill=${cart.id_detail_bill}&index=${loop.index}"><i
                                                class="icon-trash icons"></i></a></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="buttons-cart--inner">
                                    <div class="buttons-cart">
                                        <a href="/user?action=home">Continue Shopping</a>
                                    </div>
                                    <div class="buttons-cart checkout--btn">
                                        <a href="#">update</a>
                                        <a href="#">checkout</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 col-sm-12 col-xs-12">
                                <div class="ht__coupon__code">
                                    <span>enter your discount code</span>
                                    <div class="coupon__box">
                                        <input type="text" placeholder="">
                                        <div class="ht__cp__btn">
                                            <a href="#">enter</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-12 col-xs-12 smt-40 xmt-40">
                                <div class="htc__cart__total">
                                    <h6>cart total</h6>
                                    <div class="cart__desk__list">
                                        <ul class="cart__desc">
                                            <c:forEach items="${Cart}" var="price">
                                                <li>${price.name} x ${price.soluongmua}</li>
                                            </c:forEach>
                                        </ul>
                                        <ul class="cart__price">
                                            <c:forEach items="${Cart}" var="price">
                                                <li id="price">1x-${price.price}</li>
                                            </c:forEach>
                                        </ul>
                                    </div>
                                    <div class="cart__total">
                                        <span>order total</span>
                                        <%
                                            ArrayList<UserBill> list = (ArrayList<UserBill>) request.getAttribute("Cart");
                                            int count_price = 0;
                                            for (int i = 0; i < list.size(); i++) {
                                                count_price += (list.get(i).getPrice() * list.get(i).getSoluongmua());
                                            }
                                            session.setAttribute("count_price", count_price);
                                            System.out.println(count_price);
                                            session.setAttribute("count_price_bill", count_price);
                                        %>
                                        <span><%=count_price%></span>
                                    </div>
                                    <ul class="payment__btn">
                                        <li class="active"><a href="/user?action=createBill&price_bill=${count_price_bill}&id_bill=${id_bill}">payment</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- cart-main-area end -->
</div>
<!-- Body main wrapper end -->

<!-- Placed js at the end of the document so the pages load faster -->

<!-- jquery latest version -->
<script src="js/vendor/jquery-3.2.1.min.js"></script>
<!-- Bootstrap framework js -->
<script src="js/bootstrap.min.js"></script>
<!-- All js plugins included in this file. -->
<script src="js/plugins.js"></script>
<script src="js/slick.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<!-- Waypoints.min.js. -->
<script src="js/waypoints.min.js"></script>
<!-- Main js file that contents all jQuery plugins activation. -->
<script src="js/main.js"></script>

</body>

</html>