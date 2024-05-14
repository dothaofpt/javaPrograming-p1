package session9.model;

import session9.entity.Customers;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<Customers> getAllCustomer() throws SQLException;
    public Customers findCustomerById(int id) throws SQLException;
    public Customers AddCustomer(Customers customer) throws SQLException;
}
