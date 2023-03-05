package en.codegym.task.pro.task05.task0514;

import java.util.Arrays;

/* 
Displaying two-dimensional arrays
*/

public class Solution {

    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        String s1 = Arrays.deepToString(strings);
        String s2 = Arrays.deepToString(ints);
        System.out.println(s1);
        System.out.println(s2);
    }
}
