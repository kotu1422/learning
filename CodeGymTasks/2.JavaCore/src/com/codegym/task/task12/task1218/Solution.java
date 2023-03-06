package com.codegym.task.task12.task1218;

/* 
Eat, fly, and move

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove{
        public void eat(){
            System.out.println("Dog eats");
        }
        public void move(){
            System.out.println("Dog moves");
        }
    }

    public class Duck implements CanFly, CanMove, CanEat {
        public void move(){
            System.out.println("Duck moves");
        }
        public void eat(){
            System.out.println("Duck eats");
        }
        public void fly(){
            System.out.println("Duck flies");
        }
    }

    public class Car implements CanMove{
        public void move(){
            System.out.println("Car moves");
        }
    }

    public class Airplane implements CanMove, CanFly{
        public void move(){
            System.out.println("Plane moves");
        }
        public void fly(){
            System.out.println("Plane flies");
        }
    }
}
