package MASTERCLASS;

public class SecondAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(100, 55));
        System.out.println(getDurationString(10000));

    }
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && ((seconds >= 0) && (seconds <= 59))) {
            int hours = minutes / 60;
            minutes = minutes % 60;
            return hours + "h " + minutes + "m " + seconds + "s";
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }
}
