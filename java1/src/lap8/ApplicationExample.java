
package lap8;

import java.util.ArrayList;

public class ApplicationExample {
    public static void main(String[] args) {
        Student student = new Student(1, "Ngoc", 20);
        ArrayList<Student> listStudents = new ArrayList<>();
        //Thêm sinh viên vào danh sách
        listStudents.add(student);
        listStudents.add(new Student(3, "Binh", 70));
        listStudents.add(new Student(4, "Binh", 70));
        listStudents.add(new Student(5, "Binh", 70));
        listStudents.add(new Student(6, "Binh", 70));
        listStudents.add(new Student(7, "Binh", 70));

        System.out.println("Danh sách sinh viên:");
        for (Student stu : listStudents) {
            System.out.println(stu);
        }

        //Tìm kiếm và xóa sinh viên có tên "Binh"
        ArrayList<Student> studentsToRemove = new ArrayList<>();
        System.out.println("Tìm kiếm sinh viên:");
        for (Student stu : listStudents) {
            if (stu.getName().equals("Binh")) {
                System.out.println("Sinh viên cần xóa: " + stu);
                studentsToRemove.add(stu);
            }
        }

        //Xóa sinh viên được tìm thấy
        for (Student stu : studentsToRemove) {
            listStudents.remove(stu);
        }

        System.out.println("Danh sách sau khi xóa sinh viên có tên là 'Binh':");
        for (Student stu : listStudents) {
            System.out.println(stu);
        }
    }
}
