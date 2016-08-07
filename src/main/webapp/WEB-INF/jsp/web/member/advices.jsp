<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Advices</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link href="${pageContext.request.contextPath}/css/member/member.css" rel="stylesheet">
    <style>

        span {
            color: #ffffff;
            font-family: "微软雅黑 Light";
        }

        .main .container {
            margin: 50px 100px;
        }

        .container .main {
            background-color: #161616;
            height: 520px;
        }

        .container .main .header{
            margin: 20px 0px;
        }

        .main .content {
            width: 720px;
            height: 520px;
        }

        .container .main .content #advices {
            width: 680px;
            height: 248px;
        }

        input[type=submit] {
            padding: 7px 8px;
            background-color: #E13641;
            border-radius: 6px;
            border: 0px;
            color: #ffffff;
            width: 160px;
            text-align: center;
            margin: 15px 520px;
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
                <span>意见建议</span>
            </div>
            <div class="content">
                <form action="#">
                    <textarea id="advices" name="advices"></textarea>
                    <input type="submit" value="提交">
                </form>
            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
