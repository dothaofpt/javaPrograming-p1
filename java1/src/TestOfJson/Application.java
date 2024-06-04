
package TestOfJson;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException, SQLException {
       // List<Student> students = MySQLConnectionDB.getStudentFromDatabase();
        //List<Student> students=StudentToJsonRead.searchStudentByName("minh");
        List<Student> students=StudentToJsonReadbyEmail.searchStudentByEmail("thanh@");
        if (students.isEmpty()) {
            System.out.println("Không tìm thấy dữ liệu sinh viên trong cơ sở dữ liệu.");
        } else {
            String filePath = "student.json";
            StudentToJsonFileWrite.writeStudentToJsonFile(students, filePath);
            System.out.println("Dữ liệu đã được ghi vào: " + filePath);
        }


    }


}
