package pratice.model;

import pratice.entities.OrderDetail;

import java.sql.*;
import java.util.Date;
import java.util.List;

public class OrderManagement {
    //method tạo 1 đơn hàng nhận các thông tin về mã khách ,kiểu thanh toán,chi tiết đơn hàng
    public void createOrder(int customer_id,String payment_type, List<OrderDetail> orderDetails) throws SQLException {
        //kết nối đến cơ sở dữ liệu sử dụng trong phương thức
        Connection conn=MySQLConnectionDB.getMyConnection();
        PreparedStatement pstm=null;
        ResultSet rs=null;
        // tự động commit về false để đánh dấu bắt đầu điểm giao dịch
        conn.setAutoCommit(false);//cho nay danh dau diem bat dau cua giao dich
        //thực hiện truy vấn thêm dữ liệu của order và orderDetail trong dtb
        String orderQuery="insert into order (customer_id,create_at,update_at,payment_type) values(?,?,?,?)";
        String orderDetailQuery="insert into order_details(order_id,update_at,product_id,price)values(?,?,?,?,?)";
        //Inser doi voi bang co khoa tang tu dong
        pstm =conn.prepareStatement(orderQuery,PreparedStatement.RETURN_GENERATED_KEYS);
        pstm.setInt(1,1);
        pstm.setTimestamp(2,new java.sql.Timestamp(new Date().getTime()));
        pstm.setTimestamp(3,new java.sql.Timestamp(new Date().getTime()));
        pstm.setString(4,"Credit card");
        pstm.executeUpdate();
        //Lấy ra tất cả các khóa chính tự sinh được tạo ra trong qt thực thi câu lệnh sql
        rs=pstm.getGeneratedKeys();
//       kiểm tra xem ResultSet có bất kỳ bản ghi nào không và nếu có, lấy
//       giá trị của khóa chính tự sinh từ ResultSet và gán vào biến orderId.
//        -1 cho orderId có thể được sử dụng như một biểu thị cho việc không có giá trị orderId
//        nào được xác định hoặc trả về từ câu lệnh SQL.
        int orderId=-1;
        if(rs.next()){
            orderId=rs.getInt(1);

        }
        // Dòng này kiểm tra xem biến orderId đã được thiết lập hay chưa
        //nếu có chèn dữ liệu vào bảng order_details
        if(orderId !=-1){
            pstm=conn.prepareStatement(orderDetailQuery);
            for(OrderDetail orderDetail:orderDetails)
            {
                pstm.setInt(1,orderId);
                pstm.setTimestamp(2,new java.sql.Timestamp(new Date().getTime()));
                //...
                pstm.addBatch();//Cu co 1 chi tiet don hanh thi dc them 1 batch
            }
            //inset nhieu ban ghi cung luc
            pstm.executeBatch();

        }

        conn.commit();//danh dau la giao dich thanh cong
    }
}
