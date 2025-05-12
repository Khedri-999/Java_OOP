
import java.util.Scanner;
public class Try {

      
      public static void main(String[] args) {
        double a ;
        double b; 
        Scanner scanner = new Scanner(System.in) ; 
        System.out.println("Enter the first Value :  ");
        a = scanner.nextInt() ;
        System.out.println("Enter the Second Value :  ");
        b = scanner.nextInt() ;

        try {
            double result =( a / b ) ;
            System.out.println("The result is :  "+result ); 
        } catch (Exception ArithmeticException) {
            System.out.println("Warning You can't devide by Zero !");
        }
        
        finally{
           System.out.println(("This is the END"));
           scanner.close();
        }


      }

}
