package Localvariables;
// local variables
public class ScopeExample{
    public static void main(String[] args){
        // vì biến sum nằm ở phạm vi trong vòng lặp for
        //nên khi in ra sẽ lỗi vì in ra ngoài vòng lặp
        //vì vậy hãy khai báo biến sum ngoài vòng lặp
  int sum=0;
      int[] myArray = {1, 2, 3, 4};
      for(int i = 0; i < myArray.length; i++){
       
        sum += myArray[i];
      }
  
      System.out.println(sum);
    }
  }