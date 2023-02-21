package en.codegym.task.pro.task14.task1412;

/* 
Grouping exceptions
*/

public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println("The program runs from the start");
            Thread.sleep(1000);
            System.out.println("until lunch");
        } catch (NullPointerException e) {
            System.out.println("A letter-N exception occurred");
        } catch (NumberFormatException e) {
            System.out.println("A letter-N exception occurred");
        } catch (IllegalArgumentException e) {
            System.out.println("A letter-I exception occurred");
        } catch (IllegalStateException e) {
            System.out.println("A letter-I exception occurred");
        } catch (ClassCastException e) {
            System.out.println("A letter-C exception occurred");
        } catch (InterruptedException e) {
            System.out.println("A letter-I exception occurred");
        }
    }
}
