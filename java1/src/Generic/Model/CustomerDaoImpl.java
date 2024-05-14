package Generic.Model;

import Generic.Entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CustomerDaoImpl implements GenericDAO<Customer> {
    // khởi tạo  field kết nối đến dtb
    private final Connection conn = MySQLConnectionDB.getMyConnection();
    //khởi tạo các fields truy vấn đến cơ sở dữ liệu
    private final String SQL_GET_ALL_CUSTOMERS = "SELECT * FROM customers";
    private final String SQL_ADD_CUSTOMER = "INSERT INTO customers (customerName, customerPhone, customerEmail) VALUES (?, ?, ?)";
    private final String SQL_UPDATE_CUSTOMER = "UPDATE customers SET customerName = ?, customerPhone = ?, customerEmail = ? WHERE customerID = ?";
    PreparedStatement pstm = null;
    //tạo constructor rỗng

    public CustomerDaoImpl() throws SQLException {
    }



    @Override
    public List<Customer> getAll() throws SQLException {
        //b1:tạo 1 mảng mới để lưu danh sách khách hàng đã cso trong dtb
        List<Customer> customers = new ArrayList<>();
        // b2:kết nối đến csdl và sd method prepareStatement gọi câu lệnh truy vấn
        pstm = conn.prepareStatement(SQL_GET_ALL_CUSTOMERS);
        // b3: tạo biến rs để lưu  khách hàng
        ResultSet rs = pstm.executeQuery();
        //b4: dùng vòng lặp để lấy ra các fields của entity customers
        while (rs.next()) {
            Customer customer = new Customer(
                    rs.getInt("customerID"),
                    rs.getString("customerName"),
                    rs.getInt("customerPhone"),
                    rs.getString("customerEmail")
            );
            //mỗi 1 lần lấy khách hàng sẽ thêm vào danh sách list
            customers.add(customer);
        }
        //Đóng kết nối
        rs.close();
        pstm.close();
        return customers;
    }

    @Override
    public void add(Customer customer) throws SQLException {
        //b1: kết nối,thực thi truy vấn
        pstm = conn.prepareStatement(SQL_ADD_CUSTOMER);
        //b2:thiết lập các gt của mỗi field trong entity customers
        pstm.setString(1, customer.getCustomerName());
        pstm.setInt(2, customer.getCustomerPhone());
        pstm.setString(3, customer.getCustomerEmail());
        //b3: cập nhật dtb
        pstm.executeUpdate();
        //b4: đóng kết nối
        pstm.close();
    }
    @Override
    public void update(Customer customer) throws SQLException {
        // Kiểm tra xem ID của khách hàng có hợp lệ không
        if (customer.getCustomerID() <= 0) {
            System.out.println("Invalid customer ID.");
            return;
        }

        // Kết nối đến cơ sở dữ liệu
        PreparedStatement pstm = conn.prepareStatement(SQL_UPDATE_CUSTOMER);
            // Thiết lập các giá trị cho truy vấn
            pstm.setString(1, customer.getCustomerName());
            pstm.setInt(2, customer.getCustomerPhone());
            pstm.setString(3, customer.getCustomerEmail());
            pstm.setInt(4, customer.getCustomerID());

            // Thực thi truy vấn cập nhật
            pstm.executeUpdate();
            System.out.println("Customer information updated successfully.");

    }



}