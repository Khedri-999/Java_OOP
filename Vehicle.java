public class Vehicle {
    protected  String model ; 
    protected int year ; 
    public Vehicle (String model , int year ) {
        this.model = model ; 
        this.year = year ; 
    }

    public void displayInfo(){
        System.out.println(("Our car is "+model+ " Manufactored "+year ));
    }
    // Overloading 
    public String displayInfo(String model ){
            return model;
        
    }
}