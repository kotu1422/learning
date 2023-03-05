package en.codegym.task.pro.task10.task1004;

/* 
Need for speed
*/

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;//write your code here
    }

    public CarConcern(String model, int year) {
        this.color = "Orange";
        this.model = model;
        this.year = year;//write your code here
    }

    public CarConcern(String model) {
        this.year = 4321;
        this.color = "Orange";
        this.model = model;//write your code here
    }
}
