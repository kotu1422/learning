package en.codegym.task.pro.task13.task1320;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString;
        switch (monthIndex) {
            case 1:
                monthString = "January";
                return monthString;
            case 2:
                monthString = "February";
                return monthString;
            case 3:
                monthString = "March";
                return monthString;
            case 4:
                monthString = "April";
                return monthString;
            case 5:
                monthString = "May";
                return monthString;
            case 6:
                monthString = "June";
                return monthString;
            case 7:
                monthString = "July";
                return monthString;
            case 8:
                monthString = "August";
                return monthString;
            case 9:
                monthString = "September";
                return monthString;
            case 10:
                monthString = "October";
                return monthString;
            case 11:
                monthString = "November";
                return monthString;
            case 12:
                monthString = "December";
                return monthString;
            default:
                monthString = "Invalid month";
                return monthString;
        }
    }
}
