<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Member</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link href="${pageContext.request.contextPath}/css/member/member.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/member/info.css" rel="stylesheet">
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
                <li><a href="${pageContext.request.contextPath}/MemberCenter/Info">基本信息</a></li>
                <li><a href="${pageContext.request.contextPath}/MemberCenter/Info/Photo">头像照片</a></li>
                <li  class="active"><a href="${pageContext.request.contextPath}/MemberCenter/Info/More">更多个人信息</a></li>
            </ul>
        </div>
        <div class="content">
            <div class="basic-info">

            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
