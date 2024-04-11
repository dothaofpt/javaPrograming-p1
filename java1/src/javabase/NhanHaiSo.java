package javabase;

public class NhanHaiSo {
    int a;
    int b;

    public NhanHaiSo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int nhanhaiso(){
     int sodanhan= a*b;
     return sodanhan;
    }

    public static void main(String[] args) {
        NhanHaiSo sonhan= new NhanHaiSo(3,4);
        sonhan.nhanhaiso();
    }
}
