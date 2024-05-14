package javaIfElse;

public class chanLe {
    int number;

    public chanLe(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;

    }
    public void chanHayLe(){
        if(number%2==0){
            System.out.println("La so chan");
        }else{
            System.out.println("La so le");
        }
    }

    public static void main(String[] args) {
        chanLe number= new chanLe(4);
        number.chanHayLe();
    }
}

