package lap7;

public class PlayTest {
    public static void main(String[] args) {
        // Test PlayerIncome
        Player player1 = new PlayerIncome("John", 50);
        player1.displayDetails();

        // Test TournamentIncome
        TournamentIncome player2 = new TournamentIncome("Alice", "A", 0.1);
        player2.displayDetails();
    }
}



