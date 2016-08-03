<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>预约体验</title>
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/experience.css" media="screen" title="no title"
          charset="utf-8">
    <script src="${pageContext.request.contextPath}/lib/laydate/laydate.js"></script>
</head>
<body>
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
            <li class="active"><a href="${pageContext.request.contextPath}/Experience/Index">预约体验</a></li>
            <li><a href="${pageContext.request.contextPath}/Market/Index">运动商城</a></li>
            <li><a href="${pageContext.request.contextPath}/MemberCenter/Index">会员中心</a></li>
            <li><a href="${pageContext.request.contextPath}/Contact/Index">联系我们</a></li>
        </ul>
    </nav>
</header>

<div class="main">

    <div class="header">

    </div>

    <div class="content">
        <form action="#">
            <div class="name">
                <label for="name">学员姓名：</label>
                <input id="name" type="text">
            </div>

            <div class="sex">
                <label for="sex">性别：</label>
                <select class="" id="sex" name="">
                    <option value="option">请选择</option>
                </select>
            </div>

            <div class="birthday">
                <label for="birthday">出生年月：</label>
                <input class="laydate-icon" type="text" id="birthday" name="birthday" onclick="laydate()">
            </div>

            <div class="year">
                <label for="year">所在年级：</label>
                <input type="text" id="year">
            </div>

            <div class="school">
                <label for="school">就读学校：</label>
                <input type="text" id="school">
            </div>

            <div class="master">
                <label for="master">家长姓名：</label>
                <input type="text" id="master">
            </div>

            <div class="number">
                <label for="number">联系电话：</label>
                <input type="text" id="number">
            </div>

            <div class="addr">
                <label for="addr">家庭住址：</label>
                <input type="text" id="addr">
            </div>

            <div class="course">
                <label for="course">预约课程：</label>
                <select id="course" class="" name="">
                    <option value="option">请选择</option>
                </select>
            </div>

            <div class="time">
                <label for="time">出生年月：</label>
                <input class="laydate-icon" type="text" id="time" name="time" onclick="laydate()">
            </div>

            <dic class="submit">
                <input type="submit" value="提交">
            </dic>
        </form>
    </div>

</div>
<script>
    $(function () {
        laydate.skin('dahong');
    })
</script>
<jsp:include page="../../common/footer.jsp"></jsp:include>
</body>
</html>
