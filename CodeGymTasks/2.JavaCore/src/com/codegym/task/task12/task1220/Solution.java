package com.codegym.task.task12.task1220;

/* 
Human class and CanRun and CanSwim interfaces

*/

public class Solution {
    public static void main(String[] args) {

    }
    public abstract class Human implements CanRun, CanSwim{

    }
    public interface CanRun{
        void run();
    }
    public interface CanSwim{
        void swim();
    }
    // Add public interfaces and a public class here
}
