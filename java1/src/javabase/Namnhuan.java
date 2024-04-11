package javabase;

public class Namnhuan {
    int nam;

    public Namnhuan(int nam) {
        this.nam = nam;
    }
    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    public void cophainamnhuan(){
        if(nam==366){
            System.out.println("Nam nhuan");
        }else{
            System.out.println("Khong phai nam nhuan");
        }
    }

    public static void main(String[] args) {
        Namnhuan namnhuan=new Namnhuan(365);
        namnhuan.cophainamnhuan();
    }
}
