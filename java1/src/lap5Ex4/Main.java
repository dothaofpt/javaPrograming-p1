package lap5Ex4;

public class Main {
    public static void main(String[] args){
        MovablePoint point= new MovablePoint(4,5,2,1);
        System.out.println(point.toString());
        MovableCircle Circle = new MovableCircle(4,5,6,7,8,point);
        System.out.println(Circle.toString());
    }
}
