// if then else if
public class Order3 {
    boolean isFilled;
    double billAmount;
    String shippping;
    
    public Order3(boolean filled, double cost,String shippingMethod) {
    if(cost>24.00) {
        System.out.println("High value item!");
    }
    isFilled= filled;
    billAmount= cost;
    shippping= shippingMethod;
    }
    public void ship() {
        if(isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost:" +calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }
    public double calculateShipping() {
        //declare conditional statement here
        if(shippping=="Regular"){
            return 0;
        }
        else if(shippping=="Express"){
            return 1.75;

        }
        else{
            return .50;
        }
    }
    public static void main (String[] args) {
        //do not alter the main method!
        Order3 book= new Order3(true,9.99,"Express");
        Order3 chemistrySet= new Order3(false,72.50,"Regular");
    }
}

