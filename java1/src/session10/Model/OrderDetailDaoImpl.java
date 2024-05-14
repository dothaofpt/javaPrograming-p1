
package session10.Model;

import session10.Entities.OrderDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailDaoImpl implements OrderDetailDao {
    private final Connection conn = MySQLConnectionDB.getMyConnection();
    private final String SQL_GET_ALL_ORDER_DETAILS = "SELECT * FROM orderdetail";
    private final String SQL_ADD_ORDER_DETAIL = "INSERT INTO orderdetail (orderID, productID, quantity, unitPrice) VALUES (?, ?, ?, ?)";
    private final String SQL_UPDATE_ORDER_DETAIL = "UPDATE orderdetail SET orderID = ?, productID = ?, quantity = ?, unitPrice = ? WHERE orderDetailID = ?";
    private final String SQL_DELETE_ORDER_DETAIL = "DELETE FROM orderdetail WHERE orderDetailID = ?";
    private final String SQL_GET_ORDER_DETAIL_BY_ID = "SELECT * FROM orderdetail WHERE orderDetailID = ?";
    PreparedStatement pstm = null;

    public OrderDetailDaoImpl() throws SQLException {
    }

    @Override
    public List<OrderDetail> getAllOrderDetails() throws SQLException {
        List<OrderDetail> orderDetails = new ArrayList<>();
        pstm = conn.prepareStatement(SQL_GET_ALL_ORDER_DETAILS);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            OrderDetail orderDetail = new OrderDetail(
                    rs.getInt("orderDetailID"),
                    rs.getInt("orderID"),
                    rs.getInt("productID"),
                    rs.getInt("quantity"),
                    rs.getInt("unitPrice")
            );
            orderDetails.add(orderDetail);
        }
        rs.close();
        pstm.close();
        return orderDetails;
    }

    @Override
    public void addOrderDetail(OrderDetail orderDetail) throws SQLException {
        pstm = conn.prepareStatement(SQL_ADD_ORDER_DETAIL);
        pstm.setInt(1, orderDetail.getOrderID());
        pstm.setInt(2, orderDetail.getProductID());
        pstm.setInt(3, orderDetail.getQuantity());
        pstm.setInt(4, orderDetail.getUnitPrice());
        pstm.executeUpdate();
        pstm.close();
    }

    @Override
    public void updateOrderDetail(OrderDetail orderDetail) throws SQLException {
        pstm = conn.prepareStatement(SQL_UPDATE_ORDER_DETAIL);
        pstm.setInt(1, orderDetail.getOrderID());
        pstm.setInt(2, orderDetail.getProductID());
        pstm.setInt(3, orderDetail.getQuantity());
        pstm.setInt(4, orderDetail.getUnitPrice());
        pstm.setInt(5, orderDetail.getOrderDetailID());
        pstm.executeUpdate();
        pstm.close();
    }

    @Override
    public void deleteOrderDetail(int orderDetailID) throws SQLException {
        pstm = conn.prepareStatement(SQL_DELETE_ORDER_DETAIL);
        pstm.setInt(1, orderDetailID);
        pstm.executeUpdate();
        pstm.close();
    }

    @Override
    public OrderDetail getOrderDetailByID(int orderDetailID) throws SQLException {
        pstm = conn.prepareStatement(SQL_GET_ORDER_DETAIL_BY_ID);
        pstm.setInt(1, orderDetailID);
        ResultSet rs = pstm.executeQuery();
        OrderDetail orderDetail = null;
        if (rs.next()) {
            orderDetail = new OrderDetail(
                    rs.getInt("orderDetailID"),
                    rs.getInt("orderID"),
                    rs.getInt("productID"),
                    rs.getInt("quantity"),
                    rs.getInt("unitPrice")
            );
        }
        rs.close();
        pstm.close();
        return orderDetail;
    }
}
