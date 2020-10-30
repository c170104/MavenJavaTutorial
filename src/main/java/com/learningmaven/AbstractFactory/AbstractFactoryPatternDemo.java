package com.learningmaven.AbstractFactory;

public class AbstractFactoryPatternDemo {
    public final static void run() {
        IVariantFactory vfx;
        IVariantFactory vfy;

        vfx = new VariantXFactory();
        vfy = new VariantYFactory();

        IProduct productAX = vfx.createProductA();
        IProduct productAY = vfx.createProductB();

        IProduct productBX = vfy.createProductA();
        IProduct productBY = vfy.createProductB();

        productAX.display();
        productAY.display();
        productBX.display();
        productBY.display();
    }

    public void idea() {
        /*
            Similar to Factory Pattern, but allows variant (e.g product AX, AY, BX, BY)
         */
    }
}
