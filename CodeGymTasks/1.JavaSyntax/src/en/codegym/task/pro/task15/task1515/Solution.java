package en.codegym.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Absolute path
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(Path.of(str).isAbsolute() ? str : Path.of(str).toAbsolutePath());//write your code here
    }
}

