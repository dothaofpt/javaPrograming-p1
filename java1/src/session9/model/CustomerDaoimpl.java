package session9.model;

import session9.entity.Customers;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDaoimpl implements CustomerDAO{
    private Connection conn; // Không cần khai báo final ở đây
    private Statement stm = null;
    private PreparedStatement pstm = null;


    public CustomerDaoimpl()throws SQLException{
        conn=MySQLConnectionDB.getMyConnection();
    }
    @Override
    public ArrayList<Customers> getAllCustomer() throws SQLException{
        ArrayList<Customers> customersList = new ArrayList<>();


            // Tạo câu lệnh SQL SELECT
            String query = "SELECT * FROM Customers";

            // Thực thi câu lệnh SQL
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            // Duyệt qua các hàng và tạo đối tượng Customers
            while (rs.next()) {
                Customers customer = new Customers();
                customer.setFirst_name(rs.getString("first_name"));
                customer.setLast_name(rs.getString("last_name"));
              customer.setEmail(rs.getString("email"));
                customersList.add(customer);
            }

            // Đóng kết nối và trả về danh sách khách hàng
            rs.close();
            stm.close();
            conn.close();

        return customersList;
    }


    @Override
    public Customers findCustomerById(int id) throws SQLException {
        // Khởi tạo đối tượng Customers để lưu thông tin khách hàng
        Customers customer = null;

        // Tạo câu lệnh SQL SELECT để tìm kiếm khách hàng dựa trên ID
        String query = "SELECT * FROM customers WHERE customer_id = ?";

        // Sử dụng PreparedStatement để tránh lỗi SQL injection và gán tham số cho câu lệnh SQL
        pstm = conn.prepareStatement(query);
        pstm.setInt(1, id);

        // Thực thi câu lệnh SQL
        ResultSet rs = pstm.executeQuery();

        // Kiểm tra xem có khách hàng nào được tìm thấy không
        if (rs.next()) {
            // Khởi tạo đối tượng Customers và đặt thông tin từ kết quả truy vấn
            customer = new Customers();
            customer.setCustomer_id(rs.getInt("customer_id"));
            customer.setFirst_name(rs.getString("first_name"));
            customer.setLast_name(rs.getString("last_name"));
            customer.setEmail(rs.getString("email"));
            // Nếu có các trường thông tin khác, bạn cũng có thể đặt ở đây
        }

        // Đóng ResultSet và PreparedStatement
        rs.close();
        pstm.close();

        // Trả về đối tượng Customers hoặc null nếu không tìm thấy
        return customer;
    }

    @Override
    public Customers AddCustomer(Customers customer) throws SQLException {
        //khoi tao doi tuong customer de luu thong tin khach hang
        Customers customers=new Customers();
        //tao cau lenh truy van
        String query="insert into customer values(?,?,?,?)";
        pstm= conn.prepareStatement(query);
        pstm.setInt(1,5);
        pstm.setString(2,"tran");
        pstm.setString(3,"NGOC BINH");
        pstm.setString(4,"ngoc@fpt.edu.vn");
        ResultSet rs= pstm.executeQuery();
        if (rs.next()) {
            // Khởi tạo đối tượng Customers và đặt thông tin từ kết quả truy vấn
            customer = new Customers();
            customer.setCustomer_id(rs.getInt("customer_id"));
            customer.setFirst_name(rs.getString("first_name"));
            customer.setLast_name(rs.getString("last_name"));
            customer.setEmail(rs.getString("email"));
            // Nếu có các trường thông tin khác, bạn cũng có thể đặt ở đây
        }

        // Đóng ResultSet và PreparedStatement
        rs.close();
        pstm.close();

        // Trả về đối tượng Customers hoặc null nếu không tìm thấy
        return customer;
    }




}

