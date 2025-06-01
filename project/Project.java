package project;

import java.util.Scanner;



public class Project {
    public static void main(String[] args) {
        System.out.println("Shape Calculator\n\n1. Calculate Circle Area and Perimiter\n2. Calculate Rectangle Area and Perimiter" + //
            "\n3. Calculate Triangle Area and Perimiter\n" + //
            "4. Exit\n\nEnter your choice : ");
         Scanner scanner = new Scanner(System.in);
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







    }
}
