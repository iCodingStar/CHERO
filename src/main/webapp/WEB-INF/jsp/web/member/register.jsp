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
        <input class="pic" type="text" name="memberName" placeholder="用户名"
               onblur="checkMemberName()">
    </div>
    <div><span><img src="${pageContext.request.contextPath}/img/user/p4.png"></span>
        <input class="pic" type="email" name="memberEmail" placeholder="邮箱"
               onblur="checkMemberEmail()">
    </div>
    <div><span><img src="${pageContext.request.contextPath}/img/user/p2.png"></span>
        <input class="pic" type="password" name="password" placeholder="密码"
               onblur="checkPassword()">
    </div>
    <div><span><img src="${pageContext.request.contextPath}/img/user/p2.png"></span>
        <input class="pic" type="password" name="confirmPassword" placeholder="再次确认密码"
               onmouseup="checkConfirmPassword()">
    </div>
    <!-- <div><input class="vali" type="text" name=""><img src="img/user/p3.png"></div> -->
    <div><input type="submit" name="" value="确定"></div>
    <div>${error}</div>

    <script>
        var memberNameElement = $(".user div input[name=memberName]");
        var memberEmailElement = $(".user div input[name=memberEmail]");
        var passwordElement = $(".user div input[name=password]");
        var confirmPasswordElement = $(".user div input[name=confirmPassword]");
        var submitElement = $(".user div input[type=submit]");
        $(function () {
            /*禁用提交*/
            $(".user div input[type=submit]").on('click', function () {
                //进一步验证
                if (!checkMemberName()) {
                    memberNameElement.focus();
                }
                if (!checkMemberEmail()) {
                    memberEmailElement.focus();
                }
                if (!checkPassword()) {
                    passwordElement.focus();
                }
                if (!checkConfirmPassword()) {
                    confirmPasswordElement.focus();
                }
                //获取参数
                var memberName = memberNameElement.val();
                var memberEmail = memberEmailElement.val();
                var password = passwordElement.val();

                //注册
                var url = "/MemberCenter/Register/Check";
                var data = {memberName: memberName, memberEmail: memberEmail, password: password};
                var dataType = "json"
                var type = "POST";

                //注册成功后调用函数
                function registerSuccess(result) {
                    console.log(result);
                    if (result == true) {
                        window.location.href = "/MemberCenter/Register/Success";
                    } else {
                        memberNameElement.tips({
                            msg: "注册失败",
                            side: 1,
                            time: 3
                        });
                    }
                }

                //注册失败后调用函数
                function registerError(result) {
                    memberNameElement.tips({
                        msg: "系统问题，注册失败！",
                        side: 1,
                        time: 3
                    });
                }

                /*进行注册*/
                getData(url, dataType, data, type, registerSuccess, registerError);
            })
        });

        /*检查用户名*/
        function checkMemberName() {
            var memberName = memberNameElement.val().trim();
            if (memberName == "") {
                memberNameElement.tips({
                    msg: "用户名为空",
                    side: 2,
                    time: 2
                });
                memberNameElement.focus();
                return false;
            } else if (memberName.match(/^[A-Za-z0-9_]+$/)) {
                var isMemberNameExist = false;
                var requestError = false;
                var url = "/MemberCenter/CheckMemberName";
                var dataType = "json";
                var data = {memberName: memberName};
                var type = "GET";

                function checkMemberNameSuccess(result) {
                    if (!result.data) {
                        memberNameElement.tips({
                            msg: "用户名已存在",
                            side: 2,
                            time: 2
                        });
                        console.log(memberNameElement);
                        memberNameElement.focus();
                    }
                }

                function checkMemberNameError(result) {
                    memberNameElement.tips({
                        msg: "用户名校验失败",
                        side: 2,
                        time: 2
                    });
                    memberNameElement.focus();
                }

                getData(url, dataType, data, type, checkMemberNameSuccess, checkMemberNameError);

                return true;
            } else {
                memberNameElement.tips({
                    msg: "用户名格式不正确",
                    side: 2,
                    time: 2
                });
                memberNameElement.focus();
                return false;
            }
        }
        /*检查Email格式*/
        function checkMemberEmail() {
            var memberEmail = memberEmailElement.val();
            if (memberEmail == "") {
                memberEmailElement.tips({
                    msg: "邮箱为空",
                    side: 2,
                    time: 2
                });
                memberEmailElement.focus();
                return false;
            } else if (memberEmail.match(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+/)) {
                memberEmailElement.val($.trim(memberEmailElement.val()))
                return true;
            } else {
                memberEmailElement.tips({
                    msg: "邮箱格式不正确",
                    side: 2,
                    time: 2
                });
                memberEmailElement.focus();
            }
        }
        /*检查密码*/
        function checkPassword() {
            var password = passwordElement.val();
            if (password == "") {
                passwordElement.tips({
                    msg: "密码为空",
                    side: 2,
                    time: 2
                });
                passwordElement.focus();
                return false;
            } else if (password.match(/[A-Za-z0-9_]+/)) {
                passwordElement.val($.trim(passwordElement.val()))
                return true;
            } else {
                passwordElement.tips({
                    msg: "密码格式不正确",
                    side: 2,
                    time: 2
                });
                passwordElement.focus();
                return false;
            }
        }

        /*确认密码*/
        function checkConfirmPassword() {
            var password = passwordElement.val();
            var confirmPassword = confirmPasswordElement.val();
            if (confirmPassword == "") {
                confirmPasswordElement.tips({
                    msg: "确认密码为空",
                    side: 2,
                    time: 2
                });
                confirmPasswordElement.focus();
                return false;
            } else if (password == confirmPassword.trim()) {
                confirmPasswordElement.val($.trim(confirmPasswordElement.val()))
                if (checkMemberName() && checkMemberEmail() && checkPassword()) {
                    submitElement.attr("disabled", false);
                }
                return true;
            } else {
                confirmPasswordElement.tips({
                    msg: "两次输入密码不一致",
                    side: 2,
                    time: 2
                });
                confirmPasswordElement.focus();
                return false;
            }
        }

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

</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
<jsp:include page="../../common/bottom.jsp"/>
</html>