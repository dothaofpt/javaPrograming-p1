package lap7;

class TournamentIncome extends Player implements GradeBonus {
    private String grade;
    private double rate;

    public TournamentIncome(String name, String grade, double rate) {
        super(name);
        this.grade = grade;
        this.rate = rate;
    }

    @Override
    public void displayDetails() {
        double income = calculateIncome();
        double bonus = calculateGradeBonus(income);

        System.out.println("Player Name: " + name);
        System.out.println("Player Grade: " + grade);
        System.out.println("Income per match: $" + rate);
        System.out.println("Total Income: $" + income);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Earnings: $" + (income + bonus));
    }

    private double calculateIncome() {
        // Assuming 20 matches played for simplicity
        return rate * 20;
    }

    @Override
    public double calculateGradeBonus(double income) {
        return income * GRADE_BONUS_PERCENT;
    }
}


