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

## 0x07 实训7 `Servlet`  
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

## 0x08 实训8 过滤器的用法
* 实验目的：掌握`Filter`代码的基本编写方法，并且在`web.xml`中设置。了解java代码模板的设置方法。
* 作业要求：
  * 最终内容打包成学号+姓名.rar格式
  * 可以通过www.w3school.com.cn或者baidu，google等网站寻求帮助来完成作业。
	* 设置`filter`代码的模板，代码结构如下。（设置代码的菜单是`windows-preferences-java-templates`，其中带“$ ”的是参数，根据实际情况会自行调整，使用模板的快捷方式是`alt`+`/`，当在空白处输入模板名，然后按快捷方式即产生代码）。
	```java
	package ${enclosing_package}
	import java.io.IOException;
	import javax.servlet.FilterChain;
	import javax.servlet.FilterConfig;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;
	import javax.servlet.Filter;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	public class ${primary_type_name} implements Filter{
	  public ${primary_type_name}(){
		super();
	  }
	  private FilterConfig filterConfig;
	  public void init(FilterConfig filterConfig)throws ServletException{
		this.filterConfig=filterConfig;
	  }
	  public void doFilter(ServletRequest req,ServletResponse res,FilterChain filterChain){
		try{
			HttpServletRequest request=(HttpServletRequest)req;
			HttpServletResponse response=(HttpServletResponse)res;
			HttpSession session=request.getSession();
			//code when login
			filterChain.doFilter(req,res);
			//code when logout
		}catch(IOException e){
			e.printStackTrace();
		}catch(ServletException e){
			e.printStackTrace();
		}
	  }
	  public void destroy(){
		  //put destroy string in log
		  //put your code
	  }
	}
	```
* 设置`web.xml`代码的模板（菜单式`windows–perference-myeclipse –files and editors–xml–xml templates`，使用的方法如1）
* 编写`filter`过滤器，功能是实现代码的转换，把客户端页面显示的编码转化为`gbk`，并且调试成功。（思考：`request`跟`response`执行`setCharacterEncoding`方法的区别）
* 研究大作业的题目，编写数据库文档、代码文件的目录，以及页面结构。

## 0x09 实训9 MVC和DAO 
* 实验目的：掌握MVC的概念和DAO架构代码的基本编写方法。
* 作业要求：
  * 最终内容打包成学号+姓名.rar格式
  * 上交到服务器
  * 可以通过www.w3school.com.cn或者baidu，google等网站寻求帮助来完成作业。
* 编写一个登录界面，输入学号和姓名，在数据库中进行验证，如果验证通过，则在另一个页面中显示顾客的姓名，要求使用`JavaBean`封装顾客信息，使用`DAO`和`VO`完成顾客的模糊查询。

## 0x0A 大作业  
* 背景：
  * 杭州言汇科技有限公司是一家知名的医疗器械公司，公司业务发展到一定程度以后需要制作一个官方网站。
  * 公司的官方网站需要制作的页面很多，需要巨大的工作量，其中界面设计人员、美工人员制作了一个包含大量静态页面的文件夹。然后需要项目团队的动态界面程序员进一步进行完善的工作。
  * 你作为项目团队的一个成员，分配到了一些简单的任务。

