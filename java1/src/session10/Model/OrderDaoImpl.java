package session10.Model;

import session10.Entities.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDAO {
    private final Connection conn = MySQLConnectionDB.getMyConnection();
    private final String SQL_CREATE_ORDER = "INSERT INTO orders (orderDate, customerID, totalAmount, status) VALUES (?, ?, ?, ?)";
    private final String SQL_GET_ORDER_BY_ID = "SELECT * FROM orders WHERE orderID=?";
    private final String SQL_GET_ALL_ORDERS = "SELECT * FROM orders";
    private final String SQL_UPDATE_ORDER = "UPDATE orders SET orderDate=?, customerID=?, totalAmount=?, status=? WHERE orderID=?";
    PreparedStatement pstm = null;

    public OrderDaoImpl() throws SQLException {
    }

    @Override
    public boolean createOrder(Order order) throws SQLException {
        pstm = conn.prepareStatement(SQL_CREATE_ORDER, Statement.RETURN_GENERATED_KEYS);
        pstm.setDate(1, new Date(order.getOrderDate().getTime()));
        pstm.setInt(2, order.getCustomerID());
        pstm.setInt(3, order.getTotalAmount());
        pstm.setString(4, order.getStatus());
        int affectedRows = pstm.executeUpdate();
        ResultSet rs = pstm.getGeneratedKeys();
        if (rs.next()) {
            order.setOrderID(rs.getInt(1));
        }
        rs.close();
        pstm.close();
        return affectedRows > 0;
    }

    @Override
    public Order getOrderById(int orderId) throws SQLException {
        pstm = conn.prepareStatement(SQL_GET_ORDER_BY_ID);
        pstm.setInt(1, orderId);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            Order order = new Order();
            order.setOrderID(rs.getInt("orderID"));
            order.setOrderDate(rs.getDate("orderDate"));
            order.setCustomerID(rs.getInt("customerID"));
            order.setTotalAmount(rs.getInt("totalAmount"));
            order.setStatus(rs.getString("status"));
            return order;
        }
        return null;
    }

    @Override
    public List<Order> getAllOrders() throws SQLException {
        List<Order> orders = new ArrayList<>();
        pstm = conn.prepareStatement(SQL_GET_ALL_ORDERS);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            Order order = new Order();
            order.setOrderID(rs.getInt("orderID"));
            order.setOrderDate(rs.getDate("orderDate"));
            order.setCustomerID(rs.getInt("customerID"));
            order.setTotalAmount(rs.getInt("totalAmount"));
            order.setStatus(rs.getString("status"));
            orders.add(order);
        }
        rs.close();
        pstm.close();
        return orders;
    }

    @Override
    public boolean updateOrder(Order order) throws SQLException {
        pstm = conn.prepareStatement(SQL_UPDATE_ORDER);
        pstm.setDate(1, new Date(order.getOrderDate().getTime()));
        pstm.setInt(2, order.getCustomerID());
        pstm.setInt(3, order.getTotalAmount());
        pstm.setString(4, order.getStatus());
        pstm.setInt(5, order.getOrderID());
        int affectedRows = pstm.executeUpdate();
        pstm.close();
        return affectedRows > 0;
    }
}
