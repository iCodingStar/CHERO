<%--
  User: ShiXing
  Time: 16/6/13 00:58
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String contextPath = request.getContextPath();
    String url = request.getParameter("url");
    if (url == null) {
        url = contextPath + "/HomePage/Index";
    } else {
        url = contextPath + url;
    }
    response.sendRedirect(url);
%>
