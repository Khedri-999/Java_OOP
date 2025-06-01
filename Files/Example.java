package Files;


import java.io.* ;

public class Example {
    public static void main(String[] args) {
        String fileName = "Test.txt" ;
        String lineToWrite = "Hello world ! " ;

    // Writing in the File  
     try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
          writer.write(lineToWrite);
        }  
     catch(IOException e){
        System.out.println("The Error while Writing is  " + e.getMessage());
     }
   
 
    // Reading the File 
      try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line = reader.readLine();

        System.out.println("The Complete line is : " + line);

        System.out.println("By caracters : ");
        for(char c : line.toCharArray()){
            System.out.println(c);
        }

      } catch (Exception e) {
        System.out.println("The Error while Reading is  " + e.getMessage());
      }
}
}
