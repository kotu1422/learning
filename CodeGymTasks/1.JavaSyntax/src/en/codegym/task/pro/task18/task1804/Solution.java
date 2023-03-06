package en.codegym.task.pro.task18.task1804;

import java.util.ArrayList;
import java.util.Collections;

/* 
Introducing lambda expressions
*/

public class Solution {

    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers) {

        Collections.sort(numbers, (Integer i1,Integer i2) -> i1-i2);
    }
}
