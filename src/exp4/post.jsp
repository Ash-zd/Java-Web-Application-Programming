<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/10/30
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    String username =  request.getParameter("username");
    try {
        username.trim();
    }catch (Exception e){
        throw new Exception("请输入username");
    }
    String password = request.getParameter("password");
    try {
        password.trim();
    }catch (Exception e) {
        throw new Exception("请输入password");
    }
    String sex = request.getParameter("sex");
    String s1 = request.getParameter("s1");
    String date = request.getParameter("date");
    String hobbit = request.getParameter("hobbit");
    String tall_ = request.getParameter("tall");
    String email = request.getParameter("email");
    String tel = request.getParameter("tel");

    String intro = request.getParameter("intro");

%>
<html>
<head>
    <title>Post</title>
</head>
<body>
<ul>
    <li>用户名：<%=username%></li>
    <li>密码：<%=password%></li>
    <li>性别：<%=sex%></li>
    <li>籍贯：<%=s1%></li>
    <li>出生年月：<%=date%></li>
    <li>爱好：<%=hobbit%></li>
    <li>身高：<%=tall_%></li>
    <li>邮箱：<%=email%></li>
    <li>手机：<%=tel%></li>
    <li>个人介绍：<%=intro%></li>
</ul>
</body>
</html>
