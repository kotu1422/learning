package en.codegym.task.pro.task18.task1810;

import java.util.ArrayList;
import java.util.Collections;

/* 
Convert a list to an array
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "You", "are", "a", "programmer");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);


        String[] stringArray = toStringArray(strings);
        for (String string : stringArray) {
            System.out.println(string);
        }

        Integer[] integerArray = toIntegerArray(integers);
        for (Integer integer : integerArray) {
            System.out.println(integer);
        }
    }

    public static String[] toStringArray(ArrayList<String> strings) {
        String[] stringArray = strings.toArray(String[]::new);//write your code here
        return stringArray;
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
        //write your code here
        return integers.toArray(Integer[]::new);
    }
}
