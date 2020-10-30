package com.learningmaven.Builder;

public class BuilderPatternDemo {
    public static final void run() {
        MealBuilder mb = new MealBuilder();

        Meal cbMeal = mb.prepareChickenBurgerMeal();

        cbMeal.printTotalCost();
        cbMeal.showFoodItems();

    }

    public void idea() {
        /*
            To remove object construction (building) code and move it to builders object.

            This helps to organize object construction into steps, allowing controlled
            construction (able to select only necessary parts)
         */
    }
}
