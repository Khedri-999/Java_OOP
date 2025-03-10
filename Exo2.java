 class Parent {
    protected static String name ;  
        
            public Parent (String name) {
                this.name = name  ; 
            } 
        
            public void Intro(){
                System.out.println("The Parent is :  "+name) ;
            }
        }
        
         class Child extends Parent{
            private String nameChild ;
        
            public Child (String name , String nameChild) {
                super(name) ;
                this.nameChild=nameChild ; 
    } 
        
        public void Intro(){
        System.out.println("The Parent is : "+name+ "  It's child is : "+nameChild) ;
    }
}


public class Exo2 {
    public static void main(String[] args) {
        Parent p = new Child("Ammar", "Othmane") ; 
        p.Intro() ;
    }
}