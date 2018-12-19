package servlet;

import dao.CustomerDAO;
import pojo.Customer;
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
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        CustomerDAO customerDAO = new CustomerDAO();
        Customer customer = new Customer();
        String studentNo = request.getParameter("studentNo");
        String name = request.getParameter("name");
        customer.setName(name);
        customer.setStudentNo(studentNo);
        try {
            if (customerDAO.query(customer)) {
                request.setAttribute("customer_no", customer.getStudentNo());
                request.setAttribute("customer_name", customer.getName());
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
