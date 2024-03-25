package session3;

public class Duck extends Animal{
    private int age;
private int height;
    public Duck( String name,int age, int height) {
        super(name);
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }




    @Override // thuc hien trien khai phuong thuc abstract
    public String getAnimalName(){
        return "Duck";
    }

    public static void main(String[] args) {
        Duck Vit= new Duck("Quac",200,300);
        System.out.println(Vit.getAnimalName());
    }
}
