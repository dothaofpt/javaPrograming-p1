package javabase;
class SoPhuc {

    double thuc, ao;

    SoPhuc(double thuc, double ao) {

        this.thuc = thuc;

        this.ao = ao;

    }

    SoPhuc cong(SoPhuc sp) {

        return new SoPhuc(this.thuc + sp.thuc, this.ao + sp.ao);

    }

    public static void main(String[] args) {

        SoPhuc sp1 = new SoPhuc(2, 3);

        SoPhuc sp2 = new SoPhuc(1, 2);

        SoPhuc tong = sp1.cong(sp2);

        System.out.println("Tổng hai số phức là: " + tong.thuc + " + " + tong.ao + "i");

    }

}