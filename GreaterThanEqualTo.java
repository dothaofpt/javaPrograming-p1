public class GreaterThanEqualTo {
    public static void main (String[] args){
        double recommendedWaterIntake = 8;
        double daysInChallenge =30;
        double yourWaterIntake =235.5;
        double totalRecommendAmount = recommendedWaterIntake*daysInChallenge;
         boolean isChallengeComplete = yourWaterIntake <= totalRecommendAmount;
         System.out.println(isChallengeComplete);
    }
}
