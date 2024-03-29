package en.codegym.task.pro.task12.task1206;

/* 
Analyzing strings
*/

public class Solution {

    public static void main(String[] args) {
        String string = "I think this will be a new feature. " +
                "Just don't tell anyone that it was an accident.";

        System.out.println("Number of digits in the string: " + countDigits(string));
        System.out.println("Number of letters in the string: " + countLetters(string));
        System.out.println("Number of spaces in the string: " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int digits = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isDigit(chars[i])){digits++;}
        }
        return digits;
    }

    public static int countLetters(String string) {
        int letters = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLetter(chars[i])){letters++;}
        }
        return letters;
    }

    public static int countSpaces(String string) {
        int spaces = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isSpace(chars[i])){spaces++;}
        }
        return spaces;
    }
}
