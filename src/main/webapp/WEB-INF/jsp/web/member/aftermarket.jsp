<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Member</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link href="${pageContext.request.contextPath}/css/member/member.css" rel="stylesheet">
    <style>
        div,span {
            color: #ffffff;
            font-family: "微软雅黑 Light";
            font-size: 18px;
        }

        .main .container {
            margin: 50px 100px;
        }

        .container .main {
            background-color: #161616;
        }

        .container .main .container div {
            margin: 20px 0px;
        }

        .container .main .container .header .qq {
            color: #ff0000;
        }

        .main .content {
            width: 720px;
            height: 520px;
            border: 1px solid rgba(151, 155, 164, 0.34);
            text-align: center;
            line-height: 520px;
        }


    </style>
</head>
<body>
<!--top-Header-menu-->
<jsp:include page="../../common/member_header.jsp"></jsp:include>
<!--close-top-Header-menu-->
<div class="container">
    <jsp:include page="../../common/member_left_nav.jsp"></jsp:include>
    <div class="main">
        <div class="container">
            <div class="header">
                <span>售后服务请联系在线工作人员</span>
                <span class="qq">QQ:56825728</span>
            </div>
            <div class="explain">
                <span>售后服务说明</span>
            </div>
            <div class="content">
                说明保留区域
            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
