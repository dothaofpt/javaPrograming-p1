package session3;


public class Dog extends Animal {
    private int age;
    private int heigth;
    public Dog(String name,int age, int heigth) {
        // goi toi constructor cua lop cha
        // fields cua lop cha se duoc gan
        //constructor public Animal(String name) se dc goi va gan gt
        super(name);
        //sau do gia tri fields trong lop con dc gan
        this.age = age;
        this.heigth = heigth;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }



    @Override // thuc hien trien khai phuong thuc abstract
    public String getAnimalName(){
        return "Dog";
    }

    public static void main(String[] args) {
        Dog quick =new Dog("Quick",5,12);
        System.out.println("Name: " + quick.getName());
        System.out.println("Name: " + quick.getAnimalName());
        System.out.println(quick);

    }
}
