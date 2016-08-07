<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>首页</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/slider.css">
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
    <script src="http://api.map.baidu.com/api?v=2.0&ak=67jMQ5DmYTe1TLMBKFUTcZAR"></script>
</head>
<body>
<!--top-Header-menu-->
<header id="header">
    <!--<div class="logo">-->
    <img src="${pageContext.request.contextPath}/img/logo.png" alt="logo" class="logo">
    <!--</div>-->
    <nav>
        <ul>
            <li class="active"><a href="${pageContext.request.contextPath}/HomePage/Index">首页</a></li>
            <li><a href="${pageContext.request.contextPath}/Academy/Index">学院介绍</a></li>
            <li><a href="${pageContext.request.contextPath}/Trainer/Index">师资力量</a></li>
            <li><a href="${pageContext.request.contextPath}/Training/Index">体能训练</a>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/Training/Index?#article">相关文章</a></li>
                    <li><a href="${pageContext.request.contextPath}/Training/Index?#video">相关视频</a></li>
                </ul>
            </li>
            <li><a href="${pageContext.request.contextPath}/Experience/Index">预约体验</a></li>
            <li><a href="${pageContext.request.contextPath}/Market/Index">运动商城</a></li>
            <li><a href="${pageContext.request.contextPath}/MemberCenter/Index">会员中心</a></li>
            <li><a href="${pageContext.request.contextPath}/Contact/Index">联系我们</a></li>
        </ul>
    </nav>
</header>
<!--close-top-Header-menu-->
<div class="slider" id="slider">
    <div class="slider-inner">
        <div class="item">
            <img class="img" src="${pageContext.request.contextPath}/img/slide1.jpg">
        </div>
        <div class="item">
            <img class="img" src="${pageContext.request.contextPath}/img/slide2.jpg">
        </div>
    </div>
</div>

<div id="b-teacher" style="background: url('${pageContext.request.contextPath}/img/1-teacher.jpg')">
    <div id="teacher" class="middle">
        <a href="${pageContext.request.contextPath}/Trainer/Index"><img
                src="${pageContext.request.contextPath}/img/1t3.jpg"></a>
        <img src="${pageContext.request.contextPath}/img/1t1.jpg">
        <img src="${pageContext.request.contextPath}/img/1t2.jpg">
    </div>
</div>


<div id="b-more" style="background: url('${pageContext.request.contextPath}/img/1-class.jpg')">
    <h2>课程介绍<span class="item-english">Course introduction</span></h2>
    <div id="b-course">

        <div class="course">
            <a href="${pageContext.request.contextPath}/Market/Index?#badminton"><img
                    src="${pageContext.request.contextPath}/img/d1.jpg"></a>
            <h3>羽毛球<span>badminton</span></h3>
            <span class="red"></span>
            <div>
                <span><a href="${pageContext.request.contextPath}/Market/Index?#badminton">more</a></span>
            </div>
        </div>

        <div class="course">
            <a href="${pageContext.request.contextPath}/Market/Index?#outdoor-sport"><img
                    src="${pageContext.request.contextPath}/img/d2.jpg"></a>
            <h3>户外运动<span>outdoor sport</span></h3>
            <span class="red"></span>
            <div>
                <span><a href="${pageContext.request.contextPath}/Market/Index?#outdoor-sport">more</a></span>
            </div>
        </div>

    </div>

    <h2>体能训练<span class="item-english">Physical training</span></h2>

    <div id="article" class="middle">
        <a href="${pageContext.request.contextPath}/Training/Index?#article"><img
                src="${pageContext.request.contextPath}/img/b-article.jpg"></a>
        <img src="${pageContext.request.contextPath}/img/article.jpg">
    </div>

    <div id="video" class="middle">
        <img src="${pageContext.request.contextPath}/img/video.jpg">
        <a href="${pageContext.request.contextPath}/Training/Index?#video"><img
                src="${pageContext.request.contextPath}/img/b-video.jpg"></a>
    </div>

</div>

<div id="bottom" style="background: url('${pageContext.request.contextPath}/img/bottom.jpg')"></div>
<div id="map">
    <div style="width: 100%; height: 600px;" id="allmap"></div>
</div>
<jsp:include page="../../common/footer.jsp"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/map.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/slider.js"></script>
</body>
</html>