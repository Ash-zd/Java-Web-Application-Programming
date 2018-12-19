package dao;

import pojo.Customer;
import util.DBConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ash
 * @date 2018/12/10 23:21
 */
public class CustomerDAO {
    public boolean query(Customer customer) throws Exception {
        try {
            Connection connection = DBConnect.getConnection();
            String sql = "SELECT name FROM student WHERE studentNo = " + customer.getStudentNo();
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);
            String resultName = null;
            while (resultSet.next()) {
                resultName = resultSet.getString("name");
            }
            if (resultName.equals(customer.getName())) {
                resultSet.close();
                stmt.close();
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }



}
