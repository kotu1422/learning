package en.codegym.task.pro.task18.task1803;

import java.util.Comparator;

/* 
CodeGym mentors
*/

public class NameComparator implements Comparator<CodeGymMentor>{
    @Override
    public int compare(CodeGymMentor o1, CodeGymMentor o2) {
        return o1.getName().length() - o2.getName().length();
    }
    //write your code here
}
