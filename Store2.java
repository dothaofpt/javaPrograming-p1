//Chi tiết về lớp 
public class Store2 {
    // new method:constructor!
    public Store2() {
        System.out.println("I am inside the constructor method");
    }
    //main method is where we create instances!
    public static void main(String[] args) {
        System.out.println("Start of the main method.");
        // create the instance below
        Store lemonadeStand=new Store();
        //print the instance below
        System.out.println(lemonadeStand);
    }
}
