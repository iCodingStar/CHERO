<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Home</title>
    <jsp:include page="common/head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="common/top-nav.jsp"></jsp:include>
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
    <jsp:include page="common/footer.jsp"></jsp:include>
</div>

<jsp:include page="common/bottom.jsp"></jsp:include>
</body>
</html>