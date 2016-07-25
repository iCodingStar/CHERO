<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>学院介绍</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
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
            <li class="active"><a href="${pageContext.request.contextPath}/Academy/Index">学院介绍</a></li>
            <li><a href="${pageContext.request.contextPath}/Trainer/Index">师资力量</a></li>
            <li><a href="${pageContext.request.contextPath}/Training/Index">体能训练</a></li>
            <li><a href="${pageContext.request.contextPath}/Experience/Index">预约体验</a></li>
            <li><a href="${pageContext.request.contextPath}/Market/Index">运动商城</a></li>
            <li><a href="${pageContext.request.contextPath}/MemberCenter/Index">会员中心</a></li>
            <li><a href="${pageContext.request.contextPath}/Contact/Index">联系我们</a></li>
        </ul>
    </nav>
</header>
<!--close-top-Header-menu-->

<div class="content">
    <img src="../../../img/back.jpg" alt="主图" class="back">
    <div class="college">
        <img src="../../../img/college.png" alt="学院介绍" id="college">
    </div>
    <div class="word">
        <img src="../../../img/word.png" alt="详细介绍" id="word">
    </div>

</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>