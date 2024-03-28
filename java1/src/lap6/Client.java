
package lap6;
//Phân biệt giữa unchecked và checked exceptions:
//Unchecked exceptions: Không cần phải được bắt hoặc khai báo trước khi sử dụng. Thường xảy ra do lỗi logic hoặc runtime.
//Checked exceptions: Phải được bắt hoặc khai báo trước khi sử dụng. Thường xảy ra trong các tình huống có thể dự đoán được như đọc/ghi tệp.
//Sử dụng checked và unchecked exceptions:
//Checked exceptions: Sử dụng khi có thể dự đoán được và có thể xử lý được tình huống lỗi.
//Unchecked exceptions: Sử dụng khi không thể dự đoán được và lỗi không thể được xử lý.
//Tại sao không nên sử dụng catch (Exception ex):
//Loại bỏ thông tin cụ thể về lỗi và gây khó khăn trong việc xác định vấn đề.
//Thay vào đó, nên bắt từng loại ngoại lệ cụ thể để xử lý chúng một cách hiệu quả.
public class Client {
    public Client() {
        // To do:
    }

    public void doUnchecked(String value) {
        try {
            int result = canThrowUncheckedException(value);
            System.out.println("result=" + result);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input:" + ex.getMessage());
        }
    }

 private   int canThrowUncheckedException(String value) {
        return Integer.parseInt(value);
    }

    public void doChecked() {
        try {
            canThrowCheckedException();
            System.out.println("OK");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void canThrowCheckedException() throws Exception {
        throw new Exception("Failure");
    }

    public static void main(String[] args) {
        Client kiemtra = new Client();
        kiemtra.canThrowUncheckedException("check");
        kiemtra.doUnchecked("123"); //bắt buộc chuyền vào 1 đối số

    }
}

