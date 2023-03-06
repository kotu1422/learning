package en.codegym.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Just not on Monday :)
*/

public class Solution {

    static Date birthDate = new Date(93, 00, 16);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String result = "";
        int dayNumber = date.getDay();
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 0:
                return "Sunday";
        }
        return result;
    }
}
