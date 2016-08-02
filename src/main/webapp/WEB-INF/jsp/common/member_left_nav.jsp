<%--
  User: ShiXing
  Time: 16/1/15 02:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/taglib.jsp" %>
<div class="left">
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/MemberCenter/Index">个人资料</a></li>
            <li class="item"><a href="${pageContext.request.contextPath}/MemberCenter/Info">个人信息</a></li>
            <li class="item"><a href="${pageContext.request.contextPath}/MemberCenter/Address">收货地址</a></li>

            <li><a href="${pageContext.request.contextPath}/MemberCenter/Cart">我的购物车</a></li>

            <li><a href="${pageContext.request.contextPath}/MemberCenter/Orders">我的订单</a></li>
            <li class="item"><a href="${pageContext.request.contextPath}/MemberCenter/Orders/All">往期订单</a></li>
            <li class="item"><a href="${pageContext.request.contextPath}/MemberCenter/Orders/Unpaid">未完成订单</a></li>

            <li><a href="${pageContext.request.contextPath}/MemberCenter/Account">账户设置</a></li>
            <li class="item"><a href="${pageContext.request.contextPath}/MemberCenter/Account/Safety">账户安全</a></li>
            <li class="item"><a href="${pageContext.request.contextPath}/MemberCenter/Account/Modify/Password">修改密码</a></li>

            <li><a href="${pageContext.request.contextPath}/MemberCenter/Client/Service">客户服务</a></li>
            <li class="item"><a href="${pageContext.request.contextPath}/MemberCenter/Advices">意见建议</a></li>
            <li class="item"><a href="${pageContext.request.contextPath}/MemberCenter/Aftermarket">售后服务</a></li>

            <li><a href="#">会员积分</a></li>
            <li><a href="#">等级体系</a></li>

        </ul>
    </nav>
</div>