package en.codegym.task.pro.task15.task1510;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Writing bytes to a file
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream))
        {
             Files.write(Path.of(scanner.nextLine()),bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

