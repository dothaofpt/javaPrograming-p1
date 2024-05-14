package javaLoop;

public class TongSoChan {
    public static void main(String[] args) {

        int sum=0;
        int n=10;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum +=i;
            }
        }
        System.out.println("tong so chan:"+sum);
    }

    }

