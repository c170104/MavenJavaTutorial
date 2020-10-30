package com.learningmaven.Builder.FoodItem;

import com.learningmaven.Builder.Packaging.IPackaging;
import com.learningmaven.Builder.Packaging.WrapperPackaging;

public class FishBurger extends BurgerFoodItem {
    @Override
    public String getName() {
        return "Fish Burger";
    }

    @Override
    public double getPrice() {
        return 7.90;
    }

    @Override
    public IPackaging getPackaging() {
        return new WrapperPackaging();
    }
}
