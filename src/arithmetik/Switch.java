package arithmetik;

public class Switch {

    public static void main(String[] args) {
        System.out.println(isWeekendss("Saturday"));
    }

    public static boolean isWeekendss(String weekday) {
        switch (weekday) {
            case "Saturday":
            case "Sunday":
                return true;
            default:
                return false;
        }
    }
}
