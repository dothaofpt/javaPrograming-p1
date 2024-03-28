
package lap6;

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
