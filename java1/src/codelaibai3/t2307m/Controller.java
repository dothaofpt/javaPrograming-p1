
package codelaibai3.t2307m;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    // tạo biến số dư ban đầu là 1 triệu đồng
    private static long balanceNumber =1000000;
    //tạo list danh sách lịch sử đăng nhập
    static List <TransactionHistory> listHistory= new ArrayList<>();

    //lấy ra số dư
    public long getBalanceNumber(){
        return balanceNumber;
    }
    //phương thức các quy tắc trong chuyển khoản
    public static long transfer(long money){

    }

}

