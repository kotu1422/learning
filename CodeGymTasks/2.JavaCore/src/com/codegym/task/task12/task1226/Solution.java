package com.codegym.task.task12.task1226;

/* 
Climb, fly, and run

*/

public class Solution {

    public static void main(String[] args) {

    }
    public interface CanFly{
        void fly();
    }
    public interface CanClimb{
        void climb();
    }
    public interface CanRun{
        void run();
    }
    public class Cat implements CanRun, CanClimb{
        @Override
        public void run() {

        }

        @Override
        public void climb() {

        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat{
        @Override
        public void climb() {
            super.climb();
        }

        @Override
        public void run() {
            super.run();
        }
    }

    public class Duck implements CanRun, CanFly{
        @Override
        public void run() {

        }

        @Override
        public void fly() {

        }
    }
}
