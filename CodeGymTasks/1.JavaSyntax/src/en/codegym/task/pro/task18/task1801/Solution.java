package en.codegym.task.pro.task18.task1801;

import java.util.ArrayList;

/* 
Two implementations of one interface
*/

public class Solution {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        list.add(runnable);//write your code here
    }

    public static void runList() {
        for (Runnable vehicle:list){
            vehicle.run();//write your code here
        }
    }
}