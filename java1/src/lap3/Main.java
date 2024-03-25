package lap3;

public class Main
{
    public static void main( String[] args){
        Car c = new LuxuryCar();
        //We can not use c.service()
        //But we can use downcasing to use
        ((LuxuryCar) c).service();
    }
}


