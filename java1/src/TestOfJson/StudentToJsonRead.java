package TestOfJson;

import TestOfJson.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static TestOfJson.MySQLConnectionDB.*;

public class StudentToJsonRead{
    public static List<Student> searchStudentByName(String name) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM student WHERE name LIKE ?")) {
            statement.setString(1, "%"
                    + name + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String studentName = resultSet.getString("name");
                    String address = resultSet.getString("address");
                    String email = resultSet.getString("email");
                    int phone = resultSet.getInt("phone");
                    Date DOB = resultSet.getDate("DOB");
                    students.add(new Student(id, studentName, address, email, phone, DOB));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Log the exception
        }
        return students;
    }
}
