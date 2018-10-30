<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/10/30
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="post.jsp" onsubmit="return fun1()">
    用户名：<input type="text" name="username" id="username"><br>
    密码：<input type="password" name="password" id="password"><br>
    性别：<input type="radio" name="sex" value="man">男&nbsp;<input type="radio" name="sex" value="women">女<br>
    籍贯：<select name="s1" id="s1">
    <option value="bj">北京</option>
    <option value="sh">上海</option>
    </select><br>
    出生年月：<input type="date" name="date" id="date"><br>
    爱好：<input type="text" name="hobbit" id="hobbit"><br>
    身高：<input type="number" name="tall" id="tall"><br>
    邮箱：<input type="email" name="email" id="email"><br>
    手机：<input type="tel" name="tel" id="tel"><br>
    个人介绍：<textarea name="intro" id="intro"></textarea><br>
    <input type="submit" name="submit" value="submit">
</form>

<script type="application/javascript" language="JavaScript">
    function fun1() {
        let user = document.getElementById('username').value;
        if (user.length < 6 || user.length > 10){
            alert("用户名长度应在6-10之间");
            return false;
        }
        if (!((user.charAt(0) >= 'a' && user.charAt(0) <= 'z') || (user.charAt(0) >= 'A' && user.charAt(0) <= 'Z'))) {
            alert("用户名开头应是字母");
            return false;
        }
        let test = document.getElementById("tel").value;
        if (test.length !== 11) {
            alert("电话号码长度不正确");
            return false;
        }
        let email = document.getElementById("email").value;
        if (email == null || email === '') {
            alert("邮箱不能为空");
            return false;
        }
    }
</script>

</body>
</html>
