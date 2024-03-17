
public class Store3 {
    // declare instance fields here!
    String productType;
/*Lớp Store3 có 1 trường đối tượng(instance field) có tên là productType
 * là 1 biến dùng để lưu trữ loại sản phẩm của cửa hàng
 */
//constructor method
public Store3(){
System.out.println("I am inside the constructor method.");
//  khởi tạo phương thức dùng để gọi 1 đối tượng từ lớp
}
// main method
public static void main(String[] args) {
    System.out.println("This code is inside the main method.");
    Store lemonadeStand =new Store();
    System.out.println(lemonadeStand);
    /*Đối tượng của lớp Store được tạo ra bằng cách sử dụng từ khóa 'new'
     * 
     */
}
}
