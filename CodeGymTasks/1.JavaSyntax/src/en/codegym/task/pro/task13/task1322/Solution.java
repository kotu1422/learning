package en.codegym.task.pro.task13.task1322;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCornerCount(3));
        System.out.println(getShapeNameByCornerCount(5));
        System.out.println(getShapeNameByCornerCount(1));
    }

    public static String getShapeNameByCornerCount(int cornerCount) {
        String shape;
        if (cornerCount == 3) {
            shape = "Triangle";
        } else if (cornerCount == 4) {
            shape = "Quadrangle";
        } else if (cornerCount == 5) {
            shape = "Pentagon";
        } else if (cornerCount == 6) {
            shape = "Hexagon";
        } else if (cornerCount == 7) {
            shape = "Heptagon";
        } else if (cornerCount == 8) {
            shape = "Octagon";
        } else {
            shape = "Other shape";
        }
        return shape;
    }
}
