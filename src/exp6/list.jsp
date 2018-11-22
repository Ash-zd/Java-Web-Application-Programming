<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/11/22
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="#">
    id:<input type="text" name="id" id="id"><br>
    link:<input type="text" name="link" id="link"><br>
    pwd:<input type="text" name="pwd" id="pwd"><br>
    roles:<input type="text" name="roles" id="roles"><br>
    uid:<input type="text" name="uid" id="uid"><br>
    username:<input type="text" name="username" id="username"><br>
    <input type="submit" name="submit" value="submit">
</form>
<%
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabse", "root", "123456");
        String sql1 = "SELECT * FROM students";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql1);
        out.println("<table border>");
        out.println("<tr><td>id</td>username</td><td>roles</td><td>uid</td><td>link</td><td>pwd</td></tr>");
        while (resultSet.next()){
            out.println("<tr>");
            int id = rs.getInt("id");
            String link = rs.getString("link");
            String pwd = rs.getString("pwd");
            String roles = rs.getNString("roles");
            String uid = rs.getString("uid");
            String username = rs.getString("username");
            out.println("<td>" + id);
            out.println("<td>" + username);
            out.println("<td>" + roles);
            out.println("<td>" + uid);
            out.println("<td>" + link);
            out.println("<td>" + pwd);
            out.println("</tr>");
        }
        out.println("</table>");
        out.flush();
        out.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
<br>
<a href="new.jsp">增加学生</a>
</body>

</html>
