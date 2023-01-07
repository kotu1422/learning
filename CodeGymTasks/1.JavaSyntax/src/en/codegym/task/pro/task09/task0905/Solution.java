package en.codegym.task.pro.task09.task0905;

/* 
Octal converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int octal = 0;
        if (decimalNumber>=0) {
            int i = 0;
            while(decimalNumber>0){
                octal = (int)(octal + (decimalNumber%8) * Math.pow(10, i));
                decimalNumber = decimalNumber/8;
                i++;//write your code here
            }
            return octal;
        } else {
            return 0;
        }

    }

    public static int toDecimal(int octalNumber) {
        int decimal = 0;
        if (octalNumber>=0) {
            int i = 0;
            while(octalNumber>0){
                decimal = (int)(decimal + (octalNumber%10) * Math.pow(8, i));
                octalNumber = octalNumber/10;
                i++;//write your code here
            }
            return decimal;
        }else {
            return 0;
        }
    }
}
