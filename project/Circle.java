package project;

import Drawable;
import Shape;

public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    
    public void draw() {
        System.out.println("Drawing a Circle");
    }

}
