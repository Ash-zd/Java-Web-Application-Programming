package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Ash
 * @date 2018/11/29 13:46
 */
public class list extends HttpServlet {
    public list() {
        super();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.process(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<a href='/exp7_Web_exploded/new.jsp'>增加学生</a>");
        out.flush();
        out.close();
    }
    private void process(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/mydatabase","root","123456");
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM students");
            out.println("<table border>");
            out.println("<tr><td>id</td>username</td><td>roles</td><td>uid</td><td>link</td><td>pwd</td></tr>");
            while(rs.next())
            {    out.println("<tr>");
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
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
