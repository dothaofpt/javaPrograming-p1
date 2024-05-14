
package baitap06.dao;

import baitap05.model.Sach;
import baitap06.database.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SachDAO implements DAOInterface<Sach> {

    // Singleton pattern: Đảm bảo chỉ có một instance của SachDAO được tạo ra
    private static final SachDAO instance = new SachDAO();

    // Phương thức getInstance() trả về instance duy nhất của SachDAO
    public static SachDAO getInstance() {
        return instance;
    }

    // Khai báo các biến kết nối và statement
    private Connection con;
    private Statement st;

    // Constructor private để ngăn việc tạo instance từ bên ngoài


    @Override
    public int insert(Sach sach) {
        //b1: tao ket noi csdl
        Connection con= null;
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //b2: tao obj statement
        Statement st= null;
        try {
            st = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String sql = "INSERT INTO sach(id, tenSach, giaBan, namXuatBan) " +
                "VALUES (" + sach.getId() + ", '" + sach.getTenSach() + "', " + sach.getGiaBan() + ", " + sach.getNamXuatban() + ");";
        try {
            int ketQua=st.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//b4: xu li kq
        System.out.println("Bạn đã thực thi:" + sql);
        //b5:ngat ket noi
        JDBCUtil.closeConnection(con);
        try {
            return st.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    @Override
    public int update(Sach sach) {
        // Viết logic update sau
        return 0;
    }

    @Override
    public int delete(Sach sach) {
        // Viết logic delete sau
        return 0;
    }

    @Override
    public ArrayList<Sach> selectAll() {
        // Viết logic selectAll sau
        return null;
    }

    @Override
    public Sach selectById(Sach sach) {
        // Viết logic selectById sau
        return null;
    }

    @Override
    public ArrayList<Sach> selectByCondition(String condition) {
        // Viết logic selectByCondition sau
        return null;
    }
}
