
package baitap03.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection() throws SQLException {
        Connection c = null;

        // Sử dụng driver mới
        try {
            // Định nghĩa URL kết nối chính xác
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "";

            // Tạo kết nối
            c = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return c;
    }

    public static void closeConnection(Connection c) {
        // Đóng kết nối nếu không null
        if (c != null) {
            try {
                c.close();
            } catch (Exception e) {
e.printStackTrace();
            }
        }
    }
    public static void printInfo(Connection c){
        if(c!= null){
            try {
                DatabaseMetaData mtdt = c.getMetaData();
                System.out.println(mtdt.getDatabaseProductName());
                System.out.println(mtdt.getDatabaseProductVersion());
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

