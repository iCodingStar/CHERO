<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Member</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link href="${pageContext.request.contextPath}/css/member/member.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/member/info.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/lib/laydate/laydate.js"></script>
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

        <div class="header">
            <ul>
                <li class="active"><a href="#">基本信息</a></li>
                <li><a href="#">头像照片</a></li>
                <li><a href="#">更多个人信息</a></li>
            </ul>
        </div>

        <div class="content">

            <div class="basic-info">
                <form action="#">
                    <div class="memberName">用户名：<span>${member.memberName}</span></div>
                    <div class="memberName">
                        姓名：<input type="text" name="memberName" placeholder="${member.memberName}">
                    </div>
                    <div class="memberNickName">
                        昵称：<input type="text" name="memberNickName" placeholder="${member.memberNickname}">
                    </div>
                    <div class="sex">
                        性别：<span><input type="radio" name="sex" checked>男</span>
                        <span><input type="radio" name="sex">女</span>
                        <span> <input type="radio" name="sex">保密</span>
                    </div>
                    <div class="memberBirthday">
                        生日：<input class="laydate-icon" name="memberBirthday" onclick="laydate()" placeholder="">
                    </div>
                    <div class="memberEmail">
                        邮箱：<input type="email" name="memberEmail" placeholder="${member.memberEmail}">
                    </div>
                    <div class="submit">
                        <input type="submit" value="提交" >
                    </div>
                </form>
            </div>

            <div class="member-info">

                <div class="image">
                    <img src="${pageContext.request.contextPath}/img/member_center/meber/member.png">
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

                </div>

                <div class="clear"></div>

            </div>

            <div class="clear"></div>

        </div>
    </div>
    <div class="clear"></div>
</div>
<jsp:include page="../../common/footer.jsp"/>
<script>
    $(function () {
        laydate.skin('dahong');
    })
</script>
</body>
</html>
