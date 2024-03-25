
package lap5Ex3;

//khởi tạo 1 interface
interface Movable {
    // phương thức trìu tượng
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

//lớp triển khai phương thức trìu tượng
class MovablePoint implements Movable{
    //fields
    private int x;
    private int y;

    //Constructor
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //ghi đè phương thức ,triển khai phương thức trìu tg từ interface
    @Override
    public void moveUp() {
        y++;
        //khi gọi method moveUp y tăng lên 1 đơn vị
    }

    @Override
    public void moveDown() {
        y--;
        //khi gọi method moveDown y giảm xuống 1 đơn vị
    }

    @Override
    public void moveLeft() {
        x--;
        //khi gọi method moveLeft x sang trái(giảm 1 đơn vị)
    }

    @Override
    public void moveRight() {
        x++;
        // sang phải(tăng 1 đơn vị)
    }

    public int getX() {
        return x;

    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void display() {
        System.out.println("MovablePoint at (" + x + ", " + y + ")");
        // tránh việc viết in ra nhiều lần
    }
}
