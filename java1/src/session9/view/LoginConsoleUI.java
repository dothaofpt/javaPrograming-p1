
package session9.view;

import session9.controller.LoginController;
import session9.entity.Users;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginConsoleUI {
    // fileds
    //Scanner được dùng để đọc dữ liệu từ bàn phím
    private final Scanner sc;
    // quản lý quá trình xác thực đăng nhập
    private final LoginController loginController;


    public LoginConsoleUI(Scanner sc) throws SQLException {
        this.sc = sc;
        this.loginController = new LoginController();
    }

    //Đây là 1 constructor dự phòng mà ko có ts đầu vào
    //nó gọi constructor đầu tiên bằng cách truyền 1 obj Scanner default
    public LoginConsoleUI() throws SQLException {
        this(new Scanner(System.in));
    }

    private int menu() {
        System.out.println("=====Admin zone");
        System.out.println("1. Login Statement");
        System.out.println("2. Login PreparedStatement");
        System.out.println("0.Exit");
        return Integer.parseInt(sc.nextLine());
    }

    private void loginStatementUI() throws SQLException {
        //hiển thị thông báo yc nhập tên
        System.out.print("Enter username:");
        //đọc tên người dùng từ bàn phím
        String username = sc.nextLine();
        //hiển thị thông báo yc nhập mật khẩu
        System.out.println("Enter password");
        //đọc mật khẩu từ bàn phím
        String password = sc.nextLine();
        //tạo obj vs tên và mk đã nhập
        Users users = new Users();
        users.setUsername(username);
        users.setPassword(password);
//        Gọi phương thức loginPreparedStatementController(users) của loginController
//        để xử lý việc đăng nhập và nhận kết quả.
        String result = loginController.loginStatementControler(users);
        //hiện kết quả lên màn hình
        System.out.println(result);
    }
// tương tự có điều nhưng câu lệnh truy vấn ở package model khác
    private void loginPreparedUI() throws SQLException {
        System.out.println("Enter username:");
        String username = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        Users users = new Users();
        users.setUsername(username);
        users.setPassword(password);
        String result = loginController.loginPreparedStatementController(users);
        System.out.println(result);
    }

    //thực hiện vòng lăp
    public void start() throws SQLException{
        while (true) {
            int choice = menu();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    loginStatementUI();
                    break;
                case 2:
                    loginPreparedUI();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        LoginConsoleUI loginConsoleUI = new LoginConsoleUI();
        loginConsoleUI.start();
    }
}
