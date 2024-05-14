package javaLoop;

public class NhanCacSo {
    public static void main(String[] args) {
        long n=20;
        long mutil=1;
        for(int i=1;i<=n;i++){
            mutil *=i;
        }
        System.out.println(mutil);
    }
}
