<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>师资力量</title>
    <meta charset="utf-8">
    <jsp:include page="../../common/head.jsp"></jsp:include>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/intro.css">
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
            <li class="active"><a href="${pageContext.request.contextPath}/Trainer/Index">师资力量</a></li>
            <li><a href="${pageContext.request.contextPath}/Training/Index">体能训练</a>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/Training/Index?#article">相关文章</a></li>
                    <li><a href="${pageContext.request.contextPath}/Training/Index?#video">相关视频</a></li>
                </ul>
            </li>
            <li><a href="${pageContext.request.contextPath}/Experience/Index">预约体验</a></li>
            <li><a href="${pageContext.request.contextPath}/Market/Index">运动商城</a></li>
            <li><a href="${pageContext.request.contextPath}/MemberCenter/Index">会员中心</a></li>
            <li><a href="${pageContext.request.contextPath}/Contact/Index">联系我们</a></li>
        </ul>
    </nav>
</header>
<!--close-top-Header-menu-->
<div class="top" style="background: url('${pageContext.request.contextPath}/img/teacher/bg.jpg');">
    <!--<h2 class="t-title">导师介绍</h2> -->
    <br>
    <div class="middle title"><img src="${pageContext.request.contextPath}/img/teacher/t.jpg"></div>
    <div>
        <div class="t-name">
            <span class="nleft"><span class="name">叶君键<span class="pinyin">YE JUNJIAN</span></span></span>
            <span class="nright"><span class=" name">谢明华<span class="pinyin">XIE MINGHUA</span></span></span>
        </div>
        <div class="detail">
            <ul class="left">
                <li>八一体工队特训队男双队员</li>
                <li>奥运会冠军韩国国家队李龙大中国区陪练</li>
                <li>《C-HERO青少儿课程教学规范》制定者</li>
                <li>国家一级羽毛球运动员</li>
                <li>国家一级羽毛球裁判</li>
                <li>C-HERO羽毛球学院教学板块负责人</li>
            </ul>

            <ul class="right">
                <li>担任2008年北京奥运会全球火炬传递护跑任务</li>
                <li>国家青年羽毛球队2012伦敦奥运会备战期实训体能教练</li>
                <li>《青少儿GRIT坚毅能力训练方法》开发者</li>
                <li>国家一级田径运动员</li>
                <li>国家二级羽毛球运动员</li>
                <li>国家一级羽毛球裁判、国家一级田径裁判</li>
                <li>运动经历及教练生涯18年</li>
            </ul>
            <div class="middle tmiddle">
                <img src="${pageContext.request.contextPath}/img/teacher/01.png">
                <img src="${pageContext.request.contextPath}/img/teacher/02.png">
            </div>
        </div>
    </div>
    <div class="line"></div>
</div>
<div class="bottom" style="background: url('${pageContext.request.contextPath}/img/teacher/bg02.jpg');">

    <br>
    <div class="middle title ttile"><img src="${pageContext.request.contextPath}/img/teacher/tr.jpg"></div>
    <img id="teachers" src="${pageContext.request.contextPath}/img/teacher/total.png">
    <!-- <h2 class="t-title">教练团队</h2>
    <div class="middle title"><img src="img/teacher/tr.jpg"></div>
    <div class="row">
        <div class="left">
            <h3>刘 帅<span class="pinyin">LIU SHUAI</span></h3>
            <h4 class="level">★★★★★荣耀五星教练</h4>
            <p class="intro">大学本科学历，武汉体院羽毛球专业，羽毛球国家二级运动员，曾经获得过全院羽毛球通级赛第一，江汉油田“尤尼克斯杯”男单第4，任教生涯四年。</p>
        </div>
        <div class="right">
            <h3>丰 烁<span class="pinyin">FENG SHUO</span></h3>
            <h4 class="level">★★★★★荣耀五星教练</h4>
            <p class="intro">羽毛球二级运动员，国家一级裁判员。武汉体育学院赴台湾体育大学交换生队长，2016武汉体育学院通级赛团体第一，2016台中市羽晨杯女双第三，2015武汉体育学院羽毛球通级赛混双亚军。</p>
        </div>
        <div class="middle">
            <img src="./img/teacher/03.png">
            <img src="./img/teacher/04.png">
        </div>
    </div>
    <div class="row">
        <div class="left">
            <h3>梁伟成<span class="pinyin">LIANG WEICHENG</span></h3>
            <h4 class="level">★★★★★荣耀五星教练</h4>
            <p class="intro">大学本科学历，武汉体院羽毛球专业，羽毛球国家二级运动员，曾经获得过全院羽毛球通级赛第一，全院精英赛第三积分赛第一，湖北省大学生羽毛球竞标赛第五，全国李永波3v3武汉站第三，教学经验3年</p>
        </div>
        <div class="right">
            <h3>李梦宇<span class="pinyin">LI MENGYU</span></h3>
            <h4 class="level">★★★★★荣耀五星教练</h4>
            <p class="intro">大学本科学历，武汉体院羽毛球专业，羽毛球国家二级运动员，曾经获得过全院羽毛球双打第四，宜昌“三峡杯”男双第2，任教生涯三年。</p>
        </div>
        <div class="middle">
            <img src="./img/teacher/05.png">
            <img src="./img/teacher/06.png">
        </div>
    </div>
    <div class="row">
        <div class="left">
            <h3>童冠宇<span class="pinyin">TONG GUANYU</span></h3>
            <h4 class="level">★荣耀一星教练</h4>
            <p class="intro">毛球国家二级运动员，国家一级裁判员，武汉体育学院羽毛球院联赛男双第三。</p>
        </div>
        <div class="right">
            <h3>唐瑞隆<span class="pinyin">TANG RUILONG</span></h3>
            <h4 class="level">★荣耀一星教练</h4>
            <p class="intro">大学本科学历，武汉体院羽毛球专业，羽毛球国家二级运动员，一级裁判员，武汉体育学院校运会羽毛球男子双打第二。</p>
        </div>
        <div class="middle">
            <img src="./img/teacher/07.png">
            <img src="./img/teacher/08.png">
        </div>
    </div>
    <div class="row">
        <div class="left">
            <h3>魏一斌<span class="pinyin">WEI YIBIN</span></h3>
            <h4 class="level">★荣耀一星教练</h4>
            <p class="intro">大学本科学历，武汉体院羽毛球专业毕业，羽毛球国家二级运动员，一级裁判员。2015江西南昌市全国业余羽毛球俱乐部赛男单第一。</p>
        </div>
        <div class="right">
            <h3>简海峰<span class="pinyin">JIAN HAIFENG</span></h3>
            <h4 class="level">★荣耀一星教练</h4>
            <p class="intro">羽毛球国家二级运动员，一级羽毛球裁判，武汉体育学院院通级赛男双第三，2015湖北省胜利“双雄会”男子双打第二，任教生涯3年。</p>
        </div>
        <div class="middle">
            <img src="">
            <img src="">
        </div>
    </div>-->
</div>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>