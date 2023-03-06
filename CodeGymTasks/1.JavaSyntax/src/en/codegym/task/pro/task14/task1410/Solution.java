package en.codegym.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Wrapping exceptions
*/

public class Solution {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
        }
        catch (Exception exp){
            throw new RuntimeException(exp);
            //write your code here
        }
        try {
            FileUtils.writeFile(destinationFile);
        }
        catch (Exception exp) {
            throw new RuntimeException(exp);
        }    
    }
}
