package en.codegym.task.pro.task16.task1603;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Fixing the format
*/

public class Solution {

    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        System.out.println(formatter.format(date));
    }
}
