package lap4Ex5;
//  V hình trụ =πr^2*h;
class Cylinder extends Circle {
   public double height;
   public Cylinder( double radius,String color,double height){
       super(radius,color);
    this.height=height;
   }

    public double getHeight() {
        return height;
    }



    public double getVolume() {
       return getArea()*height;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.0, "Blue", 5.0);

        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Color: " + cylinder.getColor());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Area : " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }

    @Override
    public double GetCircleRadius() {
        return 0;
    }
}



