<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/10/12
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%
    Date date = new Date();
    SimpleDateFormat dateFm=new SimpleDateFormat("EEEE");
    int hours= date.getHours();
    if(hours<=12) {
        out.println(dateFm.format(date)+"上午"+hours+"点"+date.getMinutes()+"分");
    }else{
        out.println(dateFm.format(date)+"下午"+hours+"点"+date.getMinutes()+"分");
    }
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
