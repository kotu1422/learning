package en.codegym.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Smallest element of an array
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int m = 2000000000;
        for (int i = 0; i < ints.length; i++) {
            m = Math.min(m,ints[i]);
        }
        return m;
    }

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = console.nextInt();
        }//write your code here
        return a;
    }
}
