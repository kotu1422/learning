package en.codegym.task.pro.task13.task1318;

/* 
Next month, please
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int passedMonthIndex = month.ordinal();
        if (passedMonthIndex==11){
            Month nextMonth = Month.values()[0];
            return nextMonth;
        } else {
            Month nextMonth = Month.values()[passedMonthIndex+1];
            return nextMonth;
        }
    }
}
