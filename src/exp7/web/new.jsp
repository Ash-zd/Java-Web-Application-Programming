<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/11/29
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>new</title>
    <script type="application/javascript">
        function check() {
            let temp = document.getElementById("id").value;
            if(temp===""||temp==null)
                return false;
            temp= document.getElementById("link").value;
            if(temp===""||temp==null)
                return false;
            temp= document.getElementById("pwd").value;
            if(temp===""||temp==null)
                return false;
            temp= document.getElementById("roles").value;
            if(temp===""||temp==null)
                return false;
            temp= document.getElementById("uid").value;
            if(temp===""||temp==null)
                return false;
            temp= document.getElementById("username").value;
            if(temp===""||temp==null)
                return false;
        }
    </script>
</head>
<body>
<form action="confirm" onsubmit="return check();">
    id:<input type="text" name="id" id="id"><br>
    link:<input type="text" name="link" id="link"><br>
    pwd:<input type="text" name="pwd" id="pwd"><br>
    roles:<input type="text" name="roles" id="roles"><br>
    uid:<input type="text" name="uid" id="uid"><br>
    username:<input type="text" name="username" id="username"><br>
    <input type="submit" name="submit" value="submit">&nbsp;<input type="reset" value="reset"><br>
</form>
</body>
</html>