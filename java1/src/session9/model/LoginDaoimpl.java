
package session9.model;

import session9.entity.Users;

import java.sql.*;

public class LoginDaoimpl implements LoginDAO {
    //khởi tạo biến kết nối, interface Statement,PreparedStatement
    private Connection conn;
    private Statement stm = null;
    private PreparedStatement pstm = null;

    public LoginDaoimpl() throws SQLException {
        conn = MySQLConnectionDB.getMyConnection(); // Khởi tạo kết nối trong hàm khởi tạo
    }

    @Override
    public String checkLoginStatement(Users user) throws SQLException {
        //checkLogin vs interface Statement
        //khởi tạo ra 2 biến username , password và lấy dữ liệu từ method get
        String username = user.getUsername();
        String password = user.getPassword();
        //Khởi tạo biến query truy vấn đến dữ liệu của users trong dtb
        String query = "select username from users where username='" + username + "' and password like'" + password + "'";
        //tạo kết nối Statement
        stm = conn.createStatement();
        //ResultSet lưu trữ kq từ dtb trả về từ câu lệnh query
        ResultSet rs = stm.executeQuery(query);
        //rs  di chuyển đến từng ô trong 1 columns(username) khi trỏ đến ô có dữ liệu thì trả kq true,nếu ngc lại kết  thúc vòng lặp
        while (rs.next()) {
            System.out.println("Username is:" + rs.getString("username"));
            return rs.getString("username");
        }
        return null;
    }

    @Override
    public String checkLoginPreparedStatement(Users user) throws SQLException {
        //câu lệnh truy vấn
        String query = "select username from users where username like ? and password like ?";
        //câu lệnh kết nối
        pstm = conn.prepareStatement(query);
        //thay vì query và hiện luôn kq thì preparedStatement sẽ an toàn vì phải set index của mỗi 1 columns trong query
        pstm.setString(1, user.getUsername());
        pstm.setString(2, user.getPassword());
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            System.out.println("=============");
            System.out.println("username" + rs.getString(1));
            return rs.getString("username");
        }
        return "Not in the database";
    }
}
