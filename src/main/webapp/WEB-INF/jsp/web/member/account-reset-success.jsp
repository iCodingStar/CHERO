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
        .main .container .header span:nth-child(7),
        .main .container .header span:nth-child(8),
        .main .container .header span:nth-child(9) {
            background-color: #E13641;
            color: #fefefe;
        }

        .main .container .header .bottom {
            width: 225px;
            text-align: center;
            padding: 12px 0px;
            margin-left: 450px;
        }

        .main .container .header .bottom span {
            color: red;
        }

        .main .container .content .success-tips a {
            color: red;
            text-decoration: solid;
        }

        .main .container .content{
            margin: 150px 0px;
        }

        .main .container .content div{
            text-align: center;
            margin: 50px auto;
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
                    <span>修改成功</span>
                </div>
            </div>

            <div class="content">
                <div class="success-tips">
                    密码修改成功，请 <a href="${pageContext.request.contextPath}/MemberCenter/Index">重新登陆</a> ！
                </div>
            </div>
        </div>
    </div>

    <div class="clear"></div>
</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
