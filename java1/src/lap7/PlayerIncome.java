package lap7;
// PlayerIncome.java
 public  class PlayerIncome extends Player implements Tax{
     double income;

    public PlayerIncome(String name, double income) {

        super(name);
        this.income = income;
    }
   @Override
    void displayDetails(){
       System.out.println("His name:" + name);
       System.out.println("His imcome:" + income);
       System.out.println("His tax:" + calculateTax(income));
   }
   @Override
  public  double calculateTax(double income){
        return income* TAX_PERCENT;
   }
}

