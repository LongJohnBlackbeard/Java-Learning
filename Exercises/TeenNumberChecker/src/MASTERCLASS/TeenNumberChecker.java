package MASTERCLASS;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (isTeen(num1)) {
            return true;
        } else if (isTeen(num2)) {
            return true;
        } else return isTeen(num3);
    }

    public static boolean isTeen(int num1) {
        return num1 >= 13 && num1 <= 19;
    }

}
