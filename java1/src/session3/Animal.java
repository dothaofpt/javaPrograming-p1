package session3;
//lop  Abstract dong vat
// lop nay co the chua 1 hoac nhieu abstract
// cho phep cac lop con thay doi va ke thua phuong thuc abstract
public  abstract class Animal {

    //fields
  private   String name;
  public  Animal(){
      //gan gia tri mac dinh cho name
      this.name=this.getAnimalName();
  }
    public Animal(String name) {
        this.name = name;
    }
  public String getName(){
      return name;
  }
  // abstract :đây là lớp trừu tượng có thể được "sửa" ở lớp con
    //lớp con có thể định nghĩa lại hành vi mà nó muốn
    // Thể hiện tc đa hình
    // Không chứa mã (code) bên trong
    //Nó phải thuộc lớp abstract
  public abstract String getAnimalName();
}
