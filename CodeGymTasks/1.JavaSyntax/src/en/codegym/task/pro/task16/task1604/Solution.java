package en.codegym.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Day of the week when you were born
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1993,0,16);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String result = "";
        switch (calendar.get(Calendar.DAY_OF_WEEK)){
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";//write your code here
        }

        return result;
    }
}
