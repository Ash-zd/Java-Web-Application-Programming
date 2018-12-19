package servlet;

import util.DBConnect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {

    public Servlet() {
        super();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            this.process(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            String studentNo = request.getParameter("studentNo");
            String name = request.getParameter("name");

            Connection connection = DBConnect.getConnection();
            String sql = "SELECT name FROM student WHERE studentNo = " + studentNo;
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);
            String resultName = null;
            while (resultSet.next()) {
                resultName = resultSet.getString("name");
            }
            if (resultName.equals(name)) {
                out.println("<h1>check successful.</h1>");
            } else {
                out.println("<h1>check unsuccessful.</h1>");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
