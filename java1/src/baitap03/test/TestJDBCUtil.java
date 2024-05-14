
package baitap03.test;

import baitap03.database.JDBCUtil;
import java.sql.Connection;
import java.sql.SQLException;

public class TestJDBCUtil {
    public static void main(String[] args) {
        // Sử dụng try-with-resources để tự động quản lý việc đóng kết nối
        try (Connection connection = JDBCUtil.getConnection()) {
            // In ra kết nối để kiểm tra
            System.out.println("Kết nối: " + connection);

            // Thực hiện các công việc khác với kết nối (nếu cần)

        } catch (SQLException e) {
            // Xử lý ngoại lệ nếu xảy ra
            System.err.println("Lỗi khi kết nối: " + e.getMessage());
            e.printStackTrace();
        }
        // Kết nối sẽ được tự động đóng khi khối try kết thúc
    }
}
