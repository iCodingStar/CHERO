<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>学院介绍</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/market.css">
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
            <li><a href="${pageContext.request.contextPath}/Training/Index">体能训练</a>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/Training/Index?#article">相关文章</a></li>
                    <li><a href="${pageContext.request.contextPath}/Training/Index?#video">相关视频</a></li>
                </ul>
            </li>
            <li><a href="${pageContext.request.contextPath}/Experience/Index">预约体验</a></li>
            <li class="active"><a href="${pageContext.request.contextPath}/Market/Index">运动商城</a></li>
            <li><a href="${pageContext.request.contextPath}/MemberCenter/Index">会员中心</a></li>
            <li><a href="${pageContext.request.contextPath}/Contact/Index">联系我们</a></li>
        </ul>
    </nav>
</header>
<!--close-top-Header-menu-->
<div>

    <section>
        <h2 id="badminton">羽毛球<span class="item-english">Badminton</span></h2>
        <div class="itemwrap">
            <div><a href="${pageContext.request.contextPath}/Market/Item/Detail"><img src="${pageContext.request.contextPath}/img/market/m3.png"><span>春季常规班</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m3.png"><span>暑假“72变”集训</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m3.png"><span>秋季常规班</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m3.png"><span>暑假“突击”集训</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m3.png"><span>私人定制1对1</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m3.png"><span>私人定制1对2</span></a></div>
        </div>
    </section>

    <section>
        <h2 id="outdoor-sport">户外运动<span class="item-english">Outdoor Sport</span></h2>
        <div class="itemwrap">
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m4.png"><span>攀岩课程</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m5.png"><span>野外生存课程</span></a></div>
        </div>
    </section>

    <section>
        <h2>酒水<span class="item-english">wine</span></h2>
        <div class="itemwrap">
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m2.png"><span>春季常规班</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m2.png"><span>暑假“72变”集训</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m2.png"><span>秋季常规班</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m2.png"><span>暑假“突击”集训</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m2.png"><span>私人定制1对1</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m2.png"><span>私人定制1对2</span></a></div>
        </div>
    </section>

    <section>
        <h2>运动器械<span class="item-english">Sports Equipment</span></h2>
        <div class="itemwrap">
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m1.png"><span>春季常规班</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m1.png"><span>暑假“72变”集训</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m1.png"><span>秋季常规班</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m1.png"><span>暑假“突击”集训</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m1.png"><span>私人定制1对1</span></a></div>
            <div><a href="#"><img src="${pageContext.request.contextPath}/img/market/m1.png"><span>私人定制1对2</span></a></div>
        </div>
    </section>

</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>