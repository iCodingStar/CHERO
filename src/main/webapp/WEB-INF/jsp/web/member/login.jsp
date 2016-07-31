<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>学院介绍</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
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
<div class="user">
    <div><span><img src="${pageContext.request.contextPath}/img/user/p1.png"></span>
        <input class="pic" type="text" name="memberName" placeholder="用户名"></div>
    <div><span><img src="${pageContext.request.contextPath}/img/user/p2.png"></span>
        <input class="pic" type="password" name="password" placeholder="密码"></div>
    <div><input class="vali" type="text" name="">
        <img src="${pageContext.request.contextPath}/img/user/p3.png">
    </div>
    <div><input type="submit" name="login" value="登陆"></div>
    <div>
        <a href="${pageContext.request.contextPath}/MemberCenter/Register/Index"><img
                src="${pageContext.request.contextPath}/img/user/rig.png"></a>
        <a href="#" class="right"><img src="${pageContext.request.contextPath}/img/user/forget.png"></a>
    </div>
</div>
<script>

    $(function () {
        var memberNameElement = $(".user div input[name=memberName]");
        var passwordElement = $(".user div input[name=password]");
        var loginElement = $(".user div input[name=login]");
        loginElement.on('click', function () {
            var memberName = memberNameElement.val().trim();
            var password = passwordElement.val().trim();
            var url = "/MemberCenter/Login/Check";
            var dataType = "json";
            var data = {memberName: memberName, password: password};
            var type = "POST";

            function loginSuccess(result) {
                if (result) {
                    //前往个人中心
                    window.location.href = "/MemberCenter/Index";
                } else {
                    //登陆失败
                    memberNameElement.tips({
                        msg: "用户名或密码不正确",
                        side: 1,
                        time: 3
                    })
                }
            }

            function loginError(result) {
                //登陆失败
                memberNameElement.tips({
                    msg: "系统错误，无法登陆！",
                    side: 1,
                    time: 3
                })
            }

            getData(url, dataType, data, type, loginSuccess, loginError);
        });
    })
    /*异步请求数据并处理返回结果*/
    function getData(url, dataType, data, type, successCallback, errorCallback) {
        $.ajax({
            url: url,
            dataType: dataType,
            data: data,
            type: type,
            success: function (result) {
                successCallback(result);
            },
            error: function (result) {
                errorCallback(result);
            }
        });
    }
</script>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>