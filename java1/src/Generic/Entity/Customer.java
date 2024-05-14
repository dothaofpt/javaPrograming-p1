package Generic.Entity;

public class Customer extends Entity<Object> {
    private int customerID;
    private String customerName;
    private int customerPhone;
    private String customerEmail;

    public Customer(int customerID, String customerName, int customerPhone, String customerEmail) {
        super();
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;

    }

    public Customer() {

    }


    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", customerPhone=" + customerPhone +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }
}


