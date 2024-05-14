package baitap05.model;

import java.sql.Date;

public class KhachHang {
    private int id;
    private String hoVaTen;
    private Date ngaySinh;
    private String diaChi;

    public KhachHang(){
        super();
    }

    public KhachHang(int id, String hoVaTen, Date ngaySinh, String diaChi) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

}
