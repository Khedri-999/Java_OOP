package project;



public class Triangle extends Shape implements Drawable {
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
