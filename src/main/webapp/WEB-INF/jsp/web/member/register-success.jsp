<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>注册成功</title>
    <meta http-equiv="refresh" content="2;url=${pageContext.request.contextPath}/MemberCenter/Index" />
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>
<!--top-Header-menu-->
<jsp:include page="../../common/member_header.jsp"></jsp:include>
<!--close-top-Header-menu-->
<div class="user">
    <div style="margin-left: 60px;"><img src="${pageContext.request.contextPath}/img/member_center/success.png"></div>
    <a href="${pageContext.request.contextPath}/MemberCenter/Index"
       style="display:block;background:url(${pageContext.request.contextPath}/img/member_center/p5.png);width:462px;height:51px;margin-left: -45px;margin-top: 50px;"></a>
</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>