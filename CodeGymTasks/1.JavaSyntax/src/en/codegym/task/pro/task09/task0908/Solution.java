package en.codegym.task.pro.task09.task0908;

/* 
Binary to hexadecimal converter
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }
    public static String hexals = "0123456789abcdef";
    public static String[] binars = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
    public static String toHex(String binaryNumber) {
        String hex="";
        if (binaryNumber==null){
            return hex;
        }
        if (binaryNumber.length()%4==1){
            binaryNumber = "000"+binaryNumber;
        } else if (binaryNumber.length()%4==2){
            binaryNumber = "00"+binaryNumber;
        } else if (binaryNumber.length()%4==3){
            binaryNumber = "0"+binaryNumber;
        }

        for (int j = 0; j < binaryNumber.length()/4; j++) {
              int k = j*4;
              int l = k+4;
              String temp = binaryNumber.substring(k,l);
              hex = hex + hexals.charAt(Arrays.binarySearch(binars,temp));
        }

        return hex;

    }

    public static String toBinary(String hexNumber) {
        String binar = "";
        if (hexNumber == null) {
            return binar;
        }

        for (int i = 0; i < hexNumber.length(); i++) {
            binar = binar + binars[hexals.indexOf(hexNumber.charAt(i))];
        }

        return binar;
    }
}
