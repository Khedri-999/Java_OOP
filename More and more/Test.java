

import java.util.Scanner;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

interface Drawable {
    default void draw() {
        System.out.println("Drawing a shape");
    }
}

// Circle class implementing Shape and Drawable
class Circle extends Shape implements Drawable {
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

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle class implementing Shape and Drawable
class Rectangle extends Shape implements Drawable {
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

// Triangle class implementing Shape and Drawable
class Triangle extends Shape implements Drawable {
    private double a, b, c; // Three sides

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double perimeter() {
        return a + b + c;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Main class with user input
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a shape: \n1. Circle \n2. Rectangle \n3. Triangle");
        int choice = scanner.nextInt();
        
        Shape shape = null;
        Drawable drawable = null;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                drawable = (Drawable) shape;
                break;
                
            case 2:
                System.out.print("Enter length and width: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                drawable = (Drawable) shape;
                break;
                
            case 3:
                System.out.print("Enter three sides of the triangle: ");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                shape = new Triangle(a, b, c);
                drawable = (Drawable) shape;
                break;
                
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        // Display results
        drawable.draw();
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());

        scanner.close();
    }
}

