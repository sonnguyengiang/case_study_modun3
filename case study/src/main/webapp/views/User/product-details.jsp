<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06/08/2021
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="no-js" lang="zxx">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Product Details</title>
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
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
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
                                <a href="index.html"><img src="https://i.imgur.com/KwFhYNO.png" alt="logo images" alt="logo images"></a>
                            </div>
                        </div>
                        <div class="col-md-7 col-lg-8 col-sm-5 col-xs-3">
                            <nav class="main__menu__nav hidden-xs hidden-sm">
                                <ul class="main__menu">
                                    <li class="drop"><a href="/user?action=home">Home</a></li>

                                    <li class="drop"><a href="/views/User/product-grid.jsp">Product</a>
                                    </li>
                                    </li>
                                    <li class="drop"><a href="https://www.facebook.com/Ducdv.dev.null">Pages</a>
                                    </li>
                                    <li class="drop">
                                        <a href="#">Account</a>
                                        <ul class="dropdown">
                                            <li><a href="index.jsp">log out</a></li>
                                            <li><a href="product-details.html">For woman</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </nav>

                            <div class="mobile-menu clearfix visible-xs visible-sm">
                                <nav id="mobile_dropdown">
                                    <ul>
                                        <li><a href="/user?action=home">Home</a></li>
                                        <li><a href="blog.html">blog</a></li>
                                        <li><a href="#">pages</a>
                                            <ul>
                                                <li><a href="blog.html">Blog</a></li>
                                                <li><a href="blog-details.html">Blog Details</a></li>
                                                <li><a href="cart.html">Cart page</a></li>
                                                <li><a href="checkout.html">checkout</a></li>
                                                <li><a href="contact.jsp">contact</a></li>
                                                <li><a href="product-grid.html">product grid</a></li>
                                                <li><a href="product-details.html">product details</a></li>
                                                <li><a href="wishlist.html">wishlist</a></li>
                                            </ul>
                                        </li>
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
            <div class="container" >
                <div class="row" >
                    <div class="col-md-12" >
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
    <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(images/bg/4.png) no-repeat scroll center center / cover ;">
        <div class="ht__bradcaump__wrap">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="bradcaump__inner">
                            <nav class="bradcaump-inner">
                                <a class="breadcrumb-item" href="index.html">Home</a>
                                <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                <a class="breadcrumb-item" href="product-grid.html">Products</a>
                                <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                <span class="breadcrumb-item active">${productListView.loaisp}</span>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End Bradcaump area -->
    <!-- Start Product Details Area -->
    <section class="htc__product__details bg__white ptb--100">


        <!-- Start Product Details Top -->
        <div class="htc__product__details__top">
            <div class="container">
                <div class="row">
                    <div class="col-md-5 col-lg-5 col-sm-12 col-xs-12">
                        <div class="htc__product__details__tab__content">
                            <!-- Start Product Big Images -->
                            <div class="product__big__images">
                                <div class="portfolio-full-image tab-content">
                                    <div role="tabpanel" class="tab-pane fade in active" id="img-tab-1">
                                        <img src="${productListView.img}" alt="full-image">
                                    </div>
                                </div>
                            </div>
                            <!-- End Product Big Images -->
                        </div>
                    </div>
                    <div class="col-md-7 col-lg-7 col-sm-12 col-xs-12 smt-40 xmt-40">
                        <div class="ht__product__dtl">
                            <h2>${productListView.name}</h2>
                            <ul  class="pro__prize">
                                <li>Giá: ${productListView.price}.VNĐ</li>
                            </ul>
                            <div class="ht__pro__desc">
                                <div class="sin__desc">
                                    <p><span>Availability:</span> In Stock</p>
                                </div>
                                <div class="sin__desc align--left">
                                    <p><span>color:</span></p>
                                    <ul class="pro__color">
                                        <li class="${productListView.color}"><a href="#">${productListView.color}</a></li>
                                    </ul>
                                </div>
                                <div class="sin__desc align--left">
                                    <p><span>Product tags:</span></p>
                                    <ul class="pro__cat__list">
                                        <li><a href="#">${productListView.loaisp}</a></li>
                                    </ul>
                                </div>
                                <div class="sin__desc align--left">
                                    <p><span>Số lượng: </span></p>
                                    <ul class="pro__cat__list">
                                        <li><a href="#">${productListView.soluong}</a></li>
                                    </ul>
                                </div>
                                <div class="sin__desc align--left">
                                    <p><span>số lượng</span></p>
                                    <form action="/user?action=addProduct&index=${productListView.id}&price=${productListView.price}&id_user=${iduser}" method="post">
                                        <input type="number" name="number">
                                        <div class="pro__more__btn">
                                            <button type="submit">thêm vào giỏ hàng</button>
                                        </div>
                                    </form>
                                </div><br>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Product Details Top -->
    </section>
    <!-- End Product Details Area -->
    <!-- Start Product Description -->
    <section class="htc__produc__decription bg__white">
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <!-- Start List And Grid View -->
                    <ul class="pro__details__tab" role="tablist">
                        <li role="presentation" class="description active"><a href="#description" role="tab" data-toggle="tab">description</a></li>
                        <li role="presentation" class="review"><a href="#review" role="tab" data-toggle="tab">review</a></li>
                        <li role="presentation" class="shipping"><a href="#shipping" role="tab" data-toggle="tab">shipping</a></li>
                    </ul>
                    <!-- End List And Grid View -->
                </div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <div class="ht__pro__details__content">
                        <!-- Start Single Content -->
                        <div role="tabpanel" id="description" class="pro__single__content tab-pane fade in active">
                            <div class="pro__tab__content__inner">
                                <p>Formfitting clothing is all about a sweet spot. That elusive place where an item is tight but not clingy, sexy but not cloying, cool but not over the top. Alexandra Alvarez’s label, Alix, hits that mark with its range of comfortable, minimal, and neutral-hued bodysuits.</p>
                                <h4 class="ht__pro__title">Description</h4>
                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem</p>
                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>
                                <h4 class="ht__pro__title">Standard Featured</h4>
                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in</p>
                            </div>
                        </div>
                        <!-- End Single Content -->
                        <!-- Start Single Content -->
                        <div role="tabpanel" id="review" class="pro__single__content tab-pane fade">
                            <div class="pro__tab__content__inner">
                                <p>Formfitting clothing is all about a sweet spot. That elusive place where an item is tight but not clingy, sexy but not cloying, cool but not over the top. Alexandra Alvarez’s label, Alix, hits that mark with its range of comfortable, minimal, and neutral-hued bodysuits.</p>
                                <h4 class="ht__pro__title">Description</h4>
                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem</p>
                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>
                                <h4 class="ht__pro__title">Standard Featured</h4>
                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem</p>
                            </div>
                        </div>
                        <!-- End Single Content -->
                        <!-- Start Single Content -->
                        <div role="tabpanel" id="shipping" class="pro__single__content tab-pane fade">
                            <div class="pro__tab__content__inner">
                                <p>Formfitting clothing is all about a sweet spot. That elusive place where an item is tight but not clingy, sexy but not cloying, cool but not over the top. Alexandra Alvarez’s label, Alix, hits that mark with its range of comfortable, minimal, and neutral-hued bodysuits.</p>
                                <h4 class="ht__pro__title">Description</h4>
                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem</p>
                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>
                                <h4 class="ht__pro__title">Standard Featured</h4>
                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem</p>
                            </div>
                        </div>
                        <!-- End Single Content -->
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- End Product Description -->
    <!-- Start Product Area -->

</div>
<!-- Body main wrapper end -->

<!-- Placed js at the end of the document so the pages load faster -->

<!-- jquery latest version -->
<script src="/views/User/js/vendor/jquery-3.2.1.min.js"></script>
<!-- Bootstrap framework js -->
<script src="/views/User/js/bootstrap.min.js"></script>
<!-- All js plugins included in this file. -->
<script src="/views/User/js/plugins.js"></script>
<script src="/views/User/js/slick.min.js"></script>
<script src="/views/User/js/owl.carousel.min.js"></script>
<!-- Waypoints.min.js. -->
<script src="/views/User/js/waypoints.min.js"></script>
<!-- Main js file that contents all jQuery plugins activation. -->
<script src="/views/User/js/main.js"></script>

</body>

</html>