package en.codegym.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Sorting by age
*/

public class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge()- o1.getAge();
    }
    //write your code here
}
