package en.codegym.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Splitting an array
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        result[0]= Arrays.copyOfRange(array,0,(array.length%2==0? array.length/2:(array.length/2+1)));
        result[1]=Arrays.copyOfRange(array,(array.length%2==0? array.length/2:(array.length/2+1)),array.length);//write your code here
        System.out.println(Arrays.deepToString(result));
    }
}
