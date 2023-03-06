package en.codegym.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Student performance
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("A",4.0);
        grades.put("B",4.4);
        grades.put("C",4.1);
        grades.put("D",3.0);
        grades.put("E",3.2);
        //write your code here
    }
}
