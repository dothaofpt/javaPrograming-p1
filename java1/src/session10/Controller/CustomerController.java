package session10.Controller;

import session10.Entities.Customer;
import session10.Model.CustomerDAO;
import session10.Model.CustomerDaoImpl;

import java.sql.SQLException;
import java.util.List;

public class CustomerController {
    private final CustomerDAO customerDAO;

    public CustomerController() throws SQLException {
        customerDAO = new CustomerDaoImpl();
    }

    public List<Customer> getAllCustomers() throws SQLException {
        return customerDAO.getAllCustomers();
    }

    public void addCustomer(Customer customer) throws SQLException {
        customerDAO.addCustomer(customer);
    }

    public void updateCustomer(Customer customer) throws SQLException {
        customerDAO.updateCustomer(customer);
    }
}



