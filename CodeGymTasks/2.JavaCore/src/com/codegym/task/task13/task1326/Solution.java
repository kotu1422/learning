package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFile = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFile);


        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNextLine()){
            int x = Integer.parseInt(scanner.nextLine());
            if (x%2==0){
                assert false;
                list.add(x);
            }
        }
        Collections.sort(list);

        for (int i : list){
            System.out.println(i);
            //write your code here
        }
        scanner.close();
        fileInputStream.close();
    }
}
