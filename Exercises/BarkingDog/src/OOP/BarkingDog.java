package OOP;

public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false, 7));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return (hourOfDay >= 0 && hourOfDay < 24) && (hourOfDay < 8 || hourOfDay > 22) && barking;
    }
}
