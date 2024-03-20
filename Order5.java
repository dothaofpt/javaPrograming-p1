// switch case
public class Order5 {
    boolean isFilled;
    double billAmount;
    String shipping;
    //Các trường này đai diện cho thông tin về trạng thái của đơn hàng...
    public Order5(boolean filled,double cost, String shippingMethod){
        if (cost >24.00) {
            System.out.println("High value item!");
        }
        isFilled =filled;
        billAmount=cost;
        shipping=shippingMethod;
        // Constructor được sử dụng để khởi tạo 1 đối tượng 'Order5' vs các thông tin filled cost shippingMethod
    }
    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());

        }else {
            System.out.println("Order not ready");
        }
        //Phương thức Ship() kiểm tra đơn hàng đã dc thực thi, nó in ra thôgn  báo "Shipping" và chi phí vận chuyển tính bằng phương thức calculateShipping()
        // Nếu không nó in ra thông báo "Order not ready";
    }
    public double calculateShipping() {
        double shippingCost;
        //declare switch statement here
        switch(shipping) {
            case "Regular":
            shippingCost=0;
            break;
            case "Express":
            shippingCost=1.75;
            break;
            default:
            shippingCost=0.50;
        }
        return shippingCost;
        //Phương thức này tính toán chi phí vận chuyển dựa trên cách thức vận chuyển dc cung cấp
        //Sd câu lệnh switch để xác định chi phí vận chuyển cho mỗi loại phương thức và trả về giá trị tương ứng
    }
    public static void main (String[] args) {
        // do not alter the main method!
        Order5 book =new Order5(true, 9.99, "Express");
Order5 chemstrySet =new Order5(false, 72.50, "regular");
book.ship();
chemstrySet.ship();
    }
    //Phương thức main tạo ra hai đối tượng 'Order5' và gọi phương thức 'ship' trên mỗi đối tượng  để xem đơn hàng đã dc vận chuyển hay chưa
}
