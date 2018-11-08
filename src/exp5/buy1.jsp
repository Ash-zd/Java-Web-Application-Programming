<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/11/8
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String strings[] = request.getParameterValues("meat");
    if(strings != null) {
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
<p>各类肉类大甩卖，一律10块：</p>
<br>
<form action="#">
    <input type="checkbox" name="meat" value="猪肉">猪肉
    <br>
    <input type="checkbox" name="meat" value="牛肉">牛肉
    <br>
    <input type="checkbox" name="meat" value="羊肉">羊肉
    <br>
    <input type="submit" value="提交">&nbsp;<input type="reset" value="清空">
</form>&nbsp;<a href="./buy2.jsp">买点别的</a>&nbsp; <a href="./display.jsp">查看购物车</a>
</body>
</html>
