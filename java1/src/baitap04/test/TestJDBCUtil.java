
package baitap04.test;

import baitap03.database.JDBCUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCUtil {
    public static void main(String[] args) throws SQLException {
        //b1: getConnect
        Connection connection= null;
        try {
            connection = JDBCUtil.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // b2:create to object statement
        Statement st=connection.createStatement();
        //b3:do code sql
        String sql= "INSERT INTO test (name, id, password_)\n" +
                "VALUES ('Nguyen Van A', 3, 123456),\n" +
                "       ('Tran Thi B', 4, 654321);";
     int check = st.executeUpdate(sql);
     //b4:handle result
        System.out.println("Lines change:" + check);
        if(check>0){
            System.out.println("Them du lieu thanh cong");
        }else{
            System.out.println("them du lieu khong thanh cong");
        }
        //b5:closeConnect
        JDBCUtil.closeConnection(connection);
    }
}
