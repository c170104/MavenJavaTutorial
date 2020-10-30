package com.learningmaven.Factory;

public class ShapeFactory {
    public IShape getShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "triangle":
                return new Triangle();
            case "rectangle":
                return new Rectangle();
            default:
                return new Circle();
        }
    }
}
