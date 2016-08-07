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
<jsp:include page="../../common/member_header.jsp"></jsp:include>
<!--close-top-Header-menu-->
<div class="container">
    <jsp:include page="../../common/member_left_nav.jsp"></jsp:include>
    <div class="main">

        <div class="header">
            <ul>
                <li class="active"><a href="${pageContext.request.contextPath}/MemberCenter/Info">基本信息</a></li>
                <li><a href="${pageContext.request.contextPath}/MemberCenter/Info/Photo">头像照片</a></li>
                <li><a href="${pageContext.request.contextPath}/MemberCenter/Info/More">更多个人信息</a></li>
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
