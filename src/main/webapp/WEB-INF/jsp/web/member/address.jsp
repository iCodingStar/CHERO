<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Member</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link href="${pageContext.request.contextPath}/css/member/member.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/member/address.css" rel="stylesheet">
</head>
<body>
<!--top-Header-menu-->
<jsp:include page="../../common/member_header.jsp"></jsp:include>
<!--close-top-Header-menu-->
<div class="container">
    <jsp:include page="../../common/member_left_nav.jsp"></jsp:include>
    <div class="main">
        <div class="content">

            <div class="add-address"><a href="#">新增收货地址</a></div>

            <div class="address">
                <table>
                    <tr>
                        <td>地址一：</td>
                        <td>默认地址</td>
                    </tr>
                    <tr>
                        <td>收件人：</td>
                        <td>${member.memberName}</td>
                        <td>手机：</td>
                        <td>
                            <c:choose>
                                <c:when test="${member.memberTelephone == null}">
                                    手机号为空
                                </c:when>
                                <c:otherwise>
                                    ${member.memberTelephone}
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                    <tr>
                        <td>所在地区：</td>
                        <td>
                            <c:choose>
                                <c:when test="${member.memberAddress == null}">
                                    地址为空
                                </c:when>
                                <c:otherwise>
                                    ${member.memberAddress}
                                </c:otherwise>
                            </c:choose>
                        </td>


                        <td>邮箱：</td>
                        <td>
                            <c:choose>
                                <c:when test="${member.memberEmail == null}">
                                    邮箱为空
                                </c:when>
                                <c:otherwise>
                                    ${member.memberEmail}
                                </c:otherwise>
                            </c:choose>
                        </td>

                    </tr>

                    <tr>
                        <td>地址：</td>
                        <td>
                            <c:choose>
                                <c:when test="${member.memberAddress == null}">
                                    地址为空
                                </c:when>
                                <c:otherwise>
                                    ${member.memberAddress}
                                </c:otherwise>
                            </c:choose>
                        </td>

                        <td>固定电话：</td>
                        <td>
                            <c:choose>
                                <c:when test="${member.memberHomePhone == null}">
                                    固定电话为空
                                </c:when>
                                <c:otherwise>
                                    ${member.memberHomePhone}
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                </table>
            </div>

        </div>

    </div>
    <div class="clear"></div>
</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
