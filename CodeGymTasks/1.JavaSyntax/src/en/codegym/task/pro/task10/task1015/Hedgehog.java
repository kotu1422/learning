package en.codegym.task.pro.task10.task1015;

/* 
A hedgehog and an apple
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("The apple was eaten!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat(apple);//write your code here
    }

    public static class Apple {
    }
}
