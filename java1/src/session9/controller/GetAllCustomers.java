package session9.controller;

import session9.entity.Customers;
import session9.model.CustomerDaoimpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class GetAllCustomers {
    static CustomerDaoimpl customerDaoimpl;

    static {
        try {
            customerDaoimpl = new CustomerDaoimpl();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public GetAllCustomers() throws SQLException {
    }

    public static ArrayList<Customers> getAllCustomersStatementController(Customers customers) throws SQLException {
        ArrayList<Customers> message = customerDaoimpl.getAllCustomer();
        return message;
    }

    public String getAllCustomersStatementFindCustomerById(int customerId) throws SQLException {
        // Gọi phương thức findCustomerById từ đối tượng customerDaoimpl và truyền vào ID của khách hàng
        Customers foundCustomer = customerDaoimpl.findCustomerById(customerId);

        // Kiểm tra xem khách hàng có được tìm thấy không
        if (foundCustomer != null) {
            // Nếu tìm thấy, trả về thông tin của khách hàng
            return "Customer found: " + foundCustomer.getFirst_name() + " " + foundCustomer.getLast_name() + ", Email: " + foundCustomer.getEmail();
        } else {
            // Nếu không tìm thấy, trả về thông báo lỗi
            return "Customer with ID " + customerId + " not found!";
        }
    }
}

