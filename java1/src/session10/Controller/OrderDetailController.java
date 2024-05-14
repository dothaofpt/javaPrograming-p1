
package session10.Controller;

import session10.Entities.OrderDetail;
import session10.Model.OrderDetailDao;
import session10.Model.OrderDetailDaoImpl;

import java.sql.SQLException;
import java.util.List;

public class OrderDetailController {
    private final OrderDetailDao orderDetailDao;

    public OrderDetailController() throws SQLException {
        this.orderDetailDao = new OrderDetailDaoImpl();
    }

    // Phương thức để lấy tất cả các chi tiết đơn hàng
    public List<OrderDetail> getAllOrderDetails() throws SQLException {
        return orderDetailDao.getAllOrderDetails();
    }

    // Phương thức để thêm một chi tiết đơn hàng mới
    public void addOrderDetail(OrderDetail orderDetail) throws SQLException {
        orderDetailDao.addOrderDetail(orderDetail);
    }

    // Phương thức để cập nhật thông tin của một chi tiết đơn hàng
    public void updateOrderDetail(OrderDetail orderDetail) throws SQLException {
        orderDetailDao.updateOrderDetail(orderDetail);
    }

    // Phương thức để xóa một chi tiết đơn hàng
    public void deleteOrderDetail(int orderDetailID) throws SQLException {
        orderDetailDao.deleteOrderDetail(orderDetailID);
    }

    // Phương thức để lấy thông tin của một chi tiết đơn hàng dựa trên ID
    public OrderDetail getOrderDetailByID(int orderDetailID) throws SQLException {
        return orderDetailDao.getOrderDetailByID(orderDetailID);
    }
}
