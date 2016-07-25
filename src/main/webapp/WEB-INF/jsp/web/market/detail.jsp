<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>学院介绍</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link href="${pageContext.request.contextPath}/css/school.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/detail.css">
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
            <li><a href="${pageContext.request.contextPath}/Training/Index">体能训练</a></li>
            <li><a href="${pageContext.request.contextPath}/Experience/Index">预约体验</a></li>
            <li class="active"><a href="${pageContext.request.contextPath}/Market/Index">运动商城</a></li>
            <li><a href="${pageContext.request.contextPath}/MemberCenter/Index">会员中心</a></li>
            <li><a href="${pageContext.request.contextPath}/Contact/Index">联系我们</a></li>
        </ul>
    </nav>
</header>
<!--close-top-Header-menu-->
<div id="summer-class">
    <div>
        <div class="class-pic"><img src="../../../img/d1.jpg"></div>
        <div class="class-detail">
            <h1>暑假“72变”集训</h1>
            <p>20天，夏练三伏，每节课程2小时，在时间范围内勇猛提高技术，让孩子在技术上，体能上，心理上得到综合的进步。</p>
            <p class="time">报名时间：6 月 1 日 - 6 月 28 日</p>
            <div class="btn-course">
                <label for="course">选择课程</label>
                <!--<span>一、三期课程</span><input type="radio" name="course">
                <span>二期课程</span><input type="radio" name="course">
                <span>组合课程</span><input type="radio" name="course">

                -->
                <ul>
                    <!-- 点击添加类actived后，显示效果，请自行定义到js中 -->
                    <li class="actived"><a href="">一、三期课程</a></li>
                    <li><a href="">二期课程</a></li>
                    <li><a href="">组合课程</a></li>
                </ul>
            </div>
            <input id="buy" type="button" name="course" value="立即购买">
            <span>交易成功:300</span>
            <span>累计评论:300</span>
        </div>
    </div>
    <div class="more-detail">
        <p>20节课</p>
        <p>1980元</p>
    </div>
</div>

<div style="background: url('../../../img/detail/d-02.jpg'); height:4000px;">
</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>