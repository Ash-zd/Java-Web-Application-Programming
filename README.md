# Java Web Application Programming  
---
Description: Java Web Application Programming, 2018 Autumn, HDU  

## 0x01 实训1 Web开发基础  
* 实验目的：了解`HTML`和`CSS`的用法  
* 作业要求：  
  * 最终内容打包成学号+姓名.rar格式  
  * 上交到服务器  
  * 可以通过www.w3school.com.cn或者baidu，google等网站寻求帮助来完成作业。  
  * 网页制作过程中，网站元素用`HTML`来编写，网站的样式用`CSS`来编写，所有标签元素的`CSS`样式描述方法均可在w3school上找到。  

## 0x02 实训2 Web开发基础`JavaScript`  
* 实验目的：了解`JavaScript`的基本语法，掌握简单的js程序的编写，  
* 作业要求：  
  * 最终内容打包成学号+姓名.rar格式  
  * 上交到服务器   
  * 可以通过www.w3school.com.cn或者baidu，google等网站寻求帮助来完成作业。  

* 编写E-mail注册的表单的验证代码。包括内容：邮箱名称（长度6到10位，不能为空）、密码、确认密码（两个密码必须相同且不能为空）、来自城市、爱好、性别、个人介绍，以及确认与重置按钮。  
* 编写程序统计1到50中所有偶数的和。（分别用`for`和`while`语句实现）  
* 编写程序实现：取系统时间，如果时间在`6:00－12:00`之间，输出`早上好`；如果时间在`12:00－18:00`，输出`下午好`；如果时间在`18:00－24:00`之间，输出`晚上好`；如果时间在`0:00－6:00`，输出`凌晨好`。  
* 在字符串```I am a girl, I like dancing!```的每个字符之间加上一个字符“#”，输出字符为：
```I# #a#m# #a# #girl#,# #I# #like# #d#a#n#c#i#n#g#!```并统计“#”的个数。  

## 0x03 实训3 `JSP`基础
* 实验目的：了解`JSP`的基本语法，掌握简单的`JSP`程序的编写，
* 作业要求：
  * 最终内容打包成学号+姓名.rar格式
  * 上交到服务器
  * 可以通过www.w3school.com.cn或者baidu，google等网站寻求帮助来完成作业。
* 编写一个`JSP`页面为`count.jsp`，用来计算访问本网页的人数，页面显示的内容为`你是第*个访问本网页的访客`。
* 编写一个`JSP`页面`time.jsp`,用来显示服务器时间跟客户端时间。显示内容为：`服务端时间为……；客户端时间为******`。测试的时候为了能够显示出服务端时间跟客户端时间的不同，需要使得客户端与服务端为不同的电脑（可以互相访问周边同学的电脑）。
* 编写一个`JSP`页面`week.jsp`，用来显示当前是星期几，以及上下午，时间信息。显示内容为`今天是星期*\上下午\几点几分`

## 0x04 实训4 `JSP`基础2  
* 实验目的：了解`JSP`的基本语法，掌握简单的`JSP`程序的编写  
* 作业要求：  
  * 最终内容打包成学号+姓名.rar格式  
  * 可以通过www.w3school.com.cn或者baidu，google等网站寻求帮助来完成作业。  
* 编写一个`JSP`页面为`register.jsp`，标题是“用户注册”，网页包括一个表单，内容有用户名，密码，籍贯，出生年月，性别，爱好，身高，邮箱，手机，个人介绍。  
  * 其中的内容需要表单验证（js处理），包括用户名长度在6到10位之间且只能用字母开头，邮箱必须符合邮箱的格式，手机需要11位的号码等，当用户输入不符合规则的时候应该提醒，并明确提示什么类型的错误，只有符合规则以后才能正常提交到JSP页面`post.jsp`。  
  * `Post.jsp`的内容是，把表单的填写内容，通过列表的方式按顺序显示出来。  
  * 注意点:  
    * 保证中文的正常显示  
    * 字符串的验证规则，可以上网查找js案例，并拷贝入代码中使用。  
    * 籍贯可以使用`select`控件，格式如下：获取value值可以使用`getParameter("s1")`  
        ```html
        <select name="s1">  
          <option value="bj">北京</option>  
          <option value="sh">上海</option>  
        </select>  
        ```

## 0x05 实训5 `JSP`内置对象  
* 实验目的：了解`JSP`的内置对象，掌握使用内置对象程序的编写  
* 作业要求：  
  * 最终内容打包成学号+姓名.rar格式
  * 可以通过www.w3school.com.cn或者baidu，google等网站寻求帮助来完成作业  
