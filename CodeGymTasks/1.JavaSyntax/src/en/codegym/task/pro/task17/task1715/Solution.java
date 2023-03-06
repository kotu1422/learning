package en.codegym.task.pro.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/* 
Mozartville and Chopintown
*/

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        //write your code here
    }

    public static void createStringedOrchestra() {
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());//write your code here
    }

    public static void playOrchestra() {
        for (MusicalInstrument instrument:orchestra){
            instrument.play();//write your code here
        }
    }
}
