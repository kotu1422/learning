package en.codegym.task.pro.task17.task1703;

import java.util.ArrayList;

/* 
Space Odyssey Part 1
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        Astronaut h1 = new Human();
        Astronaut h2 = new Human();
        Astronaut d = new Dog();
        Astronaut c = new Cat();
        astronauts.add(h1);
        astronauts.add(h2);
        astronauts.add(c);
        astronauts.add(d);//write your code here
    }

    public static void printCrewInfo() {
        System.out.println("The following crew members are on board: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
