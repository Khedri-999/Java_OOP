

package Polymorphisme;
abstract class Shape{
     abstract double surface() ; 
     abstract double perimetre() ; 


     public void display(){
        System.out.println("La  surface est : "+surface());
        System.out.println("le perimetre est : "+perimetre());

     }
}

class Circle extends Shape {
    private double radius ; 
    
    public Circle(double radius ) {
        this.radius = radius ;
    }
    @Override
    double surface() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimetre() {
        return 2 * Math.PI * radius;
    }
   
}



public class TP3 {
    public static void display(Shape s) {
        System.out.println("les info sont :  ");
        s.display();
    }
    public static void main(String[] args) {

       
        Circle circle = new Circle(5);
        System.out.println("Cercle :");
        display(circle);
    }
}