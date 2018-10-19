<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/10/12
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*"%>
<%
    Date now = new Date();
    int hours = now.getHours();
    int minutes = now.getMinutes();
    int seconds = now.getSeconds();
    out.print("服务器时间：" + dhours + ":" + dminutes + ":" + dseconds);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script language="JavaScript">
    var dnow = new Date();
    dhours = dnow.getHours();
    dminutes = dnow.getMinutes();
    dseconds = dnow.getSeconds();
    document.write("<br>浏览器时间：" + dhours + ":" + dminutes + ":" + dseconds);
</script>
</body>
</html>
