package MyMvc;
import MyMvc.Controller.StudentController;
import MyMvc.Model.Student;
import MyMvc.View.StudentView;
public class MVCPatternDemo {
    public static void main(String[] args) {
        // Tạo một đối tượng sinh viên
        Student model = retrieveStudentFromDatabase();

        // Tạo một đối tượng View để hiển thị thông tin sinh viên
        StudentView view = new StudentView();

        // Tạo một đối tượng Controller và truyền vào Model và View
        StudentController controller = new StudentController(model, view);

        // Cập nhật View để hiển thị thông tin sinh viên
        controller.updateView();

        // Thay đổi Model
        controller.setStudentName("John");

        // Cập nhật View lại sau khi thay đổi Model
        controller.updateView();
    }

    // Phương thức giả lập việc lấy thông tin sinh viên từ cơ sở dữ liệu
    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}