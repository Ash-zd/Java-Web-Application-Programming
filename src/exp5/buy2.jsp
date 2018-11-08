<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/11/8
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%
    String strings[] = request.getParameterValues("ball");
    if(strings!=null) {
        for (String str : strings) {
            session.setAttribute(str, str);
        }
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>各类球类大甩卖，一律8块：</p>
<br>
<form action="#">
    <input type="checkbox" name="ball" value="篮球">篮球
    <br>
    <input type="checkbox" name="ball" value="足球">足球
    <br>
    <input type="checkbox" name="ball" value="排球">排球
    <br>
    <input type="submit" value="提交">&nbsp;<input type="reset" value="清空">
</form>&nbsp;<a href="./buy1.jsp">买点别的</a>&nbsp; <a href="./display.jsp">查看购物车</a>
</body>
</html>
