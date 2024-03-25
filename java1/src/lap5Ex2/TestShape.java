package lap5Ex2;

public class TestShape {
    public TestShape() {
    }

        public static void main(String[] args){

         Shape hinhchunhat= new Rectangle("do",3,4) ;
         Shape hinhtamgiac= new Triangle("vang",4,5);
            System.out.println(hinhchunhat.getArea());
            System.out.println(hinhtamgiac.getArea());
    }
}
