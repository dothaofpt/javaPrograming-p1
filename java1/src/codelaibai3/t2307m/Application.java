package codelaibai3.t2307m;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        ValidateAccount validate= new ValidateAccount();
        Controller controller =new Controller();
        boolean isCheck =false;
        while(!isCheck){
            System.out.println("Nhap so dien thoai: ");
            String mobile=sc.nextLine();
            System.out.println("Nhap mat khau: ");
            String passworld=sc.nextLine();
            isCheck=validate.checkAccount(mobile,passworld);
        }
        while(true){
            menu();
            int choose =sc.nextInt();
            switch(choose){
                case 1:
                    System.out.println("So du:");
                    long balance =controller.getBalanceNumber();
                    System.out.println(Controller.formatMoney(balance));
                    break;
                case 2:
                    controller.actionTransfer();
                    break;
                case 3:
                    System.out.println("Lich su giao dich");
                    controller.getHistory();
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong co su lua chon nay");
                    break;
            }

        }


    }

    public static void menu() {
        System.out.println("Lua chon cua ban");
        System.out.println(("1:Xem so du tai khoan"));
        System.out.println("2:Chuyen khoan");
        System.out.println("3:Xem lich su giao dich ");
        System.out.println("0: Thoat ");
    }
}
