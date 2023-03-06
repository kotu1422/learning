package en.codegym.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/* 
Time zone training
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> zones = new TreeSet<>();
        for (String s: ZoneId.getAvailableZoneIds())
        {
            zones.add(s);//write your code here
        }

        return zones;
    }

    static ZonedDateTime getBeijingDateTime() {

        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }
}
