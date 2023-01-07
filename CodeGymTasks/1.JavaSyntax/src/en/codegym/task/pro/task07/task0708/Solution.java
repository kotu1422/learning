package en.codegym.task.pro.task07.task0708;

/* 
Correct types
*/

public class Solution {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value){
        Solution.a = (byte) value;
        Solution.b = (short) value;//write your code here
        Solution.c = (int) value;
        Solution.d = value;
    }
}