* 你分配到的任务如下：
  * ① 制作官方主页的首页，也就是静态页面中的`index.htm`，其他不需要你制作。
    * 把静态页面`index.htm`改成`index.jsp`。
    * 静态页面中公司简介`div`中，图片不变，文字介绍需要从数据库中读取该栏目的栏目描述。
    * 静态页面中公司新闻`div`中，图片不变，文字介绍需要从数据库中读取该栏目的栏目描述。然后显示4条（实际可能多于4条）对应此栏目的新闻记录（显示标题即可）
    * 静态页面中的`行业新闻` `div`，图片不变，标题改成`技术服务`，然后从数据库读取该栏目的文字介绍以及显示4条相应的新闻记录。
    * 联系我们的内容，保持不变，不需要做。
    * 静态页面中的`最新产品` `div`改成`产品介绍` `div`，然后从数据库中读取相应的新闻记录，图片是对应的图片路径，产品名称对应的是新闻标题。

  * ② 制作网站后台，关于网站后台的静态页面在`admin`文件夹下。
    * 首先通过`admin/login/login.html`，当用户点击登录以后，读取数据库的`users`表，如果用户名密码正确，则跳到`admin/web/main.html`，否则返回`login.html`。
    * 修改`left`中的栏目，修改成`用户管理`、`栏目管理`、`新闻管理`，三个功能点。
    * 点击用户管理的时候，中间的表格从数据库中读取信息，显示用户记录，然后完成`编辑`跟`删除`功能。
* 注意：也可以采用`admin1`文件夹的静态页面模板，功能如上，此模板中登录界面是`index.html`，主功能界面是`main.html`。

### 附录：使用到的数据库表如下：

①Lmenu（栏目表）

|数据项|数据类型|字段长度|说明|
|:------|:------|:------|:------|
|Id|int|<br>|编号|
|Lname|String|50|栏目名称|
|Ldescription|String|500|栏目描述|

数据内容

|编号|栏目名称|栏目描述|
|:------|:------|:------|
|1|公司介绍|公司介绍公司介绍|
|2|公司新闻|公司新闻公司新闻|
|3|产品介绍|产品介绍产品介绍|
|4|技术服务|技术服务技术服务|
|5|商业伙伴|商业伙伴商业伙伴|
|6|交流招聘|交流招聘交流招聘|
|7|合作频道|合作频道合作频道|
|8|联系我们|联系我们联系我们|

②News（新闻表）

|数据项|	数据类型|字段长度|说明|
|:------|:------|:------|:------|
|Id|Int|<br>|编号|
|ntitle|String|50|标题|
|ncontent|String|1000|内容|
|nurl|String|200|图片路径|
|father|Int|<br>|所属栏目|

数据内容

|编号|标题|内容|图片路径|所属栏目|
|:------|:------|:------|:------|:------|
|1|上海医疗企业改革|上海医疗企业改革内容上海医疗企业改革内容|<br>|2|
|2|国家出台医疗器械使用规范|国家出台医疗器械使用规范内容国家出台医疗器械使用规范内容|<br>|2|
|3|外贸企业越来越多进入国内市场|外贸企业越来越多进入国内市场内容外贸企业越来越多进入国内市场内容|<br>|2|
|4|碳水化合物饮食对身体的危害|	碳水化合物饮食对身体的危害内容碳水化合物饮食对身体的危害内容|<br>|2|
|5|世界卫生组织新标准|世界卫生组织新标准内容世界卫生组织新标准内容	|<br>|2|
|6|如何科学饮食|如何科学饮食内容如何科学饮食内容|<br>|4|
|7|学生与医疗体制|学生与医疗体制内容学生与医疗体制内容|<br>|4|
|8|医疗就业前景分析|医疗就业前景分析内容医疗就业前景分析内容|<br>|4|
|9|注射体液对身体的作用|	注射体液对身体的作用内容注射体液对身体的作用内容|<br>|4|
|10|产品1|产品1内容产品1内容|product/index_01.png|3|
|11|产品2|产品2内容产品2内容|product/index_01.png|3|
|12|产品3|产品3内容产品3内容|product/index_01.png|3|
|13|产品4|产品4内容产品4内容|product/index_01.png|3|

③users（用户表）

|数据项|	数据类型|	字段长度|	说明|
|:------|:------|:------|:------|
|Id|Int|<br>|编号|
|username|String|50|用户名|
|pwd|String|1000|密码|

数据内容

|编号|	用户名|	密码|
|:------|:------|:------|
|1|Zhangsan|123456|
|2|Lisi|123456|
|3|Wangwu|123456|



