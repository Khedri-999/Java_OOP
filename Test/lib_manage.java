package Test;

abstract class Book {
       String title ; 
       String author ; 
       String ISBN ; 
       Boolean isBorrowed = false  ;

       // constructor
       public Book ( String title , String author,   String ISBN ,  Boolean isBorrowed ) {
        this.title = title ; 
        this.author = author ; 
        this.ISBN = ISBN ; 
        this.isBorrowed = isBorrowed ; 
       }
    
       abstract void displayInfo() ; 

       public void borrowBook(Boolean isBorrowed) {
            isBorrowed = true ;
            System.out.println("Borrowed Book "); 
       }
       public void returnBook(Boolean isBorrowed) {
            isBorrowed = false ;
            System.out.println("returned  Book "); 
       }
} 


 class FrictionBook extends Book {
     private String genre ;
     public FrictionBook(String title, String author, String ISBN, Boolean isBorrowed, String genre) {
              super(title, author, ISBN, isBorrowed);
              this.genre = genre ;   
     }

    @Override
    void displayInfo() {
        System.out.println(" details : "+title+ ","+author+","+ISBN+","+isBorrowed+","+genre);
    }

    

}
 class EducationalBook extends Book {
     private String subject ;
     public EducationalBook(String title, String author, String ISBN, Boolean isBorrowed, String subject) {
              super(title, author, ISBN, isBorrowed);
              this.subject = subject ;   
     }

    @Override
    void displayInfo() {
        System.out.println(" details : "+title+ ","+author+","+ISBN+","+isBorrowed+","+subject);
    }

    

}

class Library {
    ArrayList<Book> ;
    
    public addBook(Book book ){
        
    }
    
}

 












public class lib_manage {
    
}
