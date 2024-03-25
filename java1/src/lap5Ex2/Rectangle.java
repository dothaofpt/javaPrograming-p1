package lap5Ex2;

public  class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public  double getArea(){
      return length*width;
    }
}
