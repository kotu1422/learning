package com.codegym.task.task14.task1408;

/* 
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        int x = hen.getMonthlyEggCount();
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            switch (continent){
                case "North America":
                    return new NorthAmericanHen();
                case "Europe":
                    return new EuropeanHen();
                case "Asia":
                    return new AsianHen();
                case "Africa":
                    return new AfricanHen();}

            //write your code here
            return null;
        }
    }







}
