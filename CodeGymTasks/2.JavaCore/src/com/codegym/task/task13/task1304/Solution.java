package com.codegym.task.task13.task1304;

/* 
Selectable and Updatable

*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public static class Screen implements Updatable, Selectable{
        @Override
        public void refresh() {

        }

        @Override
        public void onSelect() {

        }
    }//write your code here
}
