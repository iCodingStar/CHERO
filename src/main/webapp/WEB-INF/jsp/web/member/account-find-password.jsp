<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Member</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link href="${pageContext.request.contextPath}/css/member/member.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/member/modify.css" rel="stylesheet">
    <style>
        .main {
            padding: 50px 200px;
        }

        .main .content{
            padding-left: 80px;
        }
        .main .container .header .top span:nth-child(1),
        .main .container .header .top span:nth-child(2),
        .main .container .header .top span:nth-child(3) {
            background-color: #E13641;
            color: #fefefe;
        }

        .main .container .header .bottom {
            width: 225px;
            text-align: center;
            padding: 12px 0px;
        }

        .content .email .send-code {
            margin-left: 10px;
            padding: 12px 8px;
            background-color: #E13641;
            border-radius: 3px;
        }

        .content form > div {
            margin: 0px;
            width: 520px;
            height: 51px;
            padding: 10px;
        }

        input {
            width: 305px;
            height: 51px;
        }

    </style>
</head>
<body>
<!--top-Header-menu-->
<jsp:include page="../../common/member_header.jsp"></jsp:include>
<!--close-top-Header-menu-->
<div class="container">

    <div class="main">
        <div class="container">

            <div class="header">
                <div class="top">
                    <span class="line"></span>
                    <span class="number">1</span>
                    <span class="line"></span>
                    <span class="line"></span>
                    <span class="number">2</span>
                    <span class="line"></span>
                    <span class="line"></span>
                    <span class="number">3</span>
                    <span class="line"></span>
                    <div class="clear"></div>
                </div>
                <div class="bottom">
                    <span>验证身份</span>
                </div>
            </div>

            <div class="content">
                <form action="${pageContext.request.contextPath}/MemberCenter/Verify/SecCode">

                    <div class="email">
                        验证邮箱：
                        <input type="text" class="email" placeholder="请输入注册邮箱" onblur="verifyEmail()">
                        <span class="send-code"><a href="#">获取验证码</a></span>
                    </div>

                    <div class="verify-code">
                        <label for="verify-code"> &nbsp;&nbsp;&nbsp;验证码：</label>
                        <input type="text" id="verify-code" name="verify-code" placeholder="请输入验证码">
                    </div>

                    <div class="submit">
                        <input type="submit" value="验证">
                    </div>
                </form>
            </div>
        </div>
    </div>

    <div class="clear"></div>
</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
