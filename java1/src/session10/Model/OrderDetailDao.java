package session10.Model;

import session10.Entities.OrderDetail;

import java.sql.SQLException;
import java.util.List;

public interface OrderDetailDao {
    // Phương thức thêm một chi tiết đơn hàng mới
    void addOrderDetail(OrderDetail orderDetail) throws SQLException;

    // Phương thức cập nhật thông tin của một chi tiết đơn hàng
    void updateOrderDetail(OrderDetail orderDetail) throws SQLException;

    // Phương thức xóa một chi tiết đơn hàng
    void deleteOrderDetail(int orderDetailID)throws SQLException;

    // Phương thức lấy thông tin của một chi tiết đơn hàng dựa trên ID
    OrderDetail getOrderDetailByID(int orderDetailID)throws SQLException;

    // Phương thức lấy tất cả các chi tiết đơn hàng
    List<OrderDetail> getAllOrderDetails()throws SQLException;
}
