package en.codegym.task.pro.task16.task1607;

import java.time.LocalDate;

/* 
Mastering a new API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        //write your code here

        return LocalDate.of(2020,9,12);
    }

    static LocalDate ofYearDayExample() {
        LocalDate whichDay = LocalDate.of(2020,9,12);//write your code here

        return LocalDate.ofYearDay(2020, whichDay.getDayOfYear());
    }

    static LocalDate ofEpochDayExample() {
        return LocalDate.ofEpochDay(18517);
    }
}
