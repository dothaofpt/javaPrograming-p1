// 1 lớp cũng có nhiều trường
public class Store6 {
    // tạo ra các trường đối tượng
    String productType;
    int inventoryCount;
    double inventoryPrice;
    //constructor method
    public Store6(String product,int count,double price){
        productType=product;
        inventoryCount=count;
        inventoryPrice=price;
    }
        //main method
        public static void main(String[] args){
            Store6 cookieShop= new Store6("Cookies",12,3.75);
        }
    

}
