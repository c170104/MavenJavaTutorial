package com.learningmaven;

import com.learningmaven.AbstractFactory.AbstractFactoryPatternDemo;
import com.learningmaven.Builder.BuilderPatternDemo;
import com.learningmaven.Factory.FactoryPatternDemo;
import com.learningmaven.Observer.ObserverPatternDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Observer Pattern Demo
        ObserverPatternDemo.run();

        // Factory Pattern Demo
        FactoryPatternDemo.run();

        // Abstract Factory Pattern Demo
        AbstractFactoryPatternDemo.run();

        // Builder Pattern Demo
        BuilderPatternDemo.run();
    }

    public void references() {
        /*
            https://www.tutorialspoint.com/design_pattern/index.htm
            https://www.geeksforgeeks.org/abstract-factory-pattern/
            https://refactoring.guru/
         */
    }
}
