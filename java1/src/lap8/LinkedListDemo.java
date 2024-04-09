package lap8;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void demoLinkedList() {
        // Khởi tạo LinkedList
        LinkedList<String> student = new LinkedList<>();

        // Thêm danh sách sinh viên
        student.add("Ngoc");
        student.add("Thanh");
        student.add("Tung");
        student.add("Binh");
        student.add("Trong");

        // Xóa phần tử đầu tiên và cuối cùng khỏi danh sách
        student.poll();
        student.pollLast();

        // Hiển thị danh sách sinh viên
        showList(student);
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

