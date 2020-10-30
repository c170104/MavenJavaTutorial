package com.learningmaven.Builder.FoodItem;

import com.learningmaven.Builder.Packaging.IPackaging;

public interface IFoodItem {
    public String getName();
    public double getPrice();
    public IPackaging getPackaging();
}
