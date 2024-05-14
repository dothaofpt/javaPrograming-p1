
package session10.Controller;

import session10.Entities.Order;
import session10.Model.OrderDAO;
import session10.Model.OrderDaoImpl;

import java.sql.SQLException;
import java.util.List;

public class OrderController {
    private OrderDAO orderDAO;

    public OrderController() throws SQLException {
        orderDAO = new OrderDaoImpl();
    }

    public boolean createOrder(Order order) throws SQLException {
        return orderDAO.createOrder(order);
    }

    public Order getOrderById(int orderId) throws SQLException {
        return orderDAO.getOrderById(orderId);
    }

    public List<Order> getAllOrders() throws SQLException {
        return orderDAO.getAllOrders();
    }

    public boolean updateOrder(Order order) throws SQLException {
        return orderDAO.updateOrder(order);
    }
}
