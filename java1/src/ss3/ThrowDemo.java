package ss3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
    //ví dụ về throw demo

    public static void validate() {
        try {
            //noi code
            int age = inputAge();
            //Khi người dùng nhập tuổi
            //dưới 18 hiện message lỗi
            if (age < 18) {
                throw new ArithmeticException("your age not validate");
            } else {
                //trên 18 thì okkkk
                System.out.println("Your age is validate");
            }
            //nếu không phair nhập số thì in ra message này
        } catch (InputMismatchException e) {
            System.out.println("Input age not valid!!!");
        }

    }


    public static int inputAge() {
        //scanner giúp cho người dùng có thể nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your age: ");
        int age = scanner.nextInt();
        return age;
    }
}


