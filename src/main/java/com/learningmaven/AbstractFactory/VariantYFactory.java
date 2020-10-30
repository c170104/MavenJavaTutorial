package com.learningmaven.AbstractFactory;

public class VariantYFactory implements IVariantFactory {
    private final String variantType = "Variant Y";

    @Override
    public String getVariant() {
        return this.variantType;
    }

    @Override
    public ProductA createProductA() {
        return new ProductA();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB();
    }
}
