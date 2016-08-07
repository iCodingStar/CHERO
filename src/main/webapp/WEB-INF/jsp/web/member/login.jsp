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
<jsp:include page="../../common/member_header.jsp"></jsp:include>
<!--close-top-Header-menu-->
<div class="user">
    <div><span><img src="${pageContext.request.contextPath}/img/member_center/p1.png"></span>
        <input class="pic" type="text" name="memberName" placeholder="用户名"></div>
    <div><span><img src="${pageContext.request.contextPath}/img/member_center/p2.png"></span>
        <input class="pic" type="password" name="password" placeholder="密码"></div>
    <div><input class="vali" type="text" name="">
        <img src="${pageContext.request.contextPath}/img/member_center/p3.png">
    </div>
    <div><input type="submit" name="login" value="登陆"></div>
    <div>
        <a href="${pageContext.request.contextPath}/MemberCenter/Register/Index"><img
                src="${pageContext.request.contextPath}/img/member_center/rig.png"></a>
        <a href="#" class="right"><img src="${pageContext.request.contextPath}/img/member_center/forget.png"></a>
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