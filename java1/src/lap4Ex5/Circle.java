package lap4Ex5;

import java.lang.Math;
 public abstract class  Circle {
   public  double radius;
   public String color;
   Circle(double radius, String color){
      this.radius=radius;
      this.color=color;
   }
   public double getRadius(){
      return radius;
   }
   public String getColor(){
       return  color;
   }
public double getArea(){
       return Math.PI*radius*radius;
}
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract double GetCircleRadius();
}
