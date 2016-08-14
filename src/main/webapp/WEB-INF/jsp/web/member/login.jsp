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
<div class="user popup">
    <div>
        <span><img src="${pageContext.request.contextPath}/img/member_center/p1.png"></span>
        <input name="memberName" style="display: none">
        <input class="pic" type="text" id="memberName" name="memberName" placeholder="用户名" onblur="checkMemberName()">
    </div>

    <div>
        <span><img src="${pageContext.request.contextPath}/img/member_center/p2.png"></span>
        <input class="pic" type="password" id="password" name="password" placeholder="密码" onblur="checkPassword()">
    </div>

    <%--<div>--%>
        <%--<input class="vali" type="text" name="">--%>
        <%--<img src="${pageContext.request.contextPath}/img/member_center/p3.png">--%>
    <%--</div>--%>

    <div>
        <input class="popup-submit" id="popup-submit" type="submit" name="login" value="登陆">
    </div>

    <!--忘记密码或者注册账号-->
    <div>
        <a href="${pageContext.request.contextPath}/MemberCenter/Register/Index"><img
                src="${pageContext.request.contextPath}/img/member_center/rig.png"></a>
        <a href="${pageContext.request.contextPath}/MemberCenter/Find/Password" class="right"><img src="${pageContext.request.contextPath}/img/member_center/forget.png"></a>
    </div>

    <div id="popup-captcha"></div>
</div>

<!-- 引入封装了failback的接口--initGeetest -->
<script src="http://static.geetest.com/static/tools/gt.js"></script>

<script>

    function checkMemberName() {
        var memberNameElement = $("#memberName");
        var memberName = memberNameElement.val().trim();
        if (memberName == ""){
            memberNameElement.focus();
            memberNameElement.tips({
                msg: "用户名不能为空",
                side: 1,
                time: 3
            });
            return false;
        }
        return true;
    }

    function checkPassword() {
        var passwordElement = $("#password");
        var password = passwordElement.val().trim();
        passwordElement.focus();
        if (password=""){
            passwordElement.tips({
                msg: "密码不能为空",
                side: 1,
                time: 3
            });
            return false;
        }
        return true;
    }

    var handlerPopup = function (captchaObj) {

        $("#popup-submit").click(function () {
            var memberNameElement = $("#memberName");
            var passwordElement = $("#password");

            var memberName = memberNameElement.val().trim();
            var password = passwordElement.val().trim();

            var validate = captchaObj.getValidate();

            if (!validate) {
                //登陆失败
                memberNameElement.tips({
                    msg: "请先完成验证！",
                    side: 1,
                    time: 3
                })
                return;
            }

            $.ajax({
                url: "/VerifyCode/VerifySecCode", // 进行二次验证
                type: "post",
                dataType: "json",
                data: {
                    // 二次验证所需的三个值
                    geetest_challenge: validate.geetest_challenge,
                    geetest_validate: validate.geetest_validate,
                    geetest_seccode: validate.geetest_seccode
                },
                success: function (data) {
                    /*登陆*/
                    if (data && (data.status === "success")) {
                        var url = "/MemberCenter/Login/Check";
                        var dataType = "json";
                        var data = {memberName: memberName, password: password};
                        var type = "POST";

                        /*登陆成功处理*/
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

                        /*登录失败处理*/
                        function loginError(result) {
                            //登陆失败
                            memberNameElement.tips({
                                msg: "系统错误，无法登陆！",
                                side: 1,
                                time: 3
                            })
                        }

                        getData(url, dataType, data, type, loginSuccess, loginError);

                    } else {

                    }
                }
            });
        });

        // 弹出式需要绑定触发验证码弹出按钮
        captchaObj.bindOn("#popup-submit");

        // 将验证码加到id为captcha的元素里
        captchaObj.appendTo("#popup-captcha");

        captchaObj.setTime(5000);
        // 更多接口参考：http://www.geetest.com/install/sections/idx-client-sdk.html
    };

    $.ajax({
        // 获取id，challenge，success（是否启用failback）
        url: "/VerifyCode/StartCaptcha",
        type: "get",
        dataType: "json",
        success: function (data) {

            // 使用initGeetest接口
            // 参数1：配置参数
            // 参数2：回调，回调的第一个参数验证码对象，之后可以使用它做appendTo之类的事件
            initGeetest({
                gt: data.gt,
                challenge: data.challenge,
                product: "popup", // 产品形式，包括：float，embed，popup。注意只对PC版验证码有效
                offline: !data.success // 表示用户后台检测极验服务器是否宕机，一般不需要关注
            }, handlerPopup);
        }
    });

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