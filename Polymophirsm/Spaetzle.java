package Polymophirsm;

class Spaetzle extends Noodle {
  
    Spaetzle() {
      
      super(3.0, 1.5, "irregular", "eggs, flour, salt");
      this.texture = "lumpy and liquid";
      
    }
    
    // Add the new cook() method below:
    @Override
    public void cook() {
      System.out.println("Grinding or scraping dough.");
      System.out.println("Boiling.");
      
      this.texture = "cooked";
      //Phương thức cook() được ghi đè từ lớp cha.
      // Trong phương thức này, trước khi nấu mì, in ra màn hình thông báo "Grinding or scraping dough.",
      // sau đó thông báo "Boiling." và thay đổi độ bền của mì thành "cooked".
    }
    
  }