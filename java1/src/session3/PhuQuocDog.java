package session3;

public class PhuQuocDog extends Dog{

    public PhuQuocDog(String name, int age, int height){
        super(name,age,height);
    }
    @Override //The hien theo cach ma doi tuong muon(Tinh da hinh trong OOP)
    public String getAnimalName() {
        return "PhuQuocDog";
    }

}
