package com.learningmaven.Builder;

import com.learningmaven.Builder.FoodItem.IFoodItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Meal {
    private List<IFoodItem> foodItems;

    public Meal() {
        this.foodItems = new ArrayList<>();
    }

    public void addFoodItem(IFoodItem foodItem) {
        this.foodItems.add(foodItem);
    }

    public void printTotalCost() {
        double totalPrice = 0.0;
        Iterator<IFoodItem> it = this.foodItems.iterator();

        while (it.hasNext()) {
            totalPrice += it.next().getPrice();
        }

         System.out.println(
                 String.format("Total Meal Cost: %.2f", totalPrice)
         );
    }

    public void showFoodItems() {
        Iterator<IFoodItem> it = this.foodItems.iterator();

        while(it.hasNext()) {
            IFoodItem foodItem = it.next();
            System.out.println(
                    String.format("Name: %s\nPrice: %.2f\nPackaging: %s",
                        foodItem.getName(),
                        foodItem.getPrice(),
                        foodItem.getPackaging().pack()
                    )
            );
        }
    }
}
