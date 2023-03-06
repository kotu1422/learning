package en.codegym.task.pro.task17.task1708;

/* 
Minimum and maximum
*/

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MinMaxUtil {
    public static int max(int n1, int n2){
        return Math.max(n1, n2);
    }
    public static int max(int n1, int n2, int n3){
        return Math.max(Math.max(n1,n2),n3);
    }
    public static int max(int n1, int n2, int n3, int n4){
        return Math.max(Math.max(Math.max(n1,n2),n3),n4);
    }
    public static int max(int n1, int n2, int n3, int n4, int n5){
        return Math.max(Math.max(Math.max(Math.max(n1,n2),n3),n4),n5);
    }

    public static int min(int n1, int n2){
        return Math.min(n1,n2);
    }
    public static int min(int n1, int n2, int n3){
        return Math.min(Math.min(n1,n2),n3);
    }
    public static int min(int n1, int n2, int n3, int n4){
        return Math.min(Math.min(Math.min(n1,n2),n3),n4);
    }
    public static int min(int n1, int n2, int n3, int n4, int n5){
        return Math.min(Math.min(Math.min(Math.min(n1,n2),n3),n4),n5);

    }
    //write your code here
}
