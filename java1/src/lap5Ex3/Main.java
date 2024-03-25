package lap5Ex3;

public class Main {
    public static void main (String[] args){
        MovablePoint point =new MovablePoint(3,4);
        point.display();

        point.moveUp();
        point.display();

        point.moveRight();
        point.display();

        point.moveDown();
        point.display();

        point.moveLeft();
        point.display();
    }
}
