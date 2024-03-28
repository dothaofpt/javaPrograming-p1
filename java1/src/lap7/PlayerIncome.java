package lap7;

// PlayerIncome.java
class PlayerIncome extends Player implements Tax {
    private double income;

    public PlayerIncome(String name, double income) {
        super(name);
        this.income = income;
    }

    @Override
    public void displayDetails() {
        System.out.println("Player Name: " + name);
        System.out.println("Player Income: vnd" + income);
        System.out.println("Tax to be paid: vnd" + calculateTax(income));
    }

    @Override
    public double calculateTax(double income) {
        return income * TAX_PERCENT;
    }
}



