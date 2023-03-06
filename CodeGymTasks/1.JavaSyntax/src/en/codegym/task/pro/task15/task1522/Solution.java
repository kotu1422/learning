package en.codegym.task.pro.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/* 
Getting information through an API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://codegym.cc/api/1.0/rest/projects");
        try (InputStream inputStream = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){
            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());//write your code here
            }
        }
    }
}