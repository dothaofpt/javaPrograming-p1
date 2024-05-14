package session9.entity;
//entity được coi như là 1 bảng trong dtb
//ở đây ta tạo ra 1 class(t/ư 1 bảng),constructor,method getter and setter
public class Customers {
    private int customer_id;
    private String first_name;
    private String last_name;
    private String email;


    public Customers(int customer_id, String first_name, String last_name, String email) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public Customers() {

    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

