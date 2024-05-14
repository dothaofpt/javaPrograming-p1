package baitap06.model;

public class Sach {
    private String id;
    private String tenSach;
    private float giaBan;
    private  int namXuatban;

    public Sach(String id, String tenSach, float giaBan, int namXuatban) {
        this.id = id;
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatban = namXuatban;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatban() {
        return namXuatban;
    }

    public void setNamXuatban(int namXuatban) {
        this.namXuatban = namXuatban;
    }

}
