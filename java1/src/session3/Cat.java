package session3;

public class Cat extends Animal{
    private int age;
    private int height;
    public Cat(String name, int age, int height) {
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
        return "Cat";
    }

    public static void main(String[] args) {
        Cat Sen= new Cat("meo",15,20);
        System.out.println(Sen.getAnimalName());
    }
}
