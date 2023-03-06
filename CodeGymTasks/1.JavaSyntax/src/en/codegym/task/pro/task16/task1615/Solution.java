package en.codegym.task.pro.task16.task1615;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/* 
Oh, so many methods!
*/

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        //write your code here

        return instant.plusSeconds(minutes*60);
    }

    static public Instant plusHours(Instant instant, long hours) {
        //write your code here

        return instant.plusSeconds(hours*3600);
    }

    static public Instant plusDays(Instant instant, long days) {
        //write your code here

        return instant.plusSeconds(days*86400);    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        //write your code here

        return instant.minusSeconds(minutes*60);    }

    static public Instant minusHours(Instant instant, long hours) {
        //write your code here

        return instant.minusSeconds(hours*3600);    }

    static public Instant minusDays(Instant instant, long days) {
        //write your code here

        return instant.minusSeconds(days*86400);    }
}
