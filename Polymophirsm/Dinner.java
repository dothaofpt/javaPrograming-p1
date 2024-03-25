package Polymophirsm;
// Sử dụng lớp con làm lớp cha
class Dinner {
  
     public void makeNoodles(Noodle noodle, String sauce) {
      
      noodle.cook();
      
      System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
      System.out.println("Dinner is served!");
      
    }
    
    public static void main(String[] args) {
      
      Dinner noodlesDinner = new Dinner();
      // Add your code here:
      Noodle2 biangBiang = new BiangBiang();
      noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
      // Trong phương thức main của lớp Dinner ,1 object 'Biang Biang' dc tạo từ lớp 'BiangBiang',
      //sau đó gọi phương thức makeNoodles() dc gọi để chuẩn bị mì và kết hợp với sốt
    }
    
  }
