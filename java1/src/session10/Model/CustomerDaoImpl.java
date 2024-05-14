package session10.Model;

import session10.Entities.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDAO {
    private final Connection conn = MySQLConnectionDB.getMyConnection();
    private final String SQL_GET_ALL_CUSTOMERS = "SELECT * FROM customers";
    private final String SQL_ADD_CUSTOMER = "INSERT INTO customers (customerName, customerPhone, customerEmail) VALUES (?, ?, ?)";
    private final String SQL_UPDATE_CUSTOMER = "UPDATE customers SET customerName = ?, customerPhone = ?, customerEmail = ? WHERE customerID = ?";
    PreparedStatement pstm = null;

    public CustomerDaoImpl() throws SQLException {
    }

    @Override
    public List<Customer> getAllCustomers() throws SQLException {
        List<Customer> customers = new ArrayList<>();
        pstm = conn.prepareStatement(SQL_GET_ALL_CUSTOMERS);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            Customer customer = new Customer();
            customer.setCustomerID(rs.getInt("customerID"));
            customer.setCustomerName(rs.getString("customerName"));
            customer.setCustomerPhone(rs.getInt("customerPhone"));
            customer.setCustomerEmail(rs.getString("customerEmail"));
            customers.add(customer);
        }
        rs.close();
        pstm.close();
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) throws SQLException {
        pstm = conn.prepareStatement(SQL_ADD_CUSTOMER);
        pstm.setString(1, customer.getCustomerName());
        pstm.setInt(2, customer.getCustomerPhone());
        pstm.setString(3, customer.getCustomerEmail());
        pstm.executeUpdate();
        pstm.close();
    }

    @Override
    public void updateCustomer(Customer customer) throws SQLException {
        String SQL_UPDATE_CUSTOMER = "UPDATE customers SET customerName = ?, customerPhone = ?, customerEmail = ? WHERE customerID = ?";
        pstm = conn.prepareStatement(SQL_UPDATE_CUSTOMER);
        pstm.setString(1, customer.getCustomerName());
        pstm.setInt(2, customer.getCustomerPhone());
        pstm.setString(3, customer.getCustomerEmail());
        pstm.setInt(4, customer.getCustomerID());
        pstm.executeUpdate();
        pstm.close();
    }
}

