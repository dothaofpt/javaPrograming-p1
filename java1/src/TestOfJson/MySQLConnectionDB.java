
package TestOfJson;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MySQLConnectionDB {
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/manageStudent";
   public static final String JDBC_USER = "root";
  public static final String JDBC_PASSWORD = "";

    public static List<Student> getStudentFromDatabase() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM student")) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                String email = resultSet.getString("email");
            int phone = resultSet.getInt("phone");
                Date DOB = resultSet.getDate("DOB");
                students.add(new Student(id, name, address, email, phone, DOB));
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Ghi log ngoại lệ
        }
        return students;
    }
}
