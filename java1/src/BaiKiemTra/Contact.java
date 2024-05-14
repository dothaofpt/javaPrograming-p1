package BaiKiemTra;

//tạo class liên lạc với thuộc tính name,company,email.phone
public class Contact {
    private String name;
    private String company;
    private String email;
    private int phone;

    //constructor
    public Contact(String name, String company, String email, int phone) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.phone = phone;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
