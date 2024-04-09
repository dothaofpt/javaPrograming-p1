

package java1.src.session5;

import java.util.Scanner;

public class ApplicationDemo {
    public static void main(String[] args) {
        // tạo obj scanner giúp cho nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        // tạo obj integerArrayDemo
        IntegerArrayDemo integerArrayDemo = new IntegerArrayDemo();
        //in ra dòng chữ có bao nhiều phần tử trong 1 mảng
        System.out.println("How many elements of array?");
        // cho phép người dùng nhập mảng theo kiểu int
        int size = sc.nextInt();
        int intArray[] = new int[size];
        // Pass the array to the method: gọi ra pt để in ra màn hình số lg pt và gt tại index 3
        integerArrayDemo.createArray(intArray);
        System.out.println("mảng trc khi tăng dần:");
        integerArrayDemo.show(intArray);
        //sap xep mang
        integerArrayDemo.ascSort(intArray);
        //mang sau khi sap xep
        System.out.println("\n mảng sau khi tăng dần:");
        integerArrayDemo.show(intArray);
        System.out.println("mảng trước khi giảm dần:");
        integerArrayDemo.show(intArray);
        integerArrayDemo.descSort(intArray);
        System.out.println("mảng sau khi giảm dần:");
        integerArrayDemo.show(intArray);

        System.out.println("Length of array: " + intArray.length);
        System.out.println("Value at index 3: " + intArray[3]);
        // Call the method to sort the array: gọi phương thức sắp xếp mảng
        integerArrayDemo.minNumber(intArray);
        integerArrayDemo.maxNumber(intArray);
    }






    static void stringArrayDemo() {
        String stringArray[] = new String[5];
        stringArray[0] = "Thu";
        stringArray[1] = "thao";
        stringArray[2] = "vu";
        for (int i = 0; i < stringArray.length; i++) {
            System.out.printf("String array at %d: %s\n", i, stringArray[i]);
        }
    }
}
