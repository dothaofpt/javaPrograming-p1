package lap5Ex2;

public class Triangle extends Shape{
    public double base;
    public double height;
    public Triangle(String color,double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea(){
      return 0.5 * base *height;
    }
}
