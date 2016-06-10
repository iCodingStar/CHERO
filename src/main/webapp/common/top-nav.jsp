<%--
 * <p>File: hrad.jsp</p>
 * <p>Description:网站导航内容 </p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/6/10 20:53
 * @since 1.0.0
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!----- start-header---->
<div class="header fixed">
    <div class="container">

        <div class="logo">
            <a href="index.jsp"><h1><span></span></h1></a>
        </div>

        <span class="menu"> </span>

        <div class="top-menu">
            <nav class="navigation">
                <ul class="cl-effect-16">
                    <li><a class="active" href="${pageContext.request.contextPath}/index.jsp">首页</a></li>
                    <li><a class="" href="${pageContext.request.contextPath}/academy.jsp">学院介绍</a></li>
                    <li><a class="" href="${pageContext.request.contextPath}/trainers.jsp">师资力量</a></li>
                    <li><a class="" href="${pageContext.request.contextPath}/training.jsp">体能训练</a></li>
                    <li><a class="" href="${pageContext.request.contextPath}/#">预约体验</a></li>
                    <li><a class="" href="${pageContext.request.contextPath}/markets.jsp">运动商城</a></li>
                    <li><a class="" href="${pageContext.request.contextPath}/Member/MemberHome">会员中心</a></li>
                    <li><a class="" href="${pageContext.request.contextPath}/contact.jsp">联系我们</a></li>
                </ul>
            </nav>
        </div>

        <!-- script for menu -->
        <script>
            $("span.menu").click(function () {
                $(".top-menu").slideToggle("slow", function () {

                });
            });
        </script>
        <!-- script for menu -->

        <div class="clearfix"></div>
    </div>
</div>
<!----- end-header---->