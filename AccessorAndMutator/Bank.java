package AccessorAndMutator;
//lớp bank
public class Bank{
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;
  // hàm tạo 2 tài khoản
    public Bank(){
      accountOne = new CheckingAccount("Zeus", 100, "1");
      accountTwo = new CheckingAccount("Hades", 200, "2");
    }
  
    public static void main(String[] args){
        // tạo 1 object của bank
      Bank bankOfGods = new Bank();
      // lấy đọc tk của class checkAccount có biến balance là private = phương thức getter
      System.out.println(bankOfGods.accountOne.getBalance());
      bankOfGods.accountOne.setBalance(5000);
      // cập nhật viết tk của class checkAccount có biến balance là private = phương thức setter
      System.out.println(bankOfGods.accountOne.getBalance());
  
    }
  
  }

