
package bank.t2307m;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private static long balanceNumber = 1000000; // Số dư ban đầu là 1 triệu
    static List<TransactionHistory> listHistory = new ArrayList<>();

    public long getBalanceNumber() {
        return balanceNumber;
    }

    public static long transfer(long money) {
        // Kiểm tra số tiền nếu nhỏ hơn 50000 thì thông báo
        if (money < 50000) {
            System.out.println("Số tiền chuyển tối thiểu phải là 50.000.");
            return balanceNumber;
        }

        // Kiểm tra số tiền chuyển lớn hơn số dư hiện tại
        if (money > balanceNumber) {
            System.out.println("Số dư không đủ để thực hiện giao dịch.");
            return balanceNumber;
        }

        // Thực hiện chuyển tiền
        balanceNumber -= money;
        System.out.println("Chuyển tiền thành công. Số dư hiện tại: " + formatMoney(balanceNumber));

        // Thêm lịch sử giao dịch mới
        TransactionHistory transaction = new TransactionHistory(money);
        listHistory.add(transaction);

        return balanceNumber;
    }

    public void getHistory() {
        // In danh sách lịch sử giao dịch
        System.out.println("Lịch sử giao dịch:");
        for (TransactionHistory transaction : listHistory) {
            System.out.println(transaction);
        }
    }

    public static String formatMoney(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        return formatter.format(money);
    }

    public void actionTransfer() {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập số tiền muốn chuyển
        System.out.print("Nhập số tiền bạn muốn chuyển: ");
        long moneyToTransfer = scanner.nextLong();

        // Thực hiện giao dịch chuyển tiền
        long newBalance = transfer(moneyToTransfer);

        // Cung cấp thông tin về kết quả giao dịch cho người dùng
        if (moneyToTransfer <= 0) {
            System.out.println("Số tiền chuyển không hợp lệ.");
        } else {
            System.out.println("Giao dịch chuyển tiền đã hoàn tất.");
            System.out.println("Số dư hiện tại: " + formatMoney(newBalance));
        }
    }
}

