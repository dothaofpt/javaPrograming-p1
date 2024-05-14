package session8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {
    public static void main(String[] args) throws SQLException {
        //get connection
        Connection connection = MySQLConnectionDB.getMyConnection();
        // Create Query(sql engine)
        String query = "select * from customers where customer_id = ? and first_name like ?";
        //create PreparedStatement
        PreparedStatement pstmt = connection.prepareStatement(query);
        //gan gia tri theo thu tu
        pstmt.setInt(1, 1);
        pstmt.setString(2, "truong");

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println("===============");
            System.out.println("ID: " + rs.getInt(1));
            System.out.println("First Name: " + rs.getString(2));
            System.out.println("Last Name: " + rs.getString(3));
            System.out.println("email: " + rs.getString(4));
        }
        connection.close();
    }
}
