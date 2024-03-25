package publicKeyWord;

public class CheckingAccount{
    public String name;
    private int balance;// số dư trong tài khoản
    private String id;  //id của tài khoản
  
    public CheckingAccount(String inputName, int inputBalance, String inputId){
      name = inputName;
      balance = inputBalance;
      id = inputId;
    }
  // phương thức addFunds được sử dụng để thêm số tiền vào số dư tk
    public void addFunds(int fundsToAdd){
      balance += fundsToAdd;
    }
  // phương thức getInfo được sử dụng để in ra thông tin về tài khoản ,bao gồm tên chủ tk và số dư hiện tại
    public void getInfo(){
      System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }
  
  }