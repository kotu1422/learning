package en.codegym.task.pro.task16.task1617;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* 
Globalization of time
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        globalTime = ZonedDateTime.of(localDateTime,zoneId);//write your code here

        System.out.println(globalTime);
    }
}
