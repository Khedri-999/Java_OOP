package project;

import Drawable;
import Shape;

public class Rectangle extends Shape implements Drawable {
    private double length, width;

    public Rectangle(double length, double width) {
     
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
