<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Member</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link href="${pageContext.request.contextPath}/css/member/member.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/member/index.css" rel="stylesheet">
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
            <li class="active"><a href="${pageContext.request.contextPath}/MemberCenter/Index">会员中心</a></li>
            <li><a href="${pageContext.request.contextPath}/Contact/Index">联系我们</a></li>
        </ul>
    </nav>
</header>
<!--close-top-Header-menu-->
<div class="container">
    <jsp:include page="../../common/member_left_nav.jsp"></jsp:include>

    <div class="main">
        <div class="member-info">

            <div class="image">
                <img src="${pageContext.request.contextPath}/img/member_center/meber/member.png">
            </div>

            <div class="info">

                <div class="info-details">
                    <div><span class="memberName">${member.memberName}</span></div>
                    <div>
                        <span class="star"></span>
                        <span>五星会员</span>
                    </div>
                    <div>
                        <span>账户安全：</span>
                        <span class="account-safety"></span>
                        <span><a href="#">提升</a></span>
                    </div>
                    <div><span>实名认证：</span><span>未认证</span></div>
                </div>

                <div class="sub-menu">
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/img/member_center/no-pay.png" alt="待付款"
                             onclick="alert('click')">
                        <span>待付款</span>
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/img/member_center/no-receive.png" alt="待收货">
                        <span>待收货</span>
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/img/member_center/no-commet.png" alt="待评价">
                        <span>待评价</span>
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/img/member_center/query-course.png" alt="课时查询">
                        <span>课时查询</span>
                    </div>
                    <div class="clear"></div>
                </div>

                <div class="clear"></div>

            </div>

            <div class="clear"></div>
        </div>

        <div class="member-orders-null">

            <div class="header">
                <div class="title"><span>我的订单</span></div>
                <div class="view-orders"><a href="#">查看所有订单</a></div>
                <div class="clear"></div>
            </div>

            <div class="content">
                <span></span>
                <img src="${pageContext.request.contextPath}/img/member_center/cart-null.png">
            </div>

        </div>

        <div class="member-orders">

            <div class="header">
                <div class="title"><span>我的订单</span></div>
                <div class="view-orders"><a href="#">查看所有订单</a></div>
                <div class="clear"></div>
            </div>

            <div class="content">

                <div class="orders">

                    <div class="order">

                        <div class="header">
                            <div class="time">
                                <span>2016-08-06 17:00:00</span>
                            </div>
                            <div class="order-no">
                                订单号：<span>201608060001</span>
                            </div>
                            <div class="clear"></div>
                        </div>

                        <div class="content">
                            <div class="course">
                                <div class="course-pic">
                                    <img src="${pageContext.request.contextPath}/img/market/m3.png">
                                </div>
                                <div class="course-name">
                                    <span>C-HERO 2016 暑期集训一、三期课程</span>
                                </div>
                                <div class="course-number">
                                    x<span>1</span>
                                </div>
                                <div class="clear"></div>
                            </div>
                            <div class="price">
                                <div class="content">
                                    <span>￥1000.0元</span>
                                    <span class="line"></span>
                                    <span>在线支付</span>
                                </div>
                            </div>
                            <div class="order-state">
                                <div class="content">
                                    <span>待付款</span>
                                    <span class="line"></span>
                                    <span>订单详情</span>
                                </div>
                            </div>
                            <div class="order-operation">
                                <a href="#">立即购买</a>
                            </div>
                            <div class="clear"></div>
                        </div>
                    </div>

                    <div class="order">

                        <div class="header">
                            <div class="time">
                                <span>2016-08-06 17:00:00</span>
                            </div>
                            <div class="order-no">
                                订单号：<span>201608060001</span>
                            </div>
                            <div class="clear"></div>
                        </div>

                        <div class="content">
                            <div class="course">
                                <div class="course-pic">
                                    <img src="${pageContext.request.contextPath}/img/market/m3.png">
                                </div>
                                <div class="course-name">
                                    <span>C-HERO 2016 暑期集训一、三期课程</span>
                                </div>
                                <div class="course-number">
                                    x<span>1</span>
                                </div>
                                <div class="clear"></div>
                            </div>
                            <div class="price">
                                <div class="content">
                                    <span>￥1000.0元</span>
                                    <span class="line"></span>
                                    <span>在线支付</span>
                                </div>
                            </div>
                            <div class="order-state">
                                <div class="content">
                                    <span>待付款</span>
                                    <span class="line"></span>
                                    <span>订单详情</span>
                                </div>
                            </div>
                            <div class="order-operation">
                                <a href="#">立即购买</a>
                            </div>
                            <div class="clear"></div>
                        </div>
                    </div>

                    <div class="order">

                        <div class="header">
                            <div class="time">
                                <span>2016-08-06 17:00:00</span>
                            </div>
                            <div class="order-no">
                                订单号：<span>201608060001</span>
                            </div>
                            <div class="clear"></div>
                        </div>

                        <div class="content">
                            <div class="course">
                                <div class="course-pic">
                                    <img src="${pageContext.request.contextPath}/img/market/m3.png">
                                </div>
                                <div class="course-name">
                                    <span>C-HERO 2016 暑期集训一、三期课程</span>
                                </div>
                                <div class="course-number">
                                    x<span>1</span>
                                </div>
                                <div class="clear"></div>
                            </div>
                            <div class="price">
                                <div class="content">
                                    <span>￥1000.0元</span>
                                    <span class="line"></span>
                                    <span>在线支付</span>
                                </div>
                            </div>
                            <div class="order-state">
                                <div class="content">
                                    <span>待付款</span>
                                    <span class="line"></span>
                                    <span>订单详情</span>
                                </div>
                            </div>
                            <div class="order-operation">
                                <a href="#">立即购买</a>
                            </div>
                            <div class="clear"></div>
                        </div>
                    </div>

                </div>

            </div>

        </div>
    </div>

    <div class="clear"></div>
</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
