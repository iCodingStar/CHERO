<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="${pageContext.request.contextPath}/libs/bootstrap/css/bootstrap.css" rel='stylesheet' type='text/css'/>

    <!-- Custom Theme files -->
    <link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet'/>
    <!--fullpage css-->
    <link href="${pageContext.request.contextPath}/css/jquery.fullpage.min.css" rel="stylesheet">
    <!--jQuery-->
    <script src="${pageContext.request.contextPath}/libs/js/jquery/jquery.min.js"></script>
    <!--jquery fullpage-->
    <script src="${pageContext.request.contextPath}/libs/js/jquery.fullpage.min.js"></script>
    <script>
        $(function () {
            $("#fullpage").fullpage({
                resize: true,
                scrollingSpeed: 1000,
                anchors: ['page-banner', 'page-trainers', 'page-courses', 'page-training', 'page-contact'],
                loopTop: true,
                loopBottom: true,
                loopHorizontal: false,
                scrollBar: true,
                navigation: true,
                navigationPosition: 'right',
                navigationTooltips: ['banner', 'trainers', 'courses', 'training', 'contact'],
                showActiveTooltip: true,
                slidesNavigation: true,
                slidesNavPosition: 'top'
            });
        })
    </script>
</head>
<body>

<!----- start-header---->
<div class="header fixed">
    <div class="container">

        <div class="logo">
            <a href="index.jsp"><h1><span></span></h1></a>
        </div>

        <span class="menu"> </span>

        <div class="top-menu">
            <nav class="navigation">
                <ul class="cl-effect-16">
                    <li><a class="active" href="index.jsp">首页</a></li>
                    <li><a class="" href="index.jsp">学院介绍</a></li>
                    <li><a class="" href="index.jsp">师资力量</a></li>
                    <li><a class="" href="index.jsp">体能训练</a></li>
                    <li><a class="" href="index.jsp">预约体验</a></li>
                    <li><a class="" href="index.jsp">运动商城</a></li>
                    <li><a class="" href="index.jsp">会员中心</a></li>
                    <li><a href="index.jsp">联系我们</a></li>
                </ul>
            </nav>
        </div>

        <!-- script for menu -->
        <script>
            $("span.menu").click(function () {
                $(".top-menu").slideToggle("slow", function () {

                });
            });
        </script>
        <!-- script for menu -->

        <div class="clearfix"></div>
    </div>
</div>

<div id="fullpage">
    <div class="section">
        <div class="banner" id="home">
            <div class="slide">
                <img src="images/slide1.jpg" alt="img01"/>
            </div>
            <div class="slide">
                <img src="images/slide2.jpg" alt="img02"/>
            </div>
        </div>
    </div>
    <%--<link rel="stylesheet" type="text/css" href="css/component.css"/>--%>
    <%--<script src="js/modernizr.custom.js"></script>--%>
    <%--<script src="js/jquery.cbpFWSlider.js"></script>--%>

    <!--tainers-section-->
    <div class="section">
        <div class="trainers-section">
            <div class="container">
                <div class="trainers">
                    <div class="trainer-description"><img src="images/trainer-description.jpg"></div>
                    <div class="trainer-second"><img src="images/trainer-second.jpg"></div>
                    <div class="trainer-first"><img src="images/trainer-first.jpg"></div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
    </div>

    <!--classes-start-->
    <div class="section">
        <div class="clases-section">
            <div class="container">
                <h3>精品课程</h3>
                <div class="class-grids">
                    <div class="col-md-6 class-grid wow zoomInLeft animated">
                        <img src="images/course-badmiton.jpg" class="img-responsive" alt=""/>
                        <div class="bottom-color">
                            <h4>羽毛球 </h4>
                            <p>badmiton</p>
                        </div>
                        <div class="class-bottom">
                            <div class="col-md-6 class-time ">
                                <ul class="time">
                                    <li><i class="sun"> </i><span>Sunday October 14 </span></li>
                                    <li><i class="time"></i><span>12:30PM</span></li>
                                    <div class="clearfix"></div>
                                </ul>
                            </div>
                            <div class="col-md-6 class-text">
                                <div class="single-one"><span><a href="#"><i class="com"> </i>20l</a></span></div>
                                <div class="single-one"><span><a href="#"><i class="four"> </i>400</a></span></div>
                            </div>
                            <div class="clearfix"></div>
                            <a class="button" href="temp/single.html"><img src="images/read.png" class="img-responsive"
                                                                           alt=""/></a>
                        </div>
                    </div>

                    <div class="col-md-6 class-grid wow zoomInRight animated">
                        <img src="images/course-outdoor.jpg" class="img-responsive" alt=""/>
                        <div class="bottom-color">
                            <h4>户外运动</h4>
                            <p>outdoor</p>
                        </div>
                        <div class="class-bottom">
                            <div class="col-md-6 class-time">
                                <ul class="time">
                                    <li><i class="sun"> </i><span>Sunday October 14 </span></li>
                                    <li><i class="time"></i><span>12:30PM</span></li>
                                    <div class="clearfix"></div>
                                </ul>
                            </div>
                            <div class="col-md-6 class-text">
                                <div class="single-one"><span><a href="#"><i class="com"> </i>20l</a></span></div>
                                <div class="single-one"><span><a href="#"><i class="four"> </i>400</a></span></div>
                            </div>
                            <div class="clearfix"></div>
                            <a class="button" href="temp/single.html"><img src="images/read.png" class="img-responsive"
                                                                           alt=""/></a>
                        </div>
                    </div>

                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
    </div>
    <!--classes-end-->

    <!--start-training-->
    <div class="section">
        <div class="training-section">
            <div class="container">
                <h3>体能训练</h3>
                <div class="class-grids">

                    <div class="col-md-6 class-grid wow zoomInLeft animated">
                        <img src="images/training-articles.jpg" class="img-responsive" alt=""/>

                    </div>

                    <div class="col-md-6 class-grid wow zoomInRight animated">
                        <img src="images/training-articles-img.jpg" class="img-responsive" alt=""/>

                    </div>

                    <div class="col-md-6 class-grid wow zoomInRight animated">
                        <img src="images/training-videos-img.jpg" class="img-responsive" alt=""/>
                    </div>

                    <div class="col-md-6 class-grid wow zoomInLeft animated">
                        <img src="images/training-videos.jpg" class="img-responsive" alt=""/>

                    </div>

                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
    </div>
    <!--training-end-->

    <!----footer--->
    <div class="section footer">
        <div class="container-fluid">
            <div class="contact">
                <div class="row top-line">
                    <div class="col-lg-12">
                        <hr>
                    </div>
                </div>

                <div class="row middle-line">
                    <span>电话：027-87771666</span>
                </div>

                <div class="row middle-line">
                    <span>邮箱：c-hero@c-hero.cn</span>
                </div>

                <div class="row middle-line">
                    <span>地址：湖北省武汉市洪山区邮科院体育中心/中国地质大学（武汉）北区体育馆</span>
                </div>

                <div class="row bottom-line">
                    <div class="col-lg-12">
                        <hr>
                    </div>
                </div>
            </div>

            <div class="copy">
                <p>Copyright &copy; 2016.All Rights Reserved <a href="http://blog.codingstar.cn/" target="_blank"
                                                                title="iCodingStar">iCodingStar</a></p>
            </div>
        </div>
    </div>
</div>
</body>
</html>