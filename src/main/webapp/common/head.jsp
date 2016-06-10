<%--
 * <p>File: hrad.jsp</p>
 * <p>Description:网站头部内容 </p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/6/10 20:53
 * @since 1.0.0
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<link href="${pageContext.request.contextPath}/libs/bootstrap/css/bootstrap.css" rel='stylesheet' type='text/css'/>

<!-- Custom Theme files -->
<link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet'/>
<!--fullpage css-->
<link href="${pageContext.request.contextPath}/css/jquery.fullpage.min.css" rel="stylesheet">
<!--jQuery-->
<script src="${pageContext.request.contextPath}/libs/js/jquery/jquery.min.js"></script>
<!--jquery fullpage-->
<script src="${pageContext.request.contextPath}/libs/js/jquery.fullpage.min.js"></script>
<script>
    $(function () {
        $("#fullpage").fullpage({
            resize: true,
            scrollingSpeed: 1000,
            anchors: ['page-banner', 'page-trainers', 'page-courses', 'page-training', 'page-contact'],
            loopTop: true,
            loopBottom: true,
            loopHorizontal: false,
            scrollBar: true,
            navigation: true,
            navigationPosition: 'right',
            navigationTooltips: ['banner', 'trainers', 'courses', 'training', 'contact'],
            showActiveTooltip: true,
            slidesNavigation: true,
            slidesNavPosition: 'top'
        });
    })
</script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<script src="${pageContext.request.contextPath}/assets/js/html5shiv.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/respond.min.js"></script>
<![endif]-->

