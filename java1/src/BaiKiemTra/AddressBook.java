package BaiKiemTra;

import java.util.ArrayList;
import java.util.Scanner;

//làm y hệt form menu
public class AddressBook implements Address_Book{
    //tạo mảng arraysList lưu trữ đối tượng
    private ArrayList<Contact> contacts;
    //Scanner nhập dữ liệu từ bàn phím`
    private Scanner scanner;

    //constructor
    public AddressBook() {
        contacts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }


    //trong method addContact chỉ cần nhập dữ liệu của mỗi
    //một field trong class Contact và tạo 1 obj mới lưu nó
    //rồi gọi method add của ArrayList để thêm 1 phần tử vào mảng
    public void addContact() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập công ty:");
        String company = scanner.nextLine();
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
       int phone = Integer.parseInt(scanner.nextLine());

        Contact contact = new Contact(name, company, email, phone);
        contacts.add(contact);

        System.out.println("Thêm liên lạc thành công!");
    }

    public void findContactByNumber() {
        System.out.println("Nhập tên  tìm kiếm:");
        String name = scanner.nextLine();
        //thường dùng boolean false:để khởi tạo gt ban đầu
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Số điện thoại: " + contact.getPhone());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy liên lạc!");
        }
    }

    //dùng for để hiện thị ds liên lạc
    public void displayContacts() {
        System.out.println("Danh sách liên lạc:");
        for (Contact contact : contacts) {
            System.out.println("Tên: " + contact.getName());
            System.out.println("Công ty: " + contact.getCompany());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("Số điện thoại: " + contact.getPhone());
            System.out.println();
        }
    }

    //dùng while  và switch-case để tạo 1 menu như class View trong Mvc

    public void start() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Thêm liên lạc mới");
            System.out.println("2. Tìm kiếm liên lạc theo tên");
            System.out.println("3. Hiển thị danh sách liên lạc");
            System.out.println("4. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContactByNumber();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    System.out.println("Rời khỏi chương trình...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    public static void main(String[] args) {
        //tạo 1 đối tượng  AddressBook mới
        AddressBook addressBooks = new AddressBook();
        //chạy chương trình
        addressBooks.start();
    }
}

