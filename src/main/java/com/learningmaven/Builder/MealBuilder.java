package com.learningmaven.Builder;

import com.learningmaven.Builder.FoodItem.ChickenBurger;
import com.learningmaven.Builder.FoodItem.CokeDrink;
import com.learningmaven.Builder.FoodItem.FishBurger;
import com.learningmaven.Builder.FoodItem.TeaDrink;

public class MealBuilder {
    // CAN USE ABSTRACT FACTORY PATTERN HERE (???)

    public Meal prepareChickenBurgerMeal() {
        Meal meal = new Meal();

        meal.addFoodItem(new ChickenBurger());
        meal.addFoodItem(new CokeDrink());

        return meal;
    }

    public Meal prepareFishBurgerMeal() {
        Meal meal = new Meal();

        meal.addFoodItem(new FishBurger());
        meal.addFoodItem(new TeaDrink());

        return meal;
    }
}
