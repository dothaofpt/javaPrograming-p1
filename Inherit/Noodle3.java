package Inherit;
// protected: cho phép lớp con truy cập
public class Noodle3 {
    private double lengthInCentimeters;
  private double widthInCentimeters;
  private String shape;
  protected String ingredients;
  private String texture = "brittle";
  
  Noodle3(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public final boolean isTasty() {
    
    return true;
    
  }
  
  public static void main(String[] args) {
    
    Ramen yasaiRamen = new Ramen();
    //System.out.println(yasaiRamen.ingredients);
    System.out.println(yasaiRamen.isTasty());
    
  }
}
