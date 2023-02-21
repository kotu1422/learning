package en.codegym.task.pro.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Unpacking exceptions
*/

public class Solution {

    public static final String FAILED_TO_READ = "Unable to read file.";
    public static final String FAILED_TO_WRITE = "Unable to write to file.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        fileManager.copyFile("book.txt", "book_final_copy.txt");
        fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        //write your code here
    }
}
