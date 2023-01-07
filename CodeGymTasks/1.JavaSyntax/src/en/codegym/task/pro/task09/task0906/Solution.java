package en.codegym.task.pro.task09.task0906;

/* 
Binary converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binar="";
        if (decimalNumber<=0){
            return binar;
        }

        while (decimalNumber != 0) {
            binar = decimalNumber % 2 + binar;
            decimalNumber = decimalNumber / 2;
        }
        return binar;
    }

    public static int toDecimal(String binaryNumber) {
        int decimal= 0;
        if (binaryNumber == null){
            return decimal;
        }
        
        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimal += value * Math.pow(2, i);
        }
        return decimal;
    }
}
