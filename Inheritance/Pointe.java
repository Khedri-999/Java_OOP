package Inheritance;
public class Pointe {
   protected int x ;
    protected int y;  
    public Pointe(int x , int y) {
     this.x = x ; 
     this.y = y ;
    } 
    public void display(){
     System.out.println("The point is on coordinate "+x+"and "+y);
    }
 
 }
