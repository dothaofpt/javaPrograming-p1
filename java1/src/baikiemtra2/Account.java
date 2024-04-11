package baikiemtra2;


import java.util.Scanner;

class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount;

    public Account() {
        this.customerCode = "";
        this.customerName = "";
        this.accNumber = 0;
        this.amount = 0;
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
        do {
            System.out.print("Nhập mã khách hàng (5 ký tự): ");
            customerCode = scanner.nextLine();
        } while (customerCode.length() != 5);

        // Nhập tên khách hàng
        System.out.print("Nhập tên khách hàng: ");
        customerName = scanner.nextLine();

        // Nhập số tài khoản 6 chữ số bắt đầu bằng 100
        do {
            System.out.print("Nhập số tài khoản có 6 chữ số bắt đầu là 100: ");
            accNumber = scanner.nextInt();
        } while (!(accNumber >= 100000 && accNumber < 101000));

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
            if (money > amount) {
                System.out.println("Số tiền rút phải nhỏ hơn hoặc bằng số dư.");
            } else {
                amount -= money;
                System.out.println("Rút tiền thành công!");
            }
        } else {
            System.out.println("Cách thức giao dịch không hợp lệ.");
        }
    }

    public String toString() {
        return String.format("%s %s %d %d", customerCode, customerName, accNumber, amount);
    }
}







