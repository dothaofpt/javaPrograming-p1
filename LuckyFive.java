//Introduction for java loops
//Vòng lặp while
import java.util.Random;
public class LuckyFive {
    public static void main(String[] args){
//Creating a random number gennerator
 Random randomGenerator =new Random();
// Generaate a number between 1 and 6
int dieRoll =randomGenerator.nextInt(6)+1;
//Repeat while roll isn't 5
while (dieRoll !=5){
    System.out.println(dieRoll);
    dieRoll = randomGenerator.nextInt(6) +1;
}
    }
}
