package en.codegym.task.pro.task11.task1104;

/* 
String converter
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double x = Double.parseDouble(string);
        long y = Math.round(x);
        System.out.println(y);//write your code here
    }
}
