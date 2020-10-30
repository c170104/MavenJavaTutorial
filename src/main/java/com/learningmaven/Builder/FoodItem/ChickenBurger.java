package com.learningmaven.Builder.FoodItem;

import com.learningmaven.Builder.Packaging.IPackaging;
import com.learningmaven.Builder.Packaging.WrapperPackaging;

public class ChickenBurger extends BurgerFoodItem {
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public double getPrice() {
        return 6.50;
    }

    @Override
    public IPackaging getPackaging() {
        return new WrapperPackaging();
    }
}
