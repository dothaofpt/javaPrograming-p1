package TestOfJson;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static TestOfJson.MySQLConnectionDB.*;

public class StudentToJsonReadbyEmail {
    public static List<Student> searchStudentByEmail(String email) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM student WHERE email LIKE ?")) {
            statement.setString(1, "%" + email + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String address = resultSet.getString("address");
                    String studentEmail = resultSet.getString("email");
                    int phone = resultSet.getInt("phone");
                    Date DOB = resultSet.getDate("DOB");
                    students.add(new Student(id, name, address, studentEmail, phone, DOB));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Log the exception
        }
        return students;
    }

}
