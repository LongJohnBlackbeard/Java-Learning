package MASTERCLASS;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(0, 5));
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name, no player score.");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            inches = inches + (feet * 12);
            return inches * 2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches >= 0) {
            int feet = inches / 12;
            inches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        } else {
            return -1;
        }
    }
}

