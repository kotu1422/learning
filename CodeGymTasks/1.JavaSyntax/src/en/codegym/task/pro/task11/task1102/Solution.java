package en.codegym.task.pro.task11.task1102;

/* 
Technical specification: Earth
*/

public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();
        Planet.name = "Earth";
        Planet.age = 4_540_000_000L;
        Planet.speed = 170_218;
        Planet.area = 510_072_000;
        earth.printInformation();
    }
}
