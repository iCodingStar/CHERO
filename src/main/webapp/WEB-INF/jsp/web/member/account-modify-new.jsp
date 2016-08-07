<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Member</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link href="${pageContext.request.contextPath}/css/member/member.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/member/modify.css" rel="stylesheet">
    <style>
        .main .container .header span:nth-child(4),
        .main .container .header span:nth-child(5),
        .main .container .header span:nth-child(6){
            background-color: #E13641;
            color: #fefefe;
        }
        .main .container .header .bottom{
            width: 225px;
            text-align: center;
            padding: 12px 0px;
            margin-left: 225px;
        }
        .main .container .header .bottom span{
            color: red;
        }
        .content{
            text-align: center;
        }
        .content div{
            margin: 20px 80px;
        }
        .content div input{
            height: 42px;
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
                    <span>修改密码</span>
                </div>
            </div>

            <div class="content">
                <form action="${pageContext.request.contextPath}/MemberCenter/Account/Modify/Password/New">
                    <div class="memberPassword">
                        <label for="memberPassword">&nbsp;&nbsp;&nbsp;新密码</label>
                        <input type="text" id="memberPassword" name="memberPassword">
                    </div>
                    <div class="memberConfirmPassword">
                        <label for="memberConfirmPassword">确认密码</label>
                        <input type="text" id="memberConfirmPassword" name="memberConfirmPassword">
                    </div>
                    <div class="submit">
                        <input type="submit" value="提交修改">
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
