import java.util.ArrayList;

class Lunch {
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
    // Add your code below
  
    for (int i = 0; i < lunchBox.size(); i++) {
      if (lunchBox.get(i) == "ant"){
        lunchBox.remove(lunchBox.get(i));
        i--;    
      }
    }

    return lunchBox;
  }
 /*Trong phần này, một vòng lặp được sử dụng để duyệt qua từng phần tử của danh sách.
Mỗi lần lặp, chúng ta kiểm tra xem phần tử hiện tại có phải là "ant" không.
 Nếu là, chúng ta loại bỏ phần tử đó khỏi danh sách bằng phương thức remove().
  Do vậy, chúng ta cần giảm chỉ số i đi 1 (i--) để không bỏ qua phần tử tiếp theo */
  
  public static void main(String[] args) {
    ArrayList<String> lunchContainer = new ArrayList<String>();
    lunchContainer.add("apple");
    lunchContainer.add("ant");
    lunchContainer.add("ant");
    lunchContainer.add("sandwich");
    lunchContainer.add("ant");
    lunchContainer = removeAnts(lunchContainer);
    System.out.println(lunchContainer);

  }
}