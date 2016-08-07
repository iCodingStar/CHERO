<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>首页</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
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
            <li><a href="${pageContext.request.contextPath}/HomePage/Index">首页</a></li>
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
            <li class="active"><a href="${pageContext.request.contextPath}/Contact/Index">联系我们</a></li>
        </ul>
    </nav>
</header>
<!--close-top-Header-menu-->
<div id="bottom" style="background: url('${pageContext.request.contextPath}/img/bottom.jpg')"></div>
<div id="map">
    <div style="width: 100%; height: 600px;" id="allmap"></div>
</div>
<jsp:include page="../../common/footer.jsp"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/map.js"></script>
</body>
</html>