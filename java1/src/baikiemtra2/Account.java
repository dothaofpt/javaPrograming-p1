package baikiemtra2;

import java.util.Scanner;

class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount;

    public Account() {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.accNumber = accNumber;
        this.amount = amount;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        // Nhập mã khách hàng với 5 ký tự

            System.out.print("Nhập mã khách hàng (5 ký tự): ");
            customerCode = scanner.nextLine();
         do{

         }while(customerCode.length() == 5);

        // Nhập tên khách hàng
        System.out.print("Nhập tên khách hàng: ");
        customerName = scanner.nextLine();

        // Nhập số tài khoản 6 chữ số bắt đầu bằng 100

            System.out.print("Nhập số tài khoản có 6 chữ số bắt đầu là 100: ");
            accNumber = scanner.nextInt();
        if(accNumber >= 1000000&&accNumber<101000){
           System.out.println("Nhập số tiền  thành công");
        }else{
            System.out.println("Nhập số tiền không thành công");

        }

        // Giá trị mặc định cho số dư là 0
        amount = 0;
    }


    public void depositAndWithdraw(long money, int type) {
        //type nếu là 0 thêm tiền vào tài khoản
        if (type == 0) {
            amount += money;
            System.out.println("Gửi tiền thành công!");
        } else if (type == 1) {
            //type nếu là 1 thì rút tiền ngân hàng
            if (money <= 0) {
                System.out.println("Số tiền phải lớn hơn 0.");
            } else if (money > amount) {
                System.out.println("Số tiền rút phải nhỏ hơn số dư.");
            } else {
                amount -= money;
                System.out.println("Rút tiền thành công!");
            }
        } else {
            System.out.println("  Cách thức rút tiền không hợp lệ.");
        }
    }

    public String toString() {
        return customerCode + " " + customerName + " " + accNumber + " " + amount;
    }
}





