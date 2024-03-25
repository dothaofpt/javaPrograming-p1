package lap5Ex2;

abstract class Shape {
    public String color;

    public Shape(String color) {
        this.color = color;
    }
 public abstract double getArea();

    @Override
    public String toString() {
        return "0";
    }
}
