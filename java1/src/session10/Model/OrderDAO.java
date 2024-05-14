
package session10.Model;

import session10.Entities.Order;

import java.sql.SQLException;
import java.util.List;

public interface OrderDAO {
    boolean createOrder(Order order) throws SQLException;

    Order getOrderById(int orderId) throws SQLException;

    List<Order> getAllOrders() throws SQLException;

    boolean updateOrder(Order order) throws SQLException;
}
