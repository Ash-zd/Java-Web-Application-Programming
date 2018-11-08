<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/11/8
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%
    Enumeration enumeration = session.getAttributeNames();
    int i = 0;
    String[] strings = new String[10];
    while(enumeration.hasMoreElements())
    {
        strings[i] = (String) session.getAttribute((String)enumeration.nextElement());
        i++;
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>你选择的结果是：</p>
<br>
<p>
    <%
    if(strings != null){
        for (String str:strings) {
            if(str != null) {
                out.println(str + "<br>");
            }
        }
    }
    %>
</p>
</body>
</html>
