public class Car extends Vehicle {

      public Car(String model, int year , int FuelEfficiency) {
              super(model, year);
              this.FuelEfficiency =FuelEfficiency ;
          }
      
        private  int FuelEfficiency ; 

    


      // Ovveriding
      @Override 
      public void displayInfo(){
           super.displayInfo();
           System.out.println("Its consumption is :  "+FuelEfficiency);
         
      
    }
}