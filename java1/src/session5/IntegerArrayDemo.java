package java1.src.session5;

import java.util.Scanner;

public class IntegerArrayDemo {
    Scanner scanner= new Scanner(System.in);
    //input element to array: tạo object scanner tạo đối tượng của mảng

    public  void createArray(int arr[]){
        // method tạo 1 mảng
        for(int i=0; i<arr.length; i++){
            System.out.println("Nhap pt mang tai "+i+":");
            arr[i]=scanner.nextInt();
        }

    }
    //output array
    public  void  show(int arr[]){
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i] + "\t");

    }
    public void ascSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    //gán arr[i] cho biến tạm temp
                    int temp = arr[i];
                    // gán hai giá trị arr[j] bằng của arr[i]
                    arr[i] = arr[j];
                    //gán giá trị cho temp vào arr[j] vì arr[j] gán gt arr[i]
                    arr[j] = temp;
                }
            }
        }

    }
    public void descSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    //gán arr[i] cho biến tạm temp
                    int temp = arr[i];
                    // gán hai giá trị arr[j] bằng của arr[i]
                    arr[i] = arr[j];
                    //gán giá trị cho temp vào arr[j] vì arr[j] gán gt arr[i]
                    arr[j] = temp;
                }
            }
        }

    }

    public void minNumber(int arr[]) {
        int min = arr[0]; // Khởi tạo min với giá trị của phần tử đầu tiên trong mảng
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Số nhỏ nhất là: " + min); // In ra giá trị của số nhỏ nhất
    }
    public void maxNumber(int arr[]) {
        int max = arr[0]; // Khởi tạo max với giá trị của phần tử đầu tiên trong mảng
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất là: " + max); // In ra giá trị của số nhỏ nhất
    }
}
