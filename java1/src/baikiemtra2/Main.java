package baikiemtra2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.input();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập loại giao dịch (0 : gửi tiền, 1: rút tiền): ");
        int type = scanner.nextInt();

        System.out.print("Nhập số tiền giao dịch: ");
        long money = scanner.nextLong();

        account.depositAndWithdraw(money, type);

        System.out.println("Thông tin tài khoản: " + account.toString());
    }
}

