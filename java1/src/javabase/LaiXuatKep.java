package javabase;

public class LaiXuatKep {
//    Công thức lãi suất kép = P*(1+r/n)^n*t, trong đó:
//    - P = số tiền gốc (số tiền đầu tư ban đầu). - r = lãi suất danh nghĩa hàng năm. - n = số lần tiền lãi được nhập gốc mỗi năm
    //-t=Số năm mượn tiền
    double P;
    double r;
    double n;
    int t;

    public LaiXuatKep(double p, double r, double n,int t) {
        P = p;
        this.r = r;
        this.n = n;
        this.t=t;
    }

    public double getP() {
        return P;
    }

    public void setP(double p) {
        P = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void laixuatkepp(){
        double lai= P * Math.pow((1 + r/n), n * t);
        System.out.println(lai);
    }

    public static void main(String[] args) {
        LaiXuatKep laiXuatKep=new LaiXuatKep(100000,0.1,2000,2013);
        laiXuatKep.laixuatkepp();
    }
}
