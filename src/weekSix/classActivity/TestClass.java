package weekSix.classActivity;

import weekSix.Car;

public class TestClass {
    public static void main(String[] args) {
        SandwichClass Sandwich = new SandwichClass("white","pepperjack","tomato");
        Sandwich.setMeats("chicken");
        Sandwich.setNumSandwich(2);
        Sandwich.displayInfo();
    }
}
