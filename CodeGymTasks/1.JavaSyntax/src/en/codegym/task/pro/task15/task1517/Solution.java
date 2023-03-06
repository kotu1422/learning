package en.codegym.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
File operations
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        if (Files.notExists(filePath)){
            Files.createFile(filePath);//write your code here
        } else if (Files.exists(filePath)&&Files.notExists(fileNewPath)){
            Files.move(filePath,fileNewPath);
        } else if (Files.exists(filePath)&&Files.exists(fileNewPath)){
            Files.delete(filePath);
        }

    }
}

