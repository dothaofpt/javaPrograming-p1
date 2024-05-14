package javaIfElse;
import java.util.Scanner;
public class SoNguyenTo {
    public static void main(String[] args) {
int n=1000;
for(int i=1;i<n;i++){
    //check so nho hon 2
    if(i<=2){
        System.out.println("Khong phai so nguyen to");
    }
    if(i%2==0){
        System.out.println("Cung khong phai la so nguyen to");
    }else{
        System.out.println("La so nguyen to");
    }

}

    }
}
