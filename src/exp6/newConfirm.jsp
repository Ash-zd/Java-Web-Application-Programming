<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/11/22
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    resp.setContentType("text/html");
    out = resp.getWriter();
    if(req.getParameterValues("submit")!=null)
    {
        String id=req.getParameter("id");
        String link = req.getParameter("link");
        String pwd = req.getParameter("pwd");
        String roles = req.getParameter("roles");
        String uid = req.getParameter("uid");
        String username = req.getParameter("username");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String passwd = "123456";
            Connection connt = DriverManager.getConnection(url, user, passwd);
            String sql = "INSERT into students values("+id+",'"+link+"','"+pwd+"','"+roles+"','"+uid+"','"+username+"')";
            Statement stmt = connt.createStatement();
            stmt.execute(sql);
            //ResultSet result = stmt.executeQuery(sql);
            //result.close();
            out.println("<h3>Insert success</h3>");
            stmt.close();
            connt.close();

        }catch (Exception e) {
            out.println("<h3>Insert failed</h3>");
            e.printStackTrace();
        }
        String t = 5+";URL="+"./new.jsp";
        resp.setHeader("Refresh", t);
    }
    out.flush();
    out.close();
%>

</body>
</html>
