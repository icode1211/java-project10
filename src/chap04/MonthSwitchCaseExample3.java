package chap04;

public class MonthSwitchCaseExample3 {
    public static void main(String[] args) {
        String day = args[0];
        String message = switch (day) {
            case "월요일" -> "Start of the work week";
            case "금요일" -> "Almost weekend";
            case "화요일", "수요일", "목요일" -> "Midweek";
            case "토요일", "일요일" -> "Weekend";
            default -> "Invalid value";
        };
        System.out.println(message);
    }
}
