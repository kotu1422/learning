package en.codegym.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Memory defragmentation
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int objectIndex = 0;
        String currObject;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=null){
                currObject = array[i];
                array[i]= null;
                array[objectIndex]=currObject;
                objectIndex+=1;
            }
        }//write your code here
    }
}
