package PrivateAndEncapsulation;
// lớp kiểm tra tài khoản
public class CheckingAccount{
    private String name;
    private int balance;
  // hàm tạo kiểm tra tài khoản
    public CheckingAccount(String inputName, int inputBalance){
      name = inputName;
      balance = inputBalance;
    }
  
    // thêm tiền vào số dư tk
    private void addFunds(int fundsToAdd){
      balance += fundsToAdd;
    }
  
    // read info
    private void getInfo(){
      System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }
  
    public static void main(String[] args){
      //tạo 1 Account
      CheckingAccount myAccount= new CheckingAccount("thao",20000000);
      System.out.println(myAccount.balance);
  // thêm số dư vào account
      myAccount.addFunds(5);
      System.out.println(myAccount.balance);
    }
  
  
  }

