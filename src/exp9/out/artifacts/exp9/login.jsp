<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/12/19
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>This is login page.</h1>
<%
    String no = (String)request.getAttribute("customer_no");
    String name = (String)request.getAttribute("customer_name");
%>
<ul>
    <li>This is result message.</li>
    <li>no: <% out.print(no); %></li>
    <li>name: <% out.print(name); %></li>
</ul>

</body>
</html>
