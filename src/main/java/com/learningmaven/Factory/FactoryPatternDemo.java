package com.learningmaven.Factory;

public class FactoryPatternDemo {
    public static final void run() {
        ShapeFactory sf = new ShapeFactory();

        IShape circle = sf.getShape("circle");
        IShape triangle = sf.getShape("Triangle");
        IShape rectangle = sf.getShape("Rectangle");

        circle.draw();
        triangle.draw();
        rectangle.draw();
    }

    public void idea() {
        /*
            To create object without exposing creation logic to the client, and
            refer to newly created objects using a common interface (ShapeFactory)
         */
    }
}
