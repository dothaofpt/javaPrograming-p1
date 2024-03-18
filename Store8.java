
public class Store8 {
    // instance fields
    String productType;
    
    // constructor method
    public Store8(String product) {
      productType = product;
    }
    
    // advertise method phương thức tự tạo
    public void advertise() {
          System.out.println("Selling " + productType + "!");
      System.out.println("Come spend some money!");
    }
    
    // main method
    public static void main(String[] args) {
      Store8 lemonadeStand = new Store8("Lemonade");
      //Gọi phương thức bằng cách tham chiếu đến đt.phuongthuc
      lemonadeStand.advertise();
      lemonadeStand.advertise();
      lemonadeStand.advertise();
    }
  }