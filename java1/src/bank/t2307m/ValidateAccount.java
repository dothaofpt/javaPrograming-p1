package bank.t2307m;

//xác nhận tài khoản
public class ValidateAccount {
    //kiem tra dang nhap: đây là 1 tài khoản cụ thể vs sdt va mat khau chi tiet
    public final String MOBILE="0904999999";
    public final String PASSWORD="Ngo Van Khoai";
    public boolean checkAccount(String mobile,String passworld) {
       // Phương thức equals() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi.
        // Nếu hai chuỗi khác nhau nó trả về false.
        // Nếu hai chuỗi bằng nhau nó trả về true.
        if (mobile.equals(MOBILE)) {
            if(passworld.equals(PASSWORD)){
            System.out.println("Dang nhap thanh cong!");
            return true;

        } else {
            System.out.println("Mat khau sai ,vui long nhap lai");
            return false;
        }
    }else{
            System.out.println("Kiem tra lai so dien thoai hoac passworld");
            return false;
        }

    }
}
