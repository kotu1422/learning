package en.codegym.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Tuesday"));
        System.out.println(getTranslationForDayOfWeek("Friday"));
        System.out.println(getTranslationForDayOfWeek("Funday"));
    }

    public static String getTranslationForDayOfWeek(String en) {
        String pigLatin;
        switch (en.toLowerCase()) {
            case "monday":
                pigLatin = "Ondaymay";
                break;
            case "tuesday":
                pigLatin = "Uesdaytay";
                break;
            case "wednesday":
                pigLatin = "Ednesdayway";
                break;
            case "thursday":
                pigLatin = "Ursdaythay";
                break;
            case "friday":
                pigLatin = "Idayfray";
                break;
            case "saturday":
                pigLatin = "Aturdaysay";
                break;
            case "sunday":
                pigLatin = "Undaysay";
                break;
            default:
                pigLatin = "Invalid day of the week";
        }
        return pigLatin;
    }
}
