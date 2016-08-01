<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Member</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link href="${pageContext.request.contextPath}/css/member/member.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/member/member-info.css" rel="stylesheet">
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
            <li><a href="${pageContext.request.contextPath}/Market/Index">运动商城</a></li>
            <li class="active"><a href="${pageContext.request.contextPath}/MemberCenter/Index">会员中心</a></li>
            <li><a href="${pageContext.request.contextPath}/Contact/Index">联系我们</a></li>
        </ul>
    </nav>
</header>
<!--close-top-Header-menu-->
<div class="container">
    <jsp:include page="../../common/member_left_nav.jsp"></jsp:include>
    <div class="main">
        <div class="member-info">

            <div class="image">
                <img src="${pageContext.request.contextPath}/img/user/user.png">
            </div>

            <div class="info">

                <div class="info-details">
                    <div><span class="memberName">${member.memberName}</span></div>
                    <div>
                        <span class="star"></span>
                        <span>五星会员</span>
                    </div>
                    <div>
                        <span>账户安全：</span>
                        <span class="account-safety"></span>
                        <span><a href="#">提升</a></span>
                    </div>
                    <div><span>实名认证：</span><span>未认证</span></div>
                </div>

                <div class="sub-menu">
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/img/user/no-pay.png" alt="待付款">
                        <span>待付款</span>
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/img/user/no-receive.png" alt="待收货">
                        <span>待收货</span>
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/img/user/no-commet.png" alt="待评价">
                        <span>待评价</span>
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/img/user/query-course.png" alt="课时查询">
                        <span>课时查询</span>
                    </div>
                    <div class="clear"></div>
                </div>
                <dic class="clear"></dic>
            </div>
            <div class="clear"></div>
        </div>
        <div class="member-orders">

        </div>

    </div>
    <div class="clear"></div>
</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
