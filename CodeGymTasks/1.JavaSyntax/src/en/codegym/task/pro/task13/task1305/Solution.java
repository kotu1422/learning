package en.codegym.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Find and neutralize
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> wordsFirstCopy = new ArrayList<>(words);
        ArrayList<String> wordsSecondCopy = new ArrayList<>(words);
        ArrayList<String> wordsThirdCopy = new ArrayList<>(words);

        removeBugWithFor(wordsFirstCopy);
        removeBugWithWhile(wordsSecondCopy);
        removeBugWithCopy(wordsThirdCopy);

        wordsFirstCopy.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        wordsSecondCopy.forEach(System.out::println);
        System.out.println(line);
        wordsThirdCopy.forEach(System.out::println);
        System.out.println(line);
    }
    public static String bug = "bug";
    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (bug.equalsIgnoreCase(str)){
                list.remove(str);
                i--;
            }

        }//write your code here
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            if (bug.equalsIgnoreCase(str)){
                iter.remove();//write your code here
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> arCopy = new ArrayList<>(list);
        for (String str : arCopy) {
            if (bug.equalsIgnoreCase(str)){
                list.remove(str);
            }

        }        //write your code here
    }
}
