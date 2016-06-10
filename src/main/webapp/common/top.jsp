<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!----- start-header-menu---->
<div class="header-bottom">
    <div class="fixed-header fixed">
        <div class="container-fluid" style="background-color: rgba(39, 40, 40, 0.74);">

            <div class="logo">
                <a href="index.html"><h1><span>CHERO</span></h1></a>
            </div>

            <span class="menu"> </span>

            <div class="top-menu">
                <nav class="navigation">
                    <ul class="cl-effect-16">
                        <li><a class="active" href="index.html">首页</a></li>
                        <li><a class="" href="index.html">学院介绍</a></li>
                        <li><a class="" href="index.html">师资力量</a></li>
                        <li><a class="" href="index.html">体能训练</a></li>
                        <li><a class="" href="index.html">预约体验</a></li>
                        <li><a class="" href="index.html">运动商城</a></li>
                        <li><a class="" href="index.html">会员中心</a></li>
                        <li><a href="contact.html">联系我们</a></li>
                    </ul>
                </nav>
            </div>
            <!-- script for menu -->
            <script>
                $("span.menu").click(function () {
                    $(".top-menu").slideToggle("slow", function () {
                        // Animation complete.
                    });
                });
            </script>
            <!-- script for menu -->
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--close-top-Header-menu-->
