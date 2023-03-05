package en.codegym.task.pro.task09.task0907;

/* 
Hexadecimal converter
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hex = "";
        String hexals = "0123456789ABCDEF";
        if (decimalNumber<=0){
            return hex;//write your code here
        }
        while (decimalNumber!=0){
            hex = hexals.charAt(decimalNumber%16)  + hex;
            decimalNumber = decimalNumber/16;
        }
        return hex;
    }

    public static int toDecimal(String hexNumber) {
        int decimal = 0;
        if (hexNumber=="" || hexNumber==null){
            return decimal;//write your code here
        }

        for (int i = 0; i < hexNumber.length(); i++) {
            decimal = 16*decimal + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimal;
    }
}
