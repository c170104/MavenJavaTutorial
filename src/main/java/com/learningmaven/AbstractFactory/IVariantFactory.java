package com.learningmaven.AbstractFactory;

public interface IVariantFactory {
    public String getVariant();
    public ProductA createProductA();
    public ProductB createProductB();
}
