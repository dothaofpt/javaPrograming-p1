//ôn tập biến và toán tử
public class BankAccount {
   public static void main (String[] args){
    double balance =1000.75;
    double amountToWithdraw =250;
    double updatedBalance= balance-amountToWithdraw;
    double amountforEachFriend = updatedBalance/3;
    boolean canPurchaseTicket = amountforEachFriend >=250;
    System.out.println(canPurchaseTicket);
    System.out.println("I gave each friend " + amountforEachFriend);
   } 
}
