<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>体能训练</title>
    <meta charset="UTF-8">
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/master1.css" media="screen" title="no title"
          charset="utf-8">
</head>
<body>
<!--top-Header-menu-->
<header id="header">
    <!--<div class="logo">-->
    <img src="${pageContext.request.contextPath}/img/logo.png" alt="logo" class="logo">
    <!--</div>-->
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/HomePage/Index">首页</a></li>
            <li><a href="${pageContext.request.contextPath}/Academy/Index">学院介绍</a></li>
            <li><a href="${pageContext.request.contextPath}/Trainer/Index">师资力量</a></li>
            <li><a  class="active" href="${pageContext.request.contextPath}/Training/Index">体能训练</a>
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
<div class="content">

    <div id="article" class="title"><b></b><span>相关文章</span><b></b></div>

    <div class="card">
        <img src="${pageContext.request.contextPath}/img/1.jpg" alt="" class="card-pic"><a href="${pageContext.request.contextPath}/Training/Article"><div class="card-text">
        <h1>暑假“72变”集训</h1>
        <p style="color: white;">20天，夏练三伏，每节课程2小时，在时间范围内勇猛提高技术，让孩子在技术上、体能上心理上得到综合的进步</p>
    </div>
    </a>
        <br>
        <a href="${pageContext.request.contextPath}/Training/Article"><div class="card-text">
            <h1>暑假“72变”集训</h1>
            <p style="color: white;">20天，夏练三伏，每节课程2小时，在时间范围内勇猛提高技术，让孩子在技术上、体能上心理上得到综合的进步</p>
        </div><!--
        --><img src="${pageContext.request.contextPath}/img/2.jpg" alt="" class="card-pic">
            <br>
            <a href="${pageContext.request.contextPath}/Training/Article">
                <img src="${pageContext.request.contextPath}/img/3.jpg" alt="" class="card-pic"></a><!--
        --><div class="card-text">
                <h1>暑假“72变”集训</h1>
                <p style="color: white;">20天，夏练三伏，每节课程2小时，在时间范围内勇猛提高技术，让孩子在技术上、体能上心理上得到综合的进步</p>
            </div></a>
    </div>

    <div id="video" class="title"><b></b><span>相关视频</span><b></b></div>

    <div class="card">
        <img src="${pageContext.request.contextPath}/img/1.jpg" alt="" class="card-pic"><!--
        --><a href="${pageContext.request.contextPath}/Training/Article"><div class="card-text">
        <h1>暑假“72变”集训</h1>
        <p style="color: white;">20天，夏练三伏，每节课程2小时，在时间范围内勇猛提高技术，让孩子在技术上、体能上心理上得到综合的进步</p>
    </div></a>
        <br>
        <a href="${pageContext.request.contextPath}/Training/Article"><div class="card-text">
            <h1>暑假“72变”集训</h1>
            <p style="color: white;">20天，夏练三伏，每节课程2小时，在时间范围内勇猛提高技术，让孩子在技术上、体能上心理上得到综合的进步</p>
        </div><!--
        --><img src="${pageContext.request.contextPath}/img/2.jpg" alt="" class="card-pic">
            <br>
            <a href="${pageContext.request.contextPath}/Training/Article">
                <img src="${pageContext.request.contextPath}/img/3.jpg" alt="" class="card-pic"></a><!--
        --><div class="card-text">
                <h1>暑假“72变”集训</h1>
                <p style="color: white;">20天，夏练三伏，每节课程2小时，在时间范围内勇猛提高技术，让孩子在技术上、体能上心理上得到综合的进步</p>
            </div></a>
    </div>
</div>
<jsp:include page="../../common/footer.jsp"></jsp:include>
</body>
</html>