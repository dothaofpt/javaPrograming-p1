package lap8;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void demoLinkedList() {
        // Khởi tạo LinkedList
        LinkedList<String> Student = new LinkedList<>();

        // Thêm danh sách sinh viên
        Student.add("Ngoc");
        Student.add("Thanh");
        Student.add("Tung");
        Student.add("Binh");
        Student.add("Trong");

        // Xóa phần tử đầu tiên và cuối cùng khỏi danh sách
        Student.poll();
        Student.pollLast();

        // Hiển thị danh sách sinh viên
        showList(Student);
    }

    public static void showList(LinkedList<String> list) {
        for (String student : list) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        demoLinkedList();
    }
}

