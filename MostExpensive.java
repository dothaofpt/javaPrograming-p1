// for-each trong java: tìm giá đắt nhất
import java.util.ArrayList;

class MostExpensive {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double mostExpensive = 0;
    
    // Iterate over expenses
    // khối lệnh chính
    for(double expense: expenses){
if(expense>mostExpensive){

}
mostExpensive=expense;
    }
    
    System.out.println(mostExpensive);
    
  }
  // khối lệnh chính
  
}
