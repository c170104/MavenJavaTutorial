package com.learningmaven.Builder.FoodItem;

import com.learningmaven.Builder.Packaging.BottlePackaging;
import com.learningmaven.Builder.Packaging.IPackaging;

public class CokeDrink extends DrinkFoodItem {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public double getPrice() {
        return 2.20;
    }

    @Override
    public IPackaging getPackaging() {
        return new BottlePackaging();
    }
}
