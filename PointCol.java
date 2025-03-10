 public class PointCol extends Pointe {
    private String color ; 
    
   
    
    public PointCol (int x, int y , String color){
        super(x, y) ; 
        this.color = color ; 
    } 
    
    // public void colorise(){
    //     super.display();
    //     System.out.println(("Color is "+color)); 
    // }

    public void display(){
        System.out.println("The point is at in "+x+" and "+y +" with color  "+color);
       }
}
