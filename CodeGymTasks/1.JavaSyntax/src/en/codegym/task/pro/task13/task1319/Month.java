package en.codegym.task.pro.task13.task1319;

/* 
Months of the season
*/

import java.util.ArrayList;
import java.util.Collections;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    public static Month[] getWinterMonths() {
        Month[] season = new Month[3];//write your code here
        season[0]=Month.DECEMBER;
        season[1]=Month.JANUARY;
        season[2]=Month.FEBRUARY;
        return season;
    }
    public static Month[] getSpringMonths(){
        Month[] season = new Month[3];//write your code here
        season[0]=Month.MARCH;
        season[1]=Month.APRIL;
        season[2]=Month.MAY;
        return season;
    }

    public static Month[] getSummerMonths(){
        Month[] season = new Month[3];//write your code here
        season[0]=Month.JUNE;
        season[1]=Month.JULY;
        season[2]=Month.AUGUST;
        return season;
    }

    public static Month[] getAutumnMonths(){
        Month[] season = new Month[3];//write your code here
        season[0]=Month.SEPTEMBER;
        season[1]=Month.OCTOBER;
        season[2]=Month.NOVEMBER;
        return season;
    }

}
