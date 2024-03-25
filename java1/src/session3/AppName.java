package session3;

public class AppName {
    public static void main(String[] args) {
        Dog quick= new Dog("Quick",5,120);
        System.out.println("Name:"+ quick.getName());
        System.out.println("Name:"+quick.getAnimalName());
        //The hien tinh da hinh
        PhuQuocDog Quick2 =new PhuQuocDog("PQDog",3,130);
        System.out.println("Animal name:" +Quick2.getAnimalName());
    }
}