* 简易`session`版购物车的制作  
  * 注意点:  
    * 保证中文的正常显示  
    * 表单提交以后，可以专门用一个`JSP`处理，然后再回退到操作界面（需要一定的时间延迟刷新，保证用户能感受到页面的变化）  
    * 购物车数据通过`session`保存，窗口关闭以后数据消失  
* 学习安装`MySQL`数据库  

## 0x06 实训6 Web下的`JDBC`  
* 实验目的：了解`JDBC`代码的基本编写方法，掌握Web开发项目中`JDBC`的实际应用。  
* 作业要求：  
  * 最终内容打包成学号+姓名.rar格式  
  * 可以通过www.w3school.com.cn或者baidu，google等网站寻求帮助来完成作业。  
* 在Web中通过`JDBC`操作数据库中的表格数据  
  * 在`MySQL`数据库软件中创建一个数据库`mydatebase`  
  * 在数据库中创建一个表`students`（可以通过`create`命令，或者图形界面创建）  
	```sql
	CREATE TABLE IF NOT EXISTS 'students' (
	'id' int(11) NOT NULL auto_increment,
	'link' varchar(255) default NULL,
	'pwd' varchar(255) default NULL,
	'roles' varchar(255) default NULL,
	'uid' varchar(255) default NULL,
	'username' varchar(255) default NULL,
	PRIMARY KEY ('id')
    ) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=3;
	```  
  * 创建`jsp`页面`list.jsp`,功能:从数据库中读取`students`表的内容，并显示在网页上的表格中；另外在表格之前使用一个表单，表单中包含若干个text控件（text数跟students的字段数相同），以及一个submit按钮，可以模糊查询表中的内容，并且更新页面；在`list.jsp`页面的最下面，创建一个链接（链接到`new.jsp`），链接文字是“增加学生”  
  * 创建`jsp`页面`new.jsp`，内容是一个表单，表单项是students的字段的内容,以及submit和reset按钮。当点击submit按钮以后，请用js做简单的表单验证（包括字段非空验证），然后提交到页面`newConfirm.jsp`处理  
  * 创建页面`newConfirm.jsp`，功能是把前面表单的内容存储到数据库的`students表`中（不能违反数据库表的主键约束），然后显示提示信息“新建学生成功”，并且5秒以后跳转返回到页面`list.jsp`  
  * 注意：  
    * 使用到的`jsp`对象主要包括`out`、`request`、`response`  
    * 代码编写主要包括`JDBC`数据库表的`增加（executeUpdate）`与`查询(executeQuery)`  
    * `MySQL`数据库的安装可以上外网下载5.0以上的版本  

## 0x07 `Servlet`  
* 实验目的：了解`Servlet`代码的基本编写方法，掌握Web开发项目中`Servlet`的实际应用。
* 作业要求：
  * 最终内容打包成学号+姓名.rar格式
  * 可以通过www.w3school.com.cn或者baidu，google等网站寻求帮助来完成作业。
* 在Web中通过Servlet(JDBC)操作数据库中的表格数据。
  * 在mysql数据库软件中创建一个数据库mydatebase
  * 在数据库中创建一个表students（可以通过create命令，或者图形界面创建）
	```sql
	CREATE TABLE IF NOT EXISTS 'students' (
	  'id' int(11) NOT NULL auto_increment,
	  'link' varchar(255) default NULL,
	  'pwd' varchar(255) default NULL,
	  'roles' varchar(255) default NULL,
	  'uid' varchar(255) default NULL,
	  'username' varchar(255) default NULL,
	  PRIMARY KEY ('id')
	) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;
	```
  * 创建`servlet`代码`List` ,功能:从数据库中读取`students表`的内容；在页面的最下面，创建一个链接（链接到`new.jsp`），链接文字是“增加学生”。
  * 创建jsp页面`new.jsp`，内容是一个表单，表单项是`students`的字段的内容,以及`submit`和`reset`按钮。当点击`submit`按钮以后，请用js做简单的表单验证（包括字段非空验证），然后提交到`Servlet`代码`confirm`处理。
  * 创建代码`confirm`，将表单的内容存储到数据库的表`students`中（不能违反数据库表的主键约束），然后显示提示信息`“新建学生成功”`，并且5秒以后跳转返回到`List`
  * 注意：
    * 使用到的jsp对象主要包括`out`、`request`、`response`
    * `Servlet`代码需要注意的是`Web.xml`的配置
    * 代码编写主要包括`JDBC`数据库表的增加（`executeUpdate`）与查询(`executeQuery`)。
    * `MySQL`数据库的安装可以上外网下载5.0以上的版本。

