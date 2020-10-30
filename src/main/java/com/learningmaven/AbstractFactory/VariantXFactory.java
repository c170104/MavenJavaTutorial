package com.learningmaven.AbstractFactory;

public class VariantXFactory implements IVariantFactory {
    private final String variantType = "Variant X";

    @Override
    public ProductA createProductA() {
        return new ProductA();
    }

    @Override
    public String getVariant() {
        return this.variantType;
    }

    @Override
    public ProductB createProductB() {
        return new ProductB();
    }
}
