
package lap7;

// TournamentIncome.java
public class TournamentIncome extends Player implements GradeBonus{
    String grade;
    int rate;

    public TournamentIncome(String name, String grade, int rate) {
        super(name);
        this.grade = grade;
        this.rate = rate;
    }

    @Override
    public double calculateGradeBonus(double income) {
        return income * rate;
    }
    @Override
    public void displayDetails(){

        System.out.println("His name" +name);
        System.out.println("His bonus" +calculateGradeBonus(3000));
        System.out.println("His grade" + "A");
    }

}