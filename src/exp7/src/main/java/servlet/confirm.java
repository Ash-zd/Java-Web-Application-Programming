package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Ash
 * @date 2018/11/29 13:46
 */
public class confirm extends HttpServlet {
    public confirm() {
        super();
    }

    @Override
    public void destroy() {
        super.destroy();
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.process(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<a href='/exp7_Web_exploded/confirm'>查看学生</a>");
        out.flush();
        out.close();
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
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
            String t = 5 + ";URL="+"/exp7_Web_exploded/new.jsp";
            resp.setHeader("Refresh", t);
        }
        out.flush();
        out.close();
    }

}
