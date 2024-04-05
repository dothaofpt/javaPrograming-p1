package ss3;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {

// Tại đây là chương trình không muốn sử dụng để xử lý mà ta sẽ đẩy trách nghiệm cho phương thức khác
//static  có thể gọi luôn method mà không cần tạo ra đối tượng
public static int inputAge() throws IOException {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Nhap tuoi cua ban: ");
    int age=scanner.nextInt();

    if(age<=0){
        throw new IOException("tuoi khong dc nho hon 0");
    }
    return age;
}
public static void getAge() {
    try{
        int age =inputAge();
        System.out.println("Tuoi vua nhap: ");

    }catch (Exception e){
        System.err.println("tuoi khong phu hop");
    }
}
}