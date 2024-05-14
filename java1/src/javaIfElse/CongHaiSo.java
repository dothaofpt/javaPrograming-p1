
package javaIfElse;

public class CongHaiSo {
    float a;
    float b;

    public CongHaiSo(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public static float TongHaiSo(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Tong hai so: " + TongHaiSo(3, 4));
    }
}
