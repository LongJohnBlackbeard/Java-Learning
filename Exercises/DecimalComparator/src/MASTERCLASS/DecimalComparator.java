package MASTERCLASS;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 *= 1000;
        num2 *= 1000;
        return (int) num1 == ((int) num2);
    }


}
