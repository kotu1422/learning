package en.codegym.task.pro.task13.task1320;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString;
        if (monthIndex == 1) {
            monthString = "January";
        } else if (monthIndex == 2) {
            monthString = "February";
        } else if (monthIndex == 3) {
            monthString = "March";
        } else if (monthIndex == 4) {
            monthString = "April";
        } else if (monthIndex == 5) {
            monthString = "May";
        } else if (monthIndex == 6) {
            monthString = "June";
        } else if (monthIndex == 7) {
            monthString = "July";
        } else if (monthIndex == 8) {
            monthString = "August";
        } else if (monthIndex == 9) {
            monthString = "September";
        } else if (monthIndex == 10) {
            monthString = "October";
        } else if (monthIndex == 11) {
            monthString = "November";
        } else if (monthIndex == 12) {
            monthString = "December";
        } else {
            monthString = "Invalid month";
        }
        return monthString;
    }
}
