package en.codegym.task.pro.task08.task0809;

/* 
Counter

*/
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            if(i!=9){
                System.out.println(i+1);
                Thread.sleep(1, 300_000);
            } else {
                System.out.println(i+1);
            }

        }//write your code here
    }
}
