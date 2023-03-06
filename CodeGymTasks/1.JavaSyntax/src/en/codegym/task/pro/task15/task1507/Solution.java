package en.codegym.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Not all shall pass
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)){
            List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (int i = 0; i < list.size(); i+=2) {
                System.out.println(list.get(i));
            }
            //write your code here
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

