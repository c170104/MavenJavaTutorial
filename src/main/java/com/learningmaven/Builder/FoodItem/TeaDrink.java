package com.learningmaven.Builder.FoodItem;

import com.learningmaven.Builder.Packaging.CupPackaging;
import com.learningmaven.Builder.Packaging.IPackaging;

public class TeaDrink extends DrinkFoodItem {
    @Override
    public String getName() {
        return "Tea";
    }

    @Override
    public double getPrice() {
        return 1.0;
    }

    @Override
    public IPackaging getPackaging() {
        return new CupPackaging();
    }
}
