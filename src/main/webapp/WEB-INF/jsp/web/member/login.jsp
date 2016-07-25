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
                <li  class="active"><a href="${pageContext.request.contextPath}/MemberCenter/Index">会员中心</a></li>
                <li><a href="${pageContext.request.contextPath}/Contact/Index">联系我们</a></li>
            </ul>
        </nav>
    </header>
    <!--close-top-Header-menu-->
    <div class="user">
    	<div><span><img src="../../../img/user/p1.png"></span><input class="pic" type="text" name="" placeholder="用户名"></div>
    	<div><span><img src="../../../img/user/p2.png"></span><input class="pic" type="password" name="" placeholder="密码"></div>
    	<div><input class="vali" type="text" name=""><img src="../../../img/user/p3.png"></div>
    	<div><input type="submit" name="" value="登陆"></div>
    	<div>
    		<a href="register.jsp"><img src="../../../img/user/rig.png"></a>
    		<a href="" class="right"><img src="../../../img/user/forget.png"></a>
    	</div>

    </div>
    <jsp:include page="../../common/footer.jsp"/>
    </body>
</html>